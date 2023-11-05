package homework.bai01;

import java.util.Scanner;

public class App01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any string: ");
		String input = scanner.nextLine();
		// In ra mỗi kí tự trên một dòng
		System.out.println("========== 1.1 ==========");
		display1Char1Line(input);

		// In ra mỗi từ trên mỗi dòng
		System.out.println("\n========== 1.2 ==========");
		display1Word1Line(input);

		// In ra chuỗi đảo ngược theo kí tự
		System.out.println("\n========== 1.3 ==========");
		reversedByCharacter(input);

		// In ra chuỗi đảo ngược theo từ
		System.out.println("\n========== 1.4 ==========");
		reversedByWord(input);

		scanner.close();
	}

	private static void display1Char1Line(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	private static void display1Word1Line(String s) {
		String[] words = s.strip().split("\\s+");
		for (String word : words) {
			System.out.println("word: " + word);
		}
	}

	private static void reversedByCharacter(String s) {
		StringBuilder reversedCharacter = new StringBuilder(s);
		System.out.println(reversedCharacter.reverse().toString());
	}

	private static void reversedByWord(String s) {
		String[] reversedWords = new StringBuilder(s).reverse().toString().split("\\s+");
		for (String reversedWord : reversedWords) {
			System.out.println("reversed word: " + reversedWord);
		}
	}
}
