package exercise;

import java.util.Scanner;

public class Ex05Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		do {
			System.out.print("Enter string s1: ");
			s1 = sc.nextLine().strip().replaceAll("\\s+", " ");
			System.out.print("Enter string s2: ");
			s2 = sc.nextLine().strip().replaceAll("\\s+", " ");

			if (!isValidString(s1) || !isValidString(s2)) {
				System.out.println("Invalid input. Both strings should contain only uppercase letters from A to Z.");
			}
		} while (!isValidString(s1) || !isValidString(s2));

		String longestCommonSubstring = findLongestCommonSubstring(s1, s2);
		System.out.println("Longest common substring: " + longestCommonSubstring);
		sc.close();
	}

	private static boolean isValidString(String str) {
		return str.matches("^[A-Z]+$");
	}

	private static String findLongestCommonSubstring(String s1, String s2) {
		String longestCommonSubstring = "";

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j <= s1.length(); j++) {
				String substring = s1.substring(i, j);
				if (s2.contains(substring) && substring.length() > longestCommonSubstring.length()) {
					longestCommonSubstring = substring;
				}
			}
		}
		return longestCommonSubstring;
	}
}