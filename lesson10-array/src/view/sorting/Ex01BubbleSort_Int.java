package view.sorting;

import functional.Compare_Int;
import functional.Compare_Int2;

public class Ex01BubbleSort_Int {
	public static void main(String[] args) {
		int[] elements = {1, 5, 11, 9, 4, 6};
		bubbleSort(elements, (a, b) -> a - b);
		System.out.print("Array after bubble sort ascending -> ");
		displayArr(elements);
		System.out.print("\nArray after bubble sort descscending -> ");

	}
	
	public static void bubbleSort(int[] elements, Compare_Int2 compare_Int2) {
		for(int i = 0; i < elements.length - 1; i++) {
			for(int j = 0; j < elements.length - 1 - i; j++) {
				// Nếu test (a[j], a[j+1]) return true
				// --> Hoán vị phần tử j và j+1
				if(compare_Int2.compare(elements[j], elements[j+1]) > 0) {
					swap(elements, j, j+1);
				}
			}
		}
	}
	
	public static void swap(int[] elements, int a, int b) {
		int temp = elements[a];
		elements[a] = elements[b];
		elements[b] = temp;
	}
	
	public static void displayArr(int[] elements) {
		for(int num: elements) {
			System.out.print(" "+num);
		}
	}
}
