package exercises;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02NameFormatter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fullname = "";
		do {
			try {
				System.out.print("Input your fullname: ");
				fullname = sc.nextLine();
				if (isValidName(fullname)) {
					System.out.println("Fullname with standard format --> " + capitalizeFirstChar(fullname));
					break;
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		sc.close();
	}

	private static boolean isValidName(String name) throws Exception {
		if (!Pattern.matches("[a-zA-Z\\s]+", name)) {
			throw new Exception("Name must contains uppercase, lowercase characters & space!!!");
		}
		return true;
	}

	private static String capitalizeFirstChar(String name) {
		String result = "";
		name = name.trim().toLowerCase();
		name = name.replaceAll("[\\s]+", " ");
		String[] words = name.split("\\s");
		for (int i = 0; i < words.length; i++) {
			result = result + String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
			if (i <= words.length - 1) {
				result = result + " ";
			}
		}
		return result;

	}

}