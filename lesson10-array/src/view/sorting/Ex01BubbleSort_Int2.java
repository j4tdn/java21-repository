package view.sorting;

import static utils.ArrayUtils.*;

import functional.Compare_Int;
import functional.Compare_Int2;

public class Ex01BubbleSort_Int2 {

	public static void main(String[] args) {

		int[] elements = { 1, 5, 11, 9, 4, 6 };

		generate("1. Elements ", elements);

		sort(elements, (e1, e2) -> e1 - e2);

		generate("2. Elements (sort ascending) ", elements);

		sort(elements, (e1, e2) -> e1 - e2 < 0 ? 1 : -1);

		generate("3. Elements (sort descending) ", elements);
	}

	private static void sort(int[] elements, Compare_Int2 compareInt) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				// Nếu compare(elements[j], elements[j + 1] trả về số dương
				// => hoán vị
				if (compareInt.compare(elements[j], elements[j + 1]) > 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}

}
