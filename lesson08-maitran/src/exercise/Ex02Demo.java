package exercise;

import static utils.validationUtils.isValidString;
import java.util.Scanner;

public class Ex02Demo {
	public static void main(String[] args) {
		
		doFunction();
	}

	private static void doFunction() {
		Scanner sc = new Scanner(System.in);
		String input = "";

		do {
			System.out.println("\nEnter your name: ");
			input = sc.nextLine().strip().replaceAll("\\s+", " ");
		} while (!isValidString("^[A-Za-z\\s]+$", input,
				"The string only includes upper and lower case letters in the English alphabet and space keys."));

		sc.close();
		display(input);
	}

	private static void display(String input) {
		StringBuilder formattedName = new StringBuilder();
		String[] words = input.split(" ");
		for (String word : words) {
			String upperCaseFirstLetter = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
			formattedName.append(upperCaseFirstLetter).append(" ");
		}
		System.out.println(formattedName);
	}
}
