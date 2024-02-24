package view.Ex02;

import java.util.Map;
import java.util.OptionalLong;
import java.util.stream.Collectors;

public class Ex02 {
	public static void main(String[] args) {
		String str1 = "aaaababbbddc";
		String str2 = "aaaaccdcec";

		findCharMax(str1);
		findCharMax(str2);

	}

	private static void findCharMax(String str) {
		Map<Character, Long> countMap = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		OptionalLong maxCount = countMap.values().stream().mapToLong(c -> c).max();

		if (maxCount.isPresent()) {
			String mostFrequentChars = countMap.entrySet().stream()
					.filter(entry -> entry.getValue() == maxCount.getAsLong())
					.map(entry -> String.valueOf(entry.getKey())).collect(Collectors.joining(", "));

			System.out.println(mostFrequentChars);
		}
	}

}
