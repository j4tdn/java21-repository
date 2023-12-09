package view.sorting;

import static utils.ArrayUtils.*;

import functional.Compare_String;

public class Ex02Bubble_String {

	public static void main(String[] args) {
		/*
		 Sorting with [non]-null values
		 + null first/last
		   . null first --> null < non-null
		   . null last  --> null > non-null
		 + ascending/descending(non-null)
		 */
		
		String[] elements = {null, "a1", "k7", "12", null, null, "bzt282", null, "115", "h15", "d22", "76", null};

		generate("1. Elements", elements);

		sort(elements, (s1, s2) -> {
			// process non-null elements
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}

			return s1.compareTo(s2);
		});
		generate("1. Elements(sort ascending)", elements);
		
		sort(elements, (s1, s2) -> {
			// null last
			if (s1 == null && s2 != null) {
				return 1;
			}

			// s1 != null || s1 = null & s2 = null
			if (s2 == null) {
				return -1;
			}

			// descending
			return s2.compareTo(s1);
		});

//		sort(elements, (s1, s2) -> {
//			return s2.compareTo(s1);
//		});
		generate("2. Elements(sort descending)", elements);
	}

	private static void sort(String[] elements, Compare_String compareString) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (compareString.compare(elements[j], elements[j + 1]) > 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}

	private static void sortAsc(String[] elements) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (elements[j].compareTo(elements[j + 1]) > 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}
}
