package fastcode;

import java.util.Random;
import java.util.Scanner;

public class FastCode {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner ip = new Scanner(System.in);
		inputArr(arr);
		System.out.println("Unsorted Array :");
		displayArr(arr);
		bubbleSort(arr);
		System.out.println();
		System.out.println("Sorted Array: ");
		displayArr(arr);
		System.out.println();
		System.out.println("Enter search number : ");
		int num = ip.nextInt();
		System.out.println("number found index : "+binarySearch(arr, num));
	}
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i -1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void displayArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
	public static void inputArr(int[] arr) {
		Random rd = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(10);
		}
				
	}
	public static int binarySearch(int[] arr, int num) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(arr[mid] == num) {
				return mid;
			}else if(num < arr[mid]){
				high = mid - 1;			
			}else if(num > arr[mid]) {
				low = mid + 1;
			}
		}
		return -1;
	}
}
