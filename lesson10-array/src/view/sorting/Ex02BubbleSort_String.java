package view.sorting;

import static utils.ArrayUtils.*;
import functional.Compare_String;

public class Ex02BubbleSort_String {

	public static void main(String[] args) {
		/*
		 * Sorting with [non]-null values + null first/last . null first --> null <
		 * non-null null first: khi s1 null thì không hoán vị, s2 null thì hoán vị để
		 * null lên trước . null last --> null > non-null null last: s1 null thì hoán vị
		 * để đẩy null về sau, s2 null thì không hoán vị +
		 * ascending/descending(non-null)
		 */

		String[] elements = { null, "a1", null, null, null, "bzt282", "k7", null, "115", "h15", "d22", "76", "12" };
		sort(elements, (s1, s2) -> { // (vd: null first)
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			// --> sử dụng hàm compareTo khi so sánh lớn bé với KDL String
			// Và chỉ sử dụng compareTo khi s1 và s2 khác null
			// Khi có null -> mình phải yêu cầu nó là null first hay null last
			return s1.compareTo(s2);
		});
		generate("Mang sau khi sap xep tang dan la: ", elements);

		sort(elements, (s1, s2) -> { // (null last)
			if (s1 == null && s2 != null) {
				return 1;
			}
			// s1 != null || s2 = null
			if (s2 == null) {
				return -1;
			}
			return s2.compareTo(s1);

		});
		generate("Mang sau khi sap xep giam dan la: ", elements);

	}

	private static void sort(String[] elements, Compare_String compareString) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (compareString.test(elements[j], elements[j + 1]) > 0) {
					swap(elements, j, j + 1);

				}
			}
		}

	}
}
