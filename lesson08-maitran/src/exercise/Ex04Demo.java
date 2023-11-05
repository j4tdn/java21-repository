package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = inputInt(sc, "Enter M: ");
		int n = inputInt(sc, "Enter N: ");

		ArrayList<Integer> factorsM = getPrimeFactorsArray(getFactors(m));
		ArrayList<Integer> factorsN = getPrimeFactorsArray(getFactors(n));

		if (getPrimeFactorsArray(factorsM).equals(getPrimeFactorsArray(factorsN))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}

	private static ArrayList<Integer> getPrimeFactorsArray(ArrayList<Integer> factors) {
		ArrayList<Integer> getPrimeFactorsArray = new ArrayList<>();
		for (Integer factor : factors) {
			if (isPrime(factor)) {
				getPrimeFactorsArray.add(factor);
			}
		}
		return getPrimeFactorsArray;
	}

	private static ArrayList<Integer> getFactors(int number) {
		ArrayList<Integer> factorsArray = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factorsArray.add(i);
			}
		}
		return factorsArray;
	}

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static int inputInt(Scanner input, String message) {
		int number = 0;
		boolean validInput = false;

		while (!validInput) {
			System.out.print(message);
			try {
				number = Integer.parseInt(input.nextLine());
				if (number > 0) {
					validInput = true;
				} else {
					System.out.println("Please enter a positive number.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid number.");
			}
		}
		return number;
	}

}
