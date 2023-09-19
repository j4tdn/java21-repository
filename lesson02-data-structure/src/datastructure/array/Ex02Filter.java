package datastructure.array;

import java.util.Arrays;

/**
 * 1. Tìm những phần tử lẻ trong mảng số nguyên
 * 	Input: mảng
 * 	Output: mảng số lẻ
 */
public class Ex02Filter {
	public static void main(String[] args) {
		int [] numbers = {1, 2, 3, 4, 5, 7};
		int[] oddNumber =  findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumber));
	}
	
	private static int[] findOddNumbers(int[] elements) {
		int[] oddElements = new int[elements.length];
		int count = 0;
		for (int element: elements) {
			if (element % 2 != 0) {
				oddElements[count] = element;
				count++;
			}
		}
		
		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = oddElements[i];
		}		
		return oddElements;
	}
}
