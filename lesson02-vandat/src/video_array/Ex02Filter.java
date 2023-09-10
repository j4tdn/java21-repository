package video_array;

import java.util.Arrays;

/**
 * 1.tìm những phần tử lẽr trong mảng số nguyên
 * 		input: mảng
 * 		output: mảng số lẻ
 */
public class Ex02Filter {
	public static void main(String[] args) {
		int[] numbers = {11,24,32,43,57};
		int[] oddNumbers = findOddNumbers(numbers);
		
		System.out.println(Arrays.toString(oddNumbers));
	}
	
	private static int[] findOddNumbers(int[] elements) {
		int[] oddElements = new int[elements.length];
		int count = 0;
		for(int element: elements) {
			if(element % 2 != 0) {
				oddElements[count] = element;
				count++;
			}
		}
		int[] result = new int[count];
		for(int i = 0; i < count; i++)
			result[i] = oddElements[i];
		
		return result;
	}
}
