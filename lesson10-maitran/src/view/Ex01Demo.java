package view;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Ex01Demo {

	/**
	 * Bài 1: Tạo mảng số nguyên ngẫu nhiên gồm n phần tử. Viết các phương thức:
	 * Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4} So sánh giá
	 * trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng Tìm số lớn
	 * thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng nhau VD: {7 8 8
	 * 8 6 2 5 1} Kết quả: 6
	 */
	public static void main(String[] args) {

		int n = 10;
		int[] array = new int[n];
		Random rd = new Random();

		for (int i = 0; i < n; i++) {
			array[i] = rd.nextInt(100);
		}

		System.out.println("\nFirst array: ");
		for (int i = 0; i < n; i++) {
			System.out.printf(array[i] + " ");
		}

		System.out.println("\nArray after removing duplicate elements: ");
		int[] array_remove = removeDuplicate(array);
		System.out.println(Arrays.toString(array_remove));

		System.out.println("\nCompare the average value of the first n/2 elements with the last n/2 elements: ");
		int middle = n / 2;
		int mean1 = calculateAverage(array, 0, middle);
		int mean2 = calculateAverage(array, middle, n);
		System.out.println(mean1 == mean2 ? mean1 + " = " + mean2
				: (mean1 < mean2 ? mean1 + " < " + mean2 : (mean1 + " > " + mean2)));

		System.out.println(" => 3rd largest number in the array: " + findThirdLargest(array));
	}

	public static int[] removeDuplicate(int[] array) {
		Set<Integer> set = new HashSet<>();
		for (int i : array) {
			set.add(i);
		}

		int[] newArr = new int[set.size()];
		int count = 0;
		for (int element : set) {
			newArr[count++] = element;
		}

		return newArr;
	}

	public static int calculateAverage(int[] array, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum += array[i];
		}

		return sum / (end - start);
	}

	public static int findThirdLargest(int[] array) {
		Arrays.sort(array);
		if (array.length < 3) {
			return -1;
		}
		System.out.println("\nSorted asc array: " + Arrays.toString(array));
		return array[array.length - 3];
	}

}
