package view.stream.practice;

import static utils.CollectionUtils.generate;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Ex01FilterDistinctLimit {

	public static void main(String[] args) {
		/*
		 * Cho danh sách các số nguyên dương [1,100] 
		 * 1. Liệt kê các ptử trong ds, các ptử trùng nhau chỉ lấy 1 lần --> distinct 
		 * VD: 1,1,2,2,2,3,4
		 * 2. Liệt kê các ptử xuất hiện duy nhất 1 lần trong ds
		 * VD: a,a,b,b,b,c,d
		 * 
		 * Tổng quát:
		 * + Liệt kê các ptử xuất hiện duy nhất 1 lần
		 * + Liệt kê các ptử xuất hiện duy nhất 2 lần
		 * + Liệt kê các ptử xuất hiện nhiều hơn 1 lần
		 * 
		 * --> Mỗi ptử xuất hiện trong ds xuất hiện bao nhiêu lần [a,2],[b,3],[c,1],[d,1]
		 */

		List<Integer> numbers = List.of(1, 1, 2, 2, 2, 3, 4);
		
		List<Integer> distinctNumber = numbers.stream()
				.distinct() // dùng theo cơ chế của hashcode/equals
				.toList();
		
		generate("1. Liệt kê các ptử trong ds, các ptử trùng nhau chỉ lấy 1 lần", distinctNumber);
		
		// groupingBy(Function<T,?>)
		// List<Dish>   --> groupingBy(d -> d.getId()) --> Map<Integer, List<Dish>>
		// List<String> --> groupingBy(s -> s) 		   --> Map<Integer, List<String>>
		
		List<String> elements = List.of("a","a","b","b","b","c","d");
		// Map<String, List<String>> groups = elements.stream()  //Stream<String>
				// .collect(Collectors.groupingBy(e -> e));
		// System.out.println("groups --> " + groups);
		
		 Map<String, Long> counters = elements.stream()  	//Stream<String>
				 .collect(Collectors.groupingBy(e -> e, Collectors.counting()));	
		 
		 String uniqueElements = counters.entrySet() // SetEntry<String, Long>
				 .stream()							 // Stream<Entry<String, Long>>
				 .filter(e -> e.getValue() == 1)	 // Stream<Entry<String, Long>>
				 .map(Entry::getKey)				 // Stream<String> {c,d}
				 .collect(Collectors.joining(", ")); // --> {c,d}
		 
		 System.out.println("2. Liệt kê các ptử xuất hiện duy nhất 1 lần --> " + uniqueElements);
		 
		 // distinct by key/property
		
	}

}
