package view;

import static utils.ArrayUtils.*;

import java.util.Arrays;

public class Ex01Array {
	
	public static void main(String[] args) {
		int[] arr = {7, 8, 8, 8, 6, 2, 5, 1};
		

        // Tìm số lớn thứ 3
        int thirdLargest = findThirdLargest(arr);
        System.out.println("Third largest element: " + thirdLargest);
		
	}
	
	// Tìm số lớn thứ 3 trong mảng
	private static int findThirdLargest(int[] arr) {
		int n = arr.length;

		if (n < 3) {
			return -1; // Trường hợp không có đủ số lớn thứ 3
		}

		Arrays.sort(arr);

		int count = 1;
		int thirdLargest = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] < thirdLargest) {
				thirdLargest = arr[i];
				count++;

				if (count == 3) {
					break;
				}
			}
		}

		return thirdLargest;
	}
}
