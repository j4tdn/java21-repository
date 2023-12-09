package view.sorting;

import static utils.ArrayUtils.generate;
import static utils.ArrayUtils.swap;

import functional.Compare_Int2;

public class Ex01BubbleSort_Int2 {

	public static void main(String[] args) {

		int[] elements = { 1, 5, 11, 9, 4, 6 };

		generate("1. Elements", elements);

		sort(elements, (e1, e2) -> e1 - e2);

		generate("2. Elements(sort asceding) ", elements);
		
		sort(elements, (e1, e2) -> e2 - e1);

		generate("3. Elements(sort desceding) ", elements);
	}
	
	private static void sort(int[] elements, Compare_Int2 compareInt2) {
		// sort ascending
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (compareInt2.compare(elements[j], elements[j+1]) > 0) {
					swap(elements, j, j + 1);
				}
			}
		}

	}

	private static void sortAsc(int[] elements) {
		// sort ascending
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (elements[j] > elements[j + 1]) {
					swap(elements, j, j + 1);
				}
			}
		}

	}

	private static void sortDesc(int[] elements) {
		// sort descending
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (elements[j] < elements[j + 1]) {
					swap(elements, j, j + 1);
				}
			}
		}

	}

}
