package Test02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {

		String[] results = getLargestNumbers("01a2b3456cde478", "aa6b546c6e22h", "aa6b326c6e22h");
		System.out.println(Arrays.toString(results));
	}

	public static String[] getLargestNumbers(String... ss) {
		List<String> result = new ArrayList<>();

		for (String s : ss) {

			Matcher matcher = Pattern.compile("\\d+").matcher(s);
			List<String> numbers = new ArrayList<>();
			while (matcher.find()) {
				numbers.add(matcher.group());
			}

			if (numbers.isEmpty()) {
				result.add("0");
			} else {

				String maxNumber = findMaxNumber(numbers);
				result.add(maxNumber);
			}
		}

		return result.toArray(new String[0]);
	}

	private static String findMaxNumber(List<String> numbers) {
		numbers.sort((s1, s2) -> {
			if (s1.length() != s2.length()) {
				return Integer.compare(s2.length(), s1.length());
			}
			return s1.compareTo(s2);
		});

		return numbers.get(0);
	}
}
