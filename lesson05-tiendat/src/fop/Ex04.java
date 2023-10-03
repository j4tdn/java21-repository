package fop;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 8, 9, 2, 5, 9 };
		int[] arr2 = { 4, 2, 6, 6, 4, 15, 1 };

		System.out.println("Tổng arr1: " + sum(arr1));
		System.out.println("Tổng arr2: " + sum(arr2));
	}

	public static int sum(int[] arr) {
		if (arr.length <= 2) {
			return 0;
		}

		// Sắp xếp mảng để lấy phần tử nhỏ nhất và lớn nhất ở hai đầu mảng.
		Arrays.sort(arr);

		int sum = 0;

		// Bắt đầu từ phần tử thứ 1 đến phần tử thứ n-2 để tính tổng các phần tử không
		// trùng nhau.
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] != arr[i - 1] && arr[i] != arr[0] && arr[i] != arr[arr.length - 1]) {
				sum += arr[i];
			}
		}

		return sum;
	}
}
