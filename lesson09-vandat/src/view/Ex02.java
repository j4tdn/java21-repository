package view;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		String[] string1 = {"01a2b3456cde478"};
		System.out.print("Với n = 1 : xâu " + Arrays.toString(string1) + " : Kết quả: ");
		System.out.println(Arrays.toString(arrangeLargestNumbersInStrings(1, string1)));
		
		String[] string2 = {"aa6b546c6e22h", "aa6b326c6e22h"};
		System.out.print("Với n = 2 : xâu " + Arrays.toString(string2) + " : Kết quả: ");
		System.out.println(Arrays.toString(arrangeLargestNumbersInStrings(2, string2)));
		
		String[] string3 = {"aa6b54c6e22h", "01a2b3456cde478", "aa6b546c6e22", "6b6c6e22h"};
		System.out.print("Với n = 3 : xâu " + Arrays.toString(string3) + " : Kết quả: ");
		System.out.println(Arrays.toString(arrangeLargestNumbersInStrings(3, string3)));
	}
	
	private static long[] arrangeLargestNumbersInStrings(int n, String[] strings) {
		long[] numbers = new long[strings.length];
		int count = 0;
		for (String string:strings) {
			numbers[count++] = getLargestNumbers(string);
		}
		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings.length - 1 - i; j++) {
				if (numbers[j] > numbers[j+1]) {
					long temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		return numbers;
	}
	
	private static long getLargestNumbers(String s) {
		String[] numbers = s.split("[a-zA-Z]+");
		long max = 0;
		for (String number:numbers) {
			try {
				max = Integer.parseInt(number) > max ? Integer.parseInt(number) : max;
			} catch (NumberFormatException e) {
			}
		}
		return max;
	}
}
