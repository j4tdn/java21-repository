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
				System.out.println("\nNhập chuỗi tiếng Việt có dấu:  ");
				input = sc.nextLine();
				isValidString(input, "Vui lòng nhập lại ! ");
				validString = true;
			} catch (InvalidInputValidation e) {
				System.out.println("Error: " + e.getMessage());
			}
		}

		System.out.println("\n-------------------------------------");
		for (int i = 0; i < input.length(); i++) {
			System.out.println("\t" + input.charAt(i));
		}
		System.out.println("\n-------------------------------------");
		for (char c : input.toCharArray()) {
			if (c != ' ') {
				System.out.println(c);
			}
		}

		System.out.println("\n-------------------------------------");
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
