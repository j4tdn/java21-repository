package homework;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		String input;

		do {
			System.out.print("Nhập chuỗi: ");
			input = ip.nextLine();

			if (checkString(input)) {
				break;
			} else {
				System.out.println("Vui lòng nhập lại!");
			}
		} while (true);

		printEachCharPerLine(input);
		printEachWordPerLine(input);

		System.out.println("Chuỗi đảo ngược theo ký tự: " + reverseByChar(input));
		System.out.println("Chuỗi đảo ngược theo từ: " + reverseByWord(input));

	}

	public static boolean checkString(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void printEachCharPerLine(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println("Kí tự: " + s.charAt(i));
		}
	}

	public static void printEachWordPerLine(String s) {
		String[] words = s.split(" ");
		for (String word : words) {
			System.out.println("Từ: " + word);
		}
	}

	public static String reverseByChar(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public static String reverseByWord(String s) {
		String[] words = s.split(" ");
		StringBuilder reverseByWord = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reverseByWord.append(words[i]);
			if (i != 0) {
				reverseByWord.append(" ");
			}
		}
		return reverseByWord.toString();
	}

}
