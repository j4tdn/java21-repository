package view.sorting;

import static utils.ArrayUtils.*;

import functional.Compare_Int2;

public class Ex01BubbleSort_Int2 {

	// Cách Java hỗ trợ sorting
	// int compare(E e1, E e2)
	
	public static void main(String[] args) {
		
		int[] elements = { 1, 5, 11, 9, 4, 6 };
		
		sort(elements, (e1, e2) -> {
			// tương đương e1 - e2
			if (e1 > e2) {
				return 1; // > 0 --> hoán vị
			}
			return -1;    // 0 (không dương) không thỏa mãn > 0 --> ko hoán vị
		});
		
		generate("2. Elements(sort ascending)", elements);
		
		sort(elements, (e1, e2) -> {
			// tương đương e2 - e1
			if (e1 < e2) {
				return 1; // > 0 --> hoán vị
			}
			return -1;	  // 0 (không dương) không thỏa mãn > 0 --> ko hoán vị
		});
		
		generate("2. Elements(sort ascending)", elements);
	}
	
	private static void sort(int[] elements, Compare_Int2 compareInt2) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0 ; j < elements.length - i - 1; j++) {
				// Nếu compare(a[j], a[j+1]) trả về số dương
				// ==> hoán vị
				if (compareInt2.compare(elements[j], elements[j+1]) > 0) {
					swap(elements, j, j+1);
				}
			}
		}
	}
	
	// elements[j] - elements[j+1] > 0
	// elements[j] - elements[j+1] < 0
	
	private static void sortAsc(int[] elements) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0 ; j < elements.length - i - 1; j++) {
				// Nếu phần tử trước > phần tử sau ==> hoán vị
				// Thằng lớn nằm lui sau ==> Sắp xếp tăng dần
				if (elements[j] - elements[j+1] > 0) {
					swap(elements, j, j+1);
				}
			}
		}
	}
	
	private static void sortDesc(int[] elements) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0 ; j < elements.length - i - 1; j++) {
				// Nếu phần tử trước < phần tử sau ==> hoán vị
				// Thằng nhỏ nằm lui sau ==> Sắp xếp giảm dần
				if (elements[j] - elements[j+1] < 0) {
					swap(elements, j, j+1);
				}
			}
		}
	}
}
