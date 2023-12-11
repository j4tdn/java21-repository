package view.sorrting;

import functional.Compare_Int2;
import functional.Compare_String;

public class Ex02BubbleSort_String {
	public static void main(String[] args) {
		String[] elements = { null, "a1", "k7", "12", null, null, "bzt282", "115", "h15", null, "d22" };
		sortAsc(elements, (s1, s2) -> {
			// process null elements(e.g null firts)
			if (s1 == null)
				return -1;
			if (s2 == null)
				return 1;
			return s1.compareTo(s2);
		});
		printd(elements);
		sortAsc(elements, (s1, s2) -> {
			// process null elements(e.g null last)
			if (s1 == null && s2 != null)
				return 1;
			if (s2 == null)
				return -1;
			return s1.compareTo(s2);
		});
		printd(elements);

	}

	private static void sortAsc(String[] elements, Compare_String compareString) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (compareString.compare(elements[j], elements[j + 1]) > 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}

	private static void swap(String[] elements, int i, int j) {
		String temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}

	public static void printd(String[] arr) {
		for (String employee : arr) {
			System.out.print(employee + " ");
		}
		System.out.println();
	}
}
