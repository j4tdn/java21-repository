package view;

import java.util.Arrays;
import static utils.ArrayUtils.*;
import common.SortType;

public class Ex04Sorting {
	public static void main(String[] args) {
		// Tăng dần: Special => số âm tăng dần => số dương tăng dần => chuỗi tăng dần =>
		// null

		// Giảm dần: null => Giảm dần các chuỗi trong mảng => số dương giảm dần => số âm
		// giảm
		// dần => Special

		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };

		Sort(strings, SortType.ASC);

		System.out.println("String[asc]: " + Arrays.toString(strings));

		Sort(strings, SortType.DESC);

		System.out.println("String[desc]: " + Arrays.toString(strings));

	}

	private static void Sort(String[] elements, SortType sortType) {

		Arrays.sort(elements, (s1, s2) -> {

			if (s1 == null) {
				return 1;
			}

			if (s2 == null) {
				return -1;
			}

			if (s1.equals("Special")) {
				return -1;
			}

			if (s2.equals("Special")) {
				return 1;
			}

			try {
				Integer num1 = Integer.parseInt(s1);
				Integer num2 = Integer.parseInt(s2);
				return num1.compareTo(num2);

			} catch (Exception e) {
				return s1.compareTo(s2);
			}
		});

		if (sortType == SortType.DESC) {
			reverse(elements);
		}
	}

	private static void reverse(String[] elements) {
		for (int i = 0; i < elements.length / 2; i++) {
			swap(elements, i, elements.length - i - 1);
		}
	}

	private static void swap(String[] elements, int a, int b) {
		String temp = elements[a];
		elements[a] = elements[b];
		elements[b] = temp;
	}
}
