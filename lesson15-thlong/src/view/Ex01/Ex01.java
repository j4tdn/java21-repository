package view.Ex01;

import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

// em chọn đề 1

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		List<Integer> numbers2 = List.of(5, 7, 9, 10, 20, 9, 7, 7, 11);
		
		List<Integer> result1 = numbers1.stream()
										.collect(Collectors.groupingBy(n -> n, Collectors.counting()))
										.entrySet()
										.stream()
										.filter(n -> n.getValue() == 1)
										.map(Entry::getKey)
										.toList();
		System.out.println("Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy " + result1);
		
		
		List<Integer> result2 = numbers2.stream()
				.collect(Collectors.groupingBy(n -> n, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(n -> n.getValue() > 1)
				.map(Entry::getKey)
				.toList();
		System.out.println("Liệt kê các phần tử chỉ xuất hiện nhiều hơn một lần trong dãy " + result2);
												
	}
}
