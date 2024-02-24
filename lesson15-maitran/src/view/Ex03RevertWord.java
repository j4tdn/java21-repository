package view;

import java.util.Scanner;

public class Ex03RevertWord {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first word: ");
		String s = sc.nextLine();
		System.out.println("Enter the second word: ");
		String s1 = sc.nextLine();
		System.out.println(checkRevert(s, s1));

		sc.close();
	}

	private static boolean checkRevert(String s, String s1) {
		return revertWord(s).equalsIgnoreCase(s1) ? true : false;
	}

	private static String revertWord(String s) {
		s = s.strip().replaceAll("\\s+", " ");
		String[] words = s.split("\\s");

		StringBuilder updateString = new StringBuilder();
		for (String word : words) {
			updateString.append(new StringBuilder(word).reverse()).append(" ");
		}
		return updateString.toString().strip();
	}
}
