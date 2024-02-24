package view.stream.practice;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSOutput;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex01FilterDistinctLimit {

	public static void main(String[] args) {
		
		// Cho 1 danh sách các số nguyên [1,100]
		/*
		 1. Liệt kê những phần tử trong danh sách, ptu trùng nhau lấy 1 lần --> distinct
		 2. Liệt kê những phần tử xuất hiện 1 lần duy nhất trong danh sách
		 
		 Tổng quát: 
		 Liệt kê những phần tử xuất hiện 1 lần
		 Liệt kê những phần tử xuất hiện 2 lần
		 Liệt kê những phần tử xuất hiện 3 lần
		 Liệt kê những phần tử xuất hiện nhiều hơn 2 lần .............
		 
		 --> mỗi phần tử xuất hiện bao nhiêu lần,
		 --> 
		 */
		
		List<Integer> numbers = List.of(1,1,2,2,2,3,4);
		
		List<Integer> distinctNumbers = numbers.stream()
		       .distinct() // dùng theo cơ chế của hashcode/equals
		       .toList();
		CollectionUtils.generate("1. Distinct numbers", distinctNumbers);
		
		System.out.println("=================================================");
		
		List<String> elements = List.of("a","a","b","b","b","c","d");
		
		//groupingBy(Function<T,?>)
		Map<String, List<String>> groups = elements.stream()
		        .collect(Collectors.groupingBy(e -> e));
		
		Map<String, Long> counter = elements.stream()
		        .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
		CollectionUtils.generate("2. groups", groups);
		CollectionUtils.generate("3. counter", counter);
		
		System.out.println("==================== CÂU 2 =======================");
		
		String uniqueElement = counter.entrySet()
		       .stream()
		       .filter(e -> e.getValue() == 1)
		       .map(Entry::getKey)
		       .collect(Collectors.joining(" , "));
		
		System.out.println("4. unique elements: --> "+ uniqueElement);
		// distinct by key
		
		System.out.println("============ Distinct by key/ property =============");
		
		List<Dish> menu = DataModel.mockDishes();

		Set<String> nonOverlapNames = new HashSet<String>();

		List<Dish> distinctValues = menu.stream()
//	    		               .distinct() // equals, hashcode --> muốn distinct theo tt gì phải override, hashcode theo tt đó
//	    		                           // hạn chế: ko thể distinct theo 1 lúc nhiều yêu cầu
				.filter(d -> {
					String name = d.getName();
					if (!nonOverlapNames.contains(name)) {
						nonOverlapNames.add(name);
						return true;
					}
					return false;
				}).collect(Collectors.toList());

		CollectionUtils.generate("5. liệt kê các dĩa thức ăn ko trùng nhau theo thuộc tính! ", distinctValues);
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	
    
    

    
    
    
    
    
    
    
    
    
    
    
}
