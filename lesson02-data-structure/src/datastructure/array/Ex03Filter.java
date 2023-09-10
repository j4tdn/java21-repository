package datastructure.array;

import java.util.Arrays;

/**
 * 1. Tìm những phần tử lẻ trong mảng số nguyên 
 * Input: Mảng 
 * Output: Mảng số lẻ
 *
 */

public class Ex03Filter {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int[] oddNumbers = findOddNumber(numbers);
		System.out.print(Arrays.toString(oddNumbers));
	}

	private static int[] findOddNumber(int[] elements) {
		int[] oddElement = new int[elements.length];
		int count = 0;
		for (int element : elements) {
			if (element % 2 != 0) {
				oddElement[count] = element;
				count++;
			}
		}

		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = oddElement[i];

		}

		return result;

	}

}
