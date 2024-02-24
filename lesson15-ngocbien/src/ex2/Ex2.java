package ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Ex2 {

	public static void main(String[] args) {
		List<String> input = getInput();

		List<String> result = getTheMostAppearChars(input);
		result.forEach(System.out::println);
	}

	private static List<String> getInput() {
		String input = "aaaaccdcec";
		List<String> inputProcessed = Arrays.asList(input.split(""));
		return inputProcessed;
	}

	private static List<String> getTheMostAppearChars(List<String> input) {
		List<String> result = new ArrayList<>();
		Map<String, Long> count = input.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		Long maxCount = count.entrySet().stream().map(Entry::getValue).sorted(Comparator.reverseOrder()).findFirst()
				.orElse(null);
		
		// check if any char have value coincidence
		result = count.entrySet().stream().filter(item -> item.getValue() == maxCount).map(Entry::getKey)
				.collect(Collectors.toList());
		
		return result;
	}
}