package ex01;

import java.util.Scanner;

import view.InvalidInputValidation;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean validString = false;
		String input = "";

		while (!validString) {
			try {
				System.out.println("\nEnter your string: ");
				input = sc.nextLine();
				isValidString(input, "The string only contains Vietnamese characters with accents and space keys.");
				validString = true;
			} catch (InvalidInputValidation e) {
				System.out.println("Error: " + e.getMessage());
			}
		}

		System.out.println("\n--- Print each char in one line ---");
		for (int i = 0; i < input.length(); i++) {
			System.out.println("\t" + input.charAt(i));
		}
		System.out.println("\n--- Print each char in one line no space ---");
		for (char c : input.toCharArray()) {
			if (c != ' ') {
				System.out.println(c);
			}
		}

		System.out.println("\n--- Print each word in one line ---");
		String[] words = input.split(" ");
		for (String word : words) {
			System.out.println(word);
		}

	}

	private static void isValidString(String text, String message) throws InvalidInputValidation {
		String pattern = "^[\\p{L}\\s\\p{M}]+$";

		if (!text.matches(pattern)) {
			throw new InvalidInputValidation(message);
		}
	}
}
