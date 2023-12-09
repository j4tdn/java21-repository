package view.sorting;

import static utils.ArrayUtils.*;

import functional.Compare_Int;

public class Ex01BubbleSort_Int {

	public static void main(String[] args) {
		int[] elements = { 1, 5, 11, 9, 4, 6 };

		generate("1. Elements", elements);

		// hoán vị khi e1 > e2 --> lớn lui sau --> tăng dần
		sort(elements, (e1, e2) -> e1 > e2);

		generate("2. Elements(sort ascending)", elements);

		// hoán vị khi e1 < e2 --> nhỏ lui sau --> giảm dần
		sort(elements, (e1, e2) -> e1 < e2);

		generate("2. Elements(sort desc)", elements);
	}

	private static void sort(int[] elements, Compare_Int compare_Int) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				// Nếu test(a[j], a[j+1]) return true
				// hoán vị phần tử j và j+1
				if (compare_Int.test(elements[j], elements[j + 1])) {
					swap(elements, j, j + 1);
				}
			}
		}
	}

	private static void sortAsc(int[] elements) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				// Nếu phần tử trước > phần tử sau ==> hoán vị
				// Thằng lớn nằm lui sau ==> Sắp xếp tăng dần
				if (elements[j] > elements[j + 1]) {
					swap(elements, j, j + 1);
				}
			}
		}
	}

	private static void sortDesc(int[] elements) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				// Nếu phần tử trước < phần tử sau ==> hoán vị
				// Thằng nhỏ nằm lui sau ==> Sắp xếp giảm dần
				if (elements[j] < elements[j + 1]) {
					swap(elements, j, j + 1);
				}
			}
		}
	}

}
