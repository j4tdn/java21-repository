package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> numbers = mockNumbers();
		List<Integer> nonduplicateNumbers = findNumbersWithCondition(numbers, index -> !isRepeated(numbers, index));
		List<Integer> duplicateNumbers = findNumbersWithCondition(numbers, index -> isRepeated(numbers, index));
		List<Integer> distinctDuplicateNumbers = duplicateNumbers.stream()
												.distinct()
												.collect(Collectors.toList());
		
		System.out.println("Những số chỉ xuất hiện 1 lần trong chuỗi: ");
		nonduplicateNumbers.forEach(number -> System.out.print(number + " "));
		
		System.out.println("\nNhững số xuất hiện nhiều hơn 1 lần trong chuỗi: ");
		distinctDuplicateNumbers.forEach(number -> System.out.print(number + " "));

	}
	
	private static List<Integer> findNumbersWithCondition(List<Integer> numbers, Predicate<Integer> pre) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < numbers.size(); i++) {
			if (pre.test(i)) {
				result.add(numbers.get(i));
			}
		}
		return result;
	}

	private static boolean isRepeated(List<Integer> numbers, int index) {
		int number = numbers.get(index);
		for (int i = 0; i < numbers.size(); i++) {
			if (i == index) {
				continue;
			}

			if (numbers.get(i) == number) {
				return true;
			}
		}
		return false;
	}

	private static List<Integer> mockNumbers() {
		List<Integer> tmp = new ArrayList<>();
		tmp.add(10);
		tmp.add(13);
		tmp.add(8);
		tmp.add(13);
		tmp.add(5);
		tmp.add(7);
		tmp.add(5);
		tmp.add(2);
		tmp.add(13);
		tmp.add(1);
		tmp.add(8);
		return tmp;
	}
}