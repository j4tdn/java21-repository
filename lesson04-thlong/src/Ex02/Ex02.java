package Ex02;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {

		int[] numbers = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };
		int[] results = new int[numbers.length];
		int count = 0;
		int lenNumbers = numbers.length;

		for (int number : numbers) {
			if (number % 7 == 0 & number % 5 != 0) {
				results[count] = number;
				count++;
			} else if (number % 7 != 0 & number % 5 == 0) {
				results[lenNumbers - 1] = number;
				lenNumbers--;
			} else if (number % 7 == 0 & number % 5 == 0) {
				results[numbers.length / 2] = number;
			}
		}
		
		for (int number : numbers) {
			if (number % 7 != 0 & number % 5 != 0) {
				for (int i = 0; i < results.length; i++) {
					if (results[i] == 0) {
						results[i] = number;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(results));
	}
}
