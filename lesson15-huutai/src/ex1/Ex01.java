package ex1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01 {	

	public static void main(String[] args) {
		
		Integer[] array = {1, 2, 3, 4, 5, 6, 5, 5, 3, 1};

        Map<Integer, Long> countMap = Arrays.stream(array)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        List<Integer> result = countMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Các phần tử chỉ xuất hiện một lần trong mảng: " + result);
		
        List<Integer> result2 = countMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // In kết quả
        System.out.println("Các phần tử xuất hiện nhiều hơn 1 lần trong mảng: " + result2);
	}
}
