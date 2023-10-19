package lesson04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SumArray {
	private static Random rd = new Random();
	public static void main(String[] args) {
		int[] arr = new int[10];
		randomArr(arr);
		System.out.println("\nTổng các phần tử không trùng nhau trong mảng , trừ Min và Max là "+sum(arr));
	}
	
	// random array function
	public static void randomArr(int[] arr) {
		for(int i=0; i < arr.length;i++) {
			arr[i] = rd.nextInt(10);
			System.out.print(""+ arr[i] + " ");
		}
	}
	
	// uniqueSum function
	public static int sum(int[] arr) {
		Set<Integer> uniqueElements = new HashSet<>();
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			if(!uniqueElements.contains(arr[i])) {
				uniqueElements.add(arr[i]);
				sum += arr[i];
			}
		}
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		return sum - max - min;
	}
}
