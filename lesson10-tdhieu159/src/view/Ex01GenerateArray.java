package view;

import java.util.Arrays;

public class Ex01GenerateArray {

	public static void main(String[] args) {
		int[] arr = {7, 8, 8, 8, 6, 2, 5, 1};
		
		Arrays.sort(arr);
		
		int[] result = removeDuplicates(arr);
		
		System.out.println("1. Mảng có phần tử k trùng nhau: " + Arrays.toString(removeDuplicates(arr)));
	}
	
	private static int[] removeDuplicates (int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j] = arr[arr.length-1];
		int[] result = Arrays.copyOf(arr, j + 1);
		return result;
	}
}
