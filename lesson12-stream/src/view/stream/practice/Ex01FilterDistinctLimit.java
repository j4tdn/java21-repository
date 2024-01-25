package view.stream.practice;

import static utils.CollectionUtils.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex01FilterDistinctLimit {
	
	public static void main(String[] args) {
		
		/*
		 Cho danh sách các số nguyên dương [1,100]
		 
		 1. Liệt kê các phần tử trong danh sách, các phần tử trùng nhau chỉ lấy 1 lần --> distinct
		    VD: 1,1,2,2,2,3,4 --> 1,2,3
		    --> chuyển sang Set
		    --> dùng hàm distinct có trong stream 
		 
		 2. Liệt kê các phần tử xuất hiện duy nhất 1 lần trong danh sách
		    VD: a,a,b,b,b,c,d --> c,d
		    
		    Tổng quát: 
		    + Liệt kê các phần tử xuất hiện duy nhất 1 lần
		    + Liệt kê các phần tử xuất hiện duy nhất 2 lần
		    + Liệt kê các phần tử xuất hiện nhiều hơn 1 lần
		    
		    --> mỗi phần tử trong danh sách xuất hiện bao nhiêu lần [a,2] [b,3] [c,1] [d,1]
		    --> 
		 */
		
		List<Integer> numbers = List.of(1,1,2,2,2,3,4);
		
		List<Integer> distinctNumbers = numbers.stream()
			.distinct() // dùng theo cơ chế của hashcode/equals
			.toList();
		
		generate(
			"1. Liệt kê các phần tử trong danh sách, các phần tử trùng nhau chỉ lấy 1 lần",
			distinctNumbers
		);
		
		// groupingBy(Function<T, ?>)
		// List<Dish>   --> groupingBy(d -> d.getId()) --> Map<Integer, List<Dish>>
		// List<String> --> groupingBy(s -> s)         --> Map<String, List<String>>
		
		List<String> elements = List.of("a", "a", "b", "b", "b", "c", "d");
		// Map<String, List<String>> groups = elements.stream() // Stream<String>
		// 	.collect(Collectors.groupingBy(e -> e));
		// System.out.println("groups --> " + groups);
		
		Map<String, Long> counters = elements.stream() // Stream<String>
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
		String uniqueElements = counters.entrySet() // Set<Entry<String, Long>
				.stream() // Stream<Entry<String, Long>
				.filter(e -> e.getValue() == 1) // Stream<Entry<String, Long>
				.map(Entry::getKey) // Stream<String> {c, d}
				.collect(Collectors.joining(", ")); // --> "c, d" 
		
		System.out.println("Liệt kê các phần tử xuất hiện duy nhất 1 lần --> " + uniqueElements);
		
		System.out.println("\n============ distinct by key/property ============\n");
		
		List<Dish> menu = DataModel.mockDishes();
		
		// Duyệt từ phần tử trong menu
		// Nếu phần tử nào có name chưa tồn tại trong nonOverlapNames
		// --> thỏa mãn: lấy phần tử đó ra
		//             : đồng thời đưa name đó vào nonOverlapNames để lần sau xuất hiện nữa thì sẽ k lấy
		
		
		// List<Dish> distinctValues = menu.stream()
			// .distinct() // equals, hashcode --> muốn distinct theo tt gì phải override equals, hashcode theo tt đó
			            // hạn chế:  ko thể distinct theo 1 lúc nhiều yêu cầu
            			//        : equals hashcode thường mình sẽ override theo tt dùng để phần biệt các đối tượng 
			// .collect(Collectors.toList());
		
		generate(
			"2. Danh sách đĩa thức ăn",
			menu
		);
		
		// Cách 1: Distinct by key (set, nếu có n ptu trùng nhau nó luôn chọn thằng đầu tiên)
		generate(
			"2.1 Liệt kê các đĩa thức ăn không trùng nhau theo thuộc tính ???",
			distintByKey(menu, Dish::getName)
		);
		
		// Function<T, T> f = d -> d <--> Function.identity() 
		
		// Cách 2: Dùng map để distinct danh sách theo thuộc tính, chọn đc phần tử đầu/cuối khi tt trùng nhau
		Collection<Dish> collection = menu.stream() // Stream<Dish>
			.collect(Collectors.toMap(Dish::getName, Function.identity(), (e1, e2) -> e2)) // Map<String, Dish>
			.values();
		
		generate(
			"2.2 Liệt kê các đĩa thức ăn không trùng nhau theo thuộc tính ???",
			collection
		);
	}
	
	// static method
	// Function<T, T> f = ClassName.itself();
	private static <T> Function<T, T> itself() {
		return t -> t;
	}
	
	// static method reference
	// Function<T, T> f = ClassName::itself;
	private static <T> T itself(T t) {
		return t;
	}
	
	private static <T, R> List<T> distintByKey(List<T> elements, Function<T, R> keyExtractor) {
		Set<R> nonOverlapKeys = new HashSet<>();
		
		return elements.stream()
				.filter(d -> nonOverlapKeys.add(keyExtractor.apply(d)))
				.collect(Collectors.toList());
	}
	
}
