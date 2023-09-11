package lesson02;

import java.util.Scanner;

public class Ex02PowerOfTwo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String text = "";
		System.out.println("\n--- CHECK POWER OF 2 ---\n");
		do {
			System.out.print("Enter number: ");
			text = ip.nextLine();
		} while (!isNumber(text));

		int number = Integer.parseInt(text);
		System.out.println(number + " --> " + isPowerOfTwo(number));
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

	private static boolean isPowerOfTwo(int number) {
		for (int base = 2; base <= Math.sqrt(number); base++) {
			int exponent = 2;
			int result = (int) Math.pow(base, exponent);
			while (result <= number) {
				if (result == number) {
					return true;
				}

				exponent++;
				result = (int) Math.pow(base, exponent);
			}
		}

		return false;

	}
}
