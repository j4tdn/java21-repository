package view.sorting;

import static utils.ArrayUtils.*;

import functional.Compare_Int;

public class Ex01BubbleSort_Int {

	public static void main(String[] args) {

		int[] elements = { 1, 5, 11, 9, 4, 6 };

		generate("1. Elements ", elements);

		sort(elements, (e1, e2) -> e1 > e2);

		generate("2. Elements (sort ascending) ", elements);

		sort(elements, (e1, e2) -> e1 < e2);

		generate("3. Elements (sort descending) ", elements);
	}

	private static void sort(int[] elements, Compare_Int compareInt) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				// Nếu test(a[j], a[j+1]) return true
				// --> hoán vị phần tử j và j+1 -->
				if (compareInt.test(elements[j], elements[j + 1])) {
					swap(elements, j, j + 1);
				}
			}
		}
	}

}