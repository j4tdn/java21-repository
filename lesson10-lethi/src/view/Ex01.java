package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 3, 1 };

		System.out.println("Loại bỏ các phần tử trùng nhau: " + Arrays.toString(removeDuplicates(arr)));

		System.out.println("Giá trị trung bình của n/2 phần tử đầu tiên: " + calculateAverageFirstHalf(arr));
		System.out.println("Giá trị trung bình của n/2 phần tử cuối cùng: " + calculateAverageSecondHalf(arr));

		System.out.println("Số lớn thứ 3 trong mảng: " + findThirdLargest(arr));
	}

	public static int[] removeDuplicates(int[] arr) {
		List<Integer> resultList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				resultList.add(arr[i]);
			}
		}
		int[] uniqueElements = new int[resultList.size()];
		for (int i = 0; i < resultList.size(); i++) {
			uniqueElements[i] = resultList.get(i);
		}
		return uniqueElements;
	}

	public static double calculateAverageFirstHalf(int[] arr) {
		int sum = 0;
		int count = arr.length / 2;
		for (int i = 0; i < count; i++) {
			sum += arr[i];
		}
		return (double) sum / count;
	}

	public static double calculateAverageSecondHalf(int[] arr) {
		int sum = 0;
		int count = arr.length / 2;
		for (int i = arr.length - count; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double) sum / count;
	}

	public static int findThirdLargest(int[] arr) {
		Arrays.sort(arr);
		int count = 0;
		int n = arr.length;
		for (int i = n - 1; i > 0; i--) {
			if (arr[i] != arr[i - 1]) {
				count++;
			}
			if (count == 2) {
				return arr[i - 1];
			}
		}
		return -1;
	}
}