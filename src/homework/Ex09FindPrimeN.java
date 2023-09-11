package lesson02;

import java.util.Scanner;

public class Ex09FindPrimeN {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.printf("Enter n = ");
		int n = ip.nextInt();
		System.out.printf("Enter the order of the prime numbers: ");
		int index = ip.nextInt();
		int count = 0;
		int i = 2;
		int[] primes = findPrimesUpToN(index);
		int prime = primes[index - 1];
		
		System.out.printf("\n==== List of the prime number you want ===\n");
		while (count < n) {

			if (isPrime(i)) {
				System.out.print( i + " ");

				count++;
			}
			i++;
		}
		System.out.println("\n\nThe prime of your index is: " + prime);

		ip.close();
	}

	private static int[] findPrimesUpToN(int n) {
		if (n < 1) {
			System.out.println("Invalid!");
		}

		int[] primes = new int[n];
		primes[0] = 2;

		int count = 1;
		int number = 3;

		while (count < n) {
			if (isPrime(number)) {
				primes[count] = number;
				count++;
			}
			number += 2;
		}
		return primes;
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
