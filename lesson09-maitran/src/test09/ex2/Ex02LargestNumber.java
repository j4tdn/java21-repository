package test09.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex02LargestNumber {
	public static void main(String[] args) {
		List<Integer> numbersList = new ArrayList<>();
		String[] arrTexts = { "@@@aa6b546c6e22h", "aa6b326c6e22h", "01a2b3456cde478" };
		for (String arrText : arrTexts) {
			numbersList.add(getMaxNumberInString(arrText));
		}
		
		Collections.sort(numbersList);
		System.out.println("Result: " + numbersList);
	}

	private static int getMaxNumberInString(String text) {
		String[] numbersFromText = text.split("\\D+");
		numbersFromText = Arrays.stream(numbersFromText).filter(s -> !s.isEmpty()).toArray(String[]::new);
		return max(numbersFromText);
	}

	private static int max(String[] numbersFromText) {
		int max = 0;
		for (String numberFromText : numbersFromText) {
			int number = Integer.parseInt(numberFromText);
			if (max < number) {
				max = number;
			}
		}
		return max;
	}
}
