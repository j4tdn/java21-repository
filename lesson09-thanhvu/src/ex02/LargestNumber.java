package ex02;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LargestNumber {
	public static void main(String[] args) {
		String[] results = getLargestNumbers("01a2b3456cde478", "aa6b546c6e22h", "aa6b326c6e22h");
		for (String result : results) {
			System.out.println("Kết quả: " + result);
		}
	}

	public static String[] getLargestNumbers(String... ss) {
		String[] largestNumbers = new String[ss.length];

		for (int i = 0; i < ss.length; i++) {
			String str = ss[i];
			largestNumbers[i] = extractLargestNumber(str);
		}

		Arrays.sort(largestNumbers);
		return largestNumbers;
	}

	public static String extractLargestNumber(String s) {
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(s);
		long maxNumber = 0;

		while (matcher.find()) {
			long currentNumber = Long.parseLong(matcher.group());
			if (currentNumber > maxNumber) {
				maxNumber = currentNumber;
			}
		}

		return String.valueOf(maxNumber);
	}

}
