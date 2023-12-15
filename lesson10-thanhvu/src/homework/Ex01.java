package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static utils.ArrayUtils.*;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = Integer.parseInt(ip.nextLine());
		System.out.println("Enter a number element: " + n);
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(1, 10);
		}
		
		System.out.println(Arrays.toString(a));
		
		int[] dl = deleteSameNumber(a);
		generate("1. Delete the same number", dl);
		
		compareHalfArray(a);
		
		findThirdLargest(a);
		
	}
	
	public static int[] deleteSameNumber(int[] a) {
		int[] b = new int[a.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			boolean check = false;
			
			for (int j = i + 1; j < a.length; j++) {
				if(a[i] == a[j]) {
					check = true;
					break;
				}
			}
			if (!check) {
				b[count++] = a[i];
			}
		}
		return Arrays.copyOfRange(b, 0, count);
	}
	
	public static void compareHalfArray(int[] a) {
		double h1 = averageArray(Arrays.copyOfRange(a, 0, a.length/2));
		double h2 = averageArray(Arrays.copyOfRange(a, a.length/2, a.length));
		if (h1 > h2) {
			System.out.println("\nHalf 1 of array is greater than half 2");
		} else {
			System.out.println("\nHalf 1 of array is smaller than half 2");
		}
	}
	
	public static double averageArray(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
	
	public static void findThirdLargest(int[] a) {
		Arrays.sort(a);
		int count = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			if(a[i] == a[i - 1]) {
				continue;
			}
			count++;
			if(count == 3) {
				System.out.println("\nThe third largest: " + a[i]);
				break;
			}
		}
	}
}
