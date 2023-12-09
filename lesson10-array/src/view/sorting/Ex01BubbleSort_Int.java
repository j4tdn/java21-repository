package view.sorting;

import static utils.ArrayUtils.*;
public class Ex01BubbleSort_Int {
	public static void main(String[] args) {
		int[] elements = {1, 5, 11, 9, 4, 6};
		generate("1. Elements", elements);
		sortAsc(elements);
		generate("2. Elements(sort ascending", elements);
		
	}
	
	
	
	private static void sortAsc(int[] elements) {
		//sort ascending | descending
		for (int i = 0; i< elements.length; i++) {
			for (int j = 0; j < elements.length -i-1; j++) {
				// sắp xếp tăng dần
				if(elements[j] > elements[j+1]) {
					swap(elements, j, j);
				}
			}
		}
	}
	
	
	private static void sortDesc(int[] elements) {
		for (int i = 0; i< elements.length; i++) {
			for (int j = 0; j < elements.length -i-1; j++) {
				// sắp xếp giảm dần
				if(elements[j] <	 elements[j+1]) {
					swap(elements, j, j);
				}
			}
		}
	}
	
	
}
