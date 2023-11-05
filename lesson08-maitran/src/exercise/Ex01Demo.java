package exercise;

import java.util.Arrays;
import java.util.Scanner;
import static utils.validationUtils.*;

public class Ex01Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;

		do {
			System.out.println("\nEnter your string: ");
			input = sc.nextLine().strip().replaceAll("\\s+", " ");
		} while (!isValidString("^[\\p{L}\\s]+$", input,
				"The string only contains Vietnamese characters with accents and space keys."));

		sc.close();

		// Mỗi kí tự trên 1 dòng
		System.out.println("\n--- Print each char in one line ---");
		for (int i = 0; i < input.length(); i++) {
			System.out.println("\t" + input.charAt(i));
		}

		// Không space
		System.out.println("\n--- Print each char in one line no space ---");
		for (char c : input.toCharArray()) {
			if (c != ' ') {
				System.out.println(c);
			}
		}

		// In ra mỗi từ trên mỗi dòng
		System.out.println("\n--- Print each word in one line ---");
		String[] words = input.split(" ");
		Arrays.stream(words).forEach(word -> System.out.println(word));

		// In ra chuỗi đảo ngược theo kí tự
		System.out.println("\n---String reversed by character---\n" + new StringBuilder(input).reverse());

		// In ra chuỗi đảo ngược theo từ
		StringBuilder reversedString = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reversedString.append(words[i]);
			if (i > 0) {
				reversedString.append(" ");
			}
		}
		System.out.println("\n---String reversed by word---\n" + reversedString);
	}

}
