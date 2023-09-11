package lesson02;

import java.util.Scanner;

public class Ex08Prime {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		String text = "";

		do {
			System.out.print("Enter number: ");
			text = ip.nextLine();
		} while (!isNumber(text));

		int number = Integer.parseInt(text);

		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is NOT a prime number.");
		}

		ip.close();
	}

	private static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char index = text.charAt(i);
			if (!Character.isDigit(index)) {
				return false;
			}
		}
		return true;
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
