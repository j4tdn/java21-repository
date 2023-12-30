package view.sorting;

import static utils.ArrayUtils.*;

import functional.Compare_Int;

public class Ex01BubbleSort_Int {
	public static void main(String[] args) {
		// BubbleSort: sau mỗi round thì phần tử lớn nhất nằm về bên phải
		int[] numbers = { 1, 5, 11, 9, 4, 6 };

		generate("1.Element", numbers);

		// khi e1 lớn hơn e2 thì hoán vị --> sắp xếp tăng dần
		sort(numbers, (e1, e2) -> e1 > e2);
		generate("Mang sau khi duoc sap xep tang dan la: ", numbers);

		sort(numbers, (e1, e2) -> e1 < e2);
		generate("Mang sau khi sap xep giam dan la: ", numbers);

	}

	private static void sort(int[] elements, Compare_Int compare) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				// nếu test(a[j], a[j+1]) return true -> hoán vị
				if (compare.test(elements[j], elements[j + 1])) {
					swap(elements, j, j + 1);
				}
			}
		}
	}

	private static void sortASC(int[] elements) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (elements[j] > elements[j + 1]) {
					swap(elements, j, j + 1);
				}
			}
		}
	}

	private static void sortDESC(int[] elements) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (elements[j] < elements[j + 1]) {
					swap(elements, j, j + 1);
				}

			}
		}
	}
}
