package view;

import static utils.ArrayUtils.generate;

import java.util.Arrays;

public class Ex02ArrayCrud {

	public static void main(String[] args) {
		int[] numbers = { 2, 9, 3, 17, 7 };

		generate("0. Numbers", numbers);

		int[] added = add(numbers, 2, 88);

		generate("1. Number after add", added);

		int[] removed = remove(numbers, 3);
		generate("2. Number after remove", removed);

	}

	// Created ==> add(int[] origin, int pos, int newValue)
	public static int[] add(int[] origin, int pos, int newValue) {
		int length = origin.length;

		if (pos >= length || pos < 0) {
			System.out.println("Invaid Position");
			return origin;
		}

		int[] newArray = new int[length + 1];

		System.arraycopy(origin, 0, newArray, 0, pos);

		newArray[pos] = newValue;

		System.arraycopy(origin, pos, newArray, pos + 1, length - pos);

		return newArray;
	}

	public static int[] remove(int[] array, int pos) {
		if (pos < 0 || pos >= array.length) {
			System.out.println("Vị trí xóa phần tử không hợp lệ.");
			return array;
		}

		// Tạo mảng mới với kích thước nhỏ hơn
		int[] newArray = new int[array.length];

		// Sao chép các phần tử từ mảng cũ vào mảng mới trước vị trí xóa
		for (int i = 0; i < pos; i++) {
			newArray[i] = array[i];
		}

		// Sao chép các phần tử còn lại từ mảng cũ vào mảng mới
		for (int i = pos; i < newArray.length - 1; i++) {
			newArray[i] = array[i + 1];
		}

		return Arrays.copyOfRange(newArray, 0, newArray.length - 1);
	}
}
