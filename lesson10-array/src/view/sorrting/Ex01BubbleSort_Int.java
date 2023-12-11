package view.sorrting;

import functional.Compare_Int;

public class Ex01BubbleSort_Int {
	
	public static void main(String[] args) {
		
		int[] element = {1,5,11,9,4,6};
		bubbleSortAsc(element);
		printEmployees(element);
		bubbleSort(element, (e1,e2)-> e1>e2 );
		printEmployees(element);
		
	}
	
	public static void bubbleSort(int[] arr, Compare_Int compareInt) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
            	// Nếu test(arr[j] , a[j+1] ) return true
            	// --> hoán vị phần tử j và j+1 
                if (compareInt.test(arr[j], arr[j+1])) {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
	
	public static void bubbleSortAsc(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j]-(arr[j + 1]) > 0) {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
	
	public static void bubbleSortDesc(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j]-(arr[j + 1]) < 0) {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
	
	
	public static void printEmployees(int[] arr) {
        for (int employee : arr) {
            System.out.print(employee+" ");
        }
        System.out.println();
    }
	
	private static void swap(int[] elements, int i, int j) {
		int temp= elements[i];
		elements[i]= elements[j];
		elements[j] = temp;
	}
}
