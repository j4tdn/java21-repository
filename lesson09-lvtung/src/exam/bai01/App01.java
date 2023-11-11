package exam.bai01;

import java.util.Arrays;

public class App01 {
	public static void main(String[] args) {
		int[] array1 = { 2, 8, 9, 1, 6 };
		int[] array2 = { 2, 1, 1, 8, 9 };

		int[] commonElements = findCommonElements(array1, array2);

		System.out.print("Các phần tử chung là: ");
		for (int element : commonElements) {
			System.out.print(element + " ");
		}
	}

	private static int[] findCommonElements(int[] array1, int[] array2) {
		Arrays.sort(array1);
		Arrays.sort(array2);

		int maxLength = Math.min(array1.length, array2.length);
		int[] result = new int[maxLength];

		int i = 0, j = 0, index = 0;

		while (i < array1.length && j < array2.length) {
			if (array1[i] == array2[j]) {
				result[index++] = array1[i];
				i++;
				j++;
			} else if (array1[i] < array2[j]) {
				i++;
			} else {
				j++;
			}
		}

		// Chuyển mảng result về mảng mới có độ dài chính xác
		return Arrays.copyOf(result, index);
	}
}
