package homework.bai02;

import static utils.FormatUtils.isValidName;

import java.util.Scanner;

public class App02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fullName = null;

		do {
			System.out.print("Enter your full name: ");
			fullName = scanner.nextLine().strip().replaceAll("\\s+", " ");
		} while (!isValidName(fullName));

		fullName = formatName(fullName);
		System.out.println("Full name has been formatted: " + fullName);

		scanner.close();
	}

	private static String formatName(String fullName) {
		String[] words = fullName.split(" ");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			if (!word.isEmpty()) {
				String firstLetter = word.substring(0, 1).toUpperCase();
				String restOfWord = word.substring(1).toLowerCase();
				result.append(firstLetter).append(restOfWord).append(" ");
			}
		}
        
		return result.toString();
	}
}
