package view.stream.pratice;

import java.util.Arrays;
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

import static utils.CollectionUtils.*;
public class Ex01FilterDistinctLimit {

	public static void main(String[] args) {
		
		/* 
		 	Cho ds các số nguyên dương [1,100]
			1. Liệt kê các phần tử trong ds, các phần tử trùng nhau chỉ lấy 1 lần --> distinct
				--> chuyển sang Set
				--> dùng hàm distinct có trong stream
			
			2. Liệt kê các phần tử xuất hiện duy nhất 1 lần trong danh sách
			
				tổng quát:
				+ Liệt kê các phần tử xuất hiện duy nhất 1 lần
				+ Liệt kê các phần tử xuất hiện duy nhất 2 lần
				+ Liệt kê các phần tử xuất hiện duy nhất 3 lần
	
				--> mỗi phần tử trong ds xuất hiện bao nhiêu lần [a,2] [b,3] [c,1]
		*/
		
		List<Integer> numbers = List.of(1,1,2,2,2,3,4);
		
		List<Integer> distinctNumbers = numbers.stream()
			.distinct() // dùng theo cơ chế của hashcode/equals
			.toList();
		
		generate("1. Liệt kê các phần tử trong ds, các phần tử trùng nhau chỉ lấy 1 lần", distinctNumbers);
	
		List<String> elements = List.of("a", "a", "b", "b", "b", "c", "d");
//		Map<String, List<String>> groups = elements.stream()
//			.collect(Collectors.groupingBy(e -> e));
//		
//		System.out.println("groups --> " + groups);
		
		Map<String, Long> counters = elements.stream()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
			
		String uniqueElements = counters.entrySet()
			.stream()
			.filter(e -> e.getValue() == 1)
			.map(Entry::getKey)
			.collect(Collectors.joining(", "));
		
		System.out.println("Liệt kê các phần tủ xuất hiện duy nhất 1 lần --> " + uniqueElements);

		
		System.out.println("==== distinct by key/property =====");
		//distinct by key/property
		
		
		List<Dish> menu = DataModel.mockDishes();
		
		// duyệt từng phần tử trong menu
		// nếu phần tử nào có name chưa tồn tại trong nonOverlapNames
		// --> thảo mãn: lấy phần tử đó ra
		//				: đồng thời đưa name đó vào nonOverlapNames để lần sau xuất hiện nữa thì sẽ k lấy
	
		//List<Dish> distinctedValues = menu.stream()
				//.distinct() // equals, hashcode --> muốn distinct theo tt gì phải override equals, hashcode 
							// hạn chế: ko thể distinct theo 1 lúc nhiều yêu cầu
							// 		  : equals hashcode thường mình sẽ override theo tt dùng để phân biệt các đối sso
				 
				//.collect(Collectors.toList());
		generate("Danh sách đĩa thức ăn", menu);
		
		// cách 1: distinct by key (set, nếu có n ptu trùng nhau nó luôn chọn đầu tiên)
		generate("2. Liệt kê các đĩa thức ăn không trùng nhau theo thuộc tính ", 
				distintByKey(menu, d -> d.getName())); 
		
		// cach 2: dùng map để distinct danh sách theo thuộc tính, chọn dc phần tử đầu /cuối khi tt trùng nhau
		Collection<Dish> collection = menu.stream()
		.collect(Collectors.toMap(Dish::getName, Function.identity(), (e1, e2) -> e2)) // Map<String, Dish>
		.values();
		
		generate("2.2 lk  các đĩa thức ăn ko trùng nhau theo thuộc tính???", collection);
	}
	
	
	
	private static <T, R> List<T> distintByKey(List<T> elements, Function<T,R> keyExtractor){
		Set<R> nonOverlapKeys = new HashSet<>();
		
		return elements.stream()
				.filter(d -> nonOverlapKeys.add(keyExtractor.apply(d)))
				.collect(Collectors.toList());
	}
}
