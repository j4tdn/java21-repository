package lesson02;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class Ex04SumFactorial {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = ip.nextInt();
		int[] a = new int[n];
		randomArray(a, n);
		returnArray(a, n);
		System.out.println();
		BigDecimal sum = totalFactorial(a);
	    System.out.println("Total of factorial: " + sum);
		
		ip.close();
	}

	private static void randomArray(int[] a, int n) {
		Random rd = new Random();
		for (int i = 0; i < n; i++) {
			a[i] = rd.nextInt(3, 7);
		}
	}

	private static void returnArray(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\t" + a[i]);
		}
	}
	
	private static BigDecimal calculateFactorial(int number) {
		BigDecimal factorial = BigDecimal.ONE;
		for(int i = 1; i <= number; i++) {
			factorial = factorial.multiply(BigDecimal.valueOf(i));
		}
		return factorial;
	}
	
	private static BigDecimal totalFactorial(int[] numbers) {
		BigDecimal sum = BigDecimal.ZERO;
		for(int number : numbers) {
			BigDecimal factorial = calculateFactorial(number);
			sum = sum.add(factorial);
		}
		return sum;
	}	

}
