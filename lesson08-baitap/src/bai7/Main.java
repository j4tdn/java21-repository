package bai7;

import java.util.Scanner;

public class Main {

	public static boolean numberOfCharacterPassFrom8To256(String arr) {
		if (arr.length() <= 0 || arr.length() > 256) {
			System.out.println("Không phù hợp số lượng phần tử cần nhập lại ");
			return false;
		}
		return true;
	}

	public static boolean checkLeastAllLowercaseAlphabeticCharater(String arr) {
		int count = 0;
		for (int i = 0; i < arr.length(); i++) {
			char ch = arr.charAt(i);
			if (Character.isLowerCase(ch)) {
				count++;
			}
		}
		if (count != arr.length()) {
			System.out.println("Chuỗi không hợp lệ nhập lại");
			return false;
		}
		return true;
	}

	public static int[] findMaxAndMinConsecutiveLength(String S) {
		if (S == null || S.isEmpty()) {
			return new int[] { 0, 0 };
		}

		int max_length = 1;
		int min_length = 1;
		int current_length = 1;

		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(i) == S.charAt(i - 1)) {
				current_length++;
			} else {
				max_length = Math.max(max_length, current_length);
				if (current_length > 1) {
					min_length = Math.min(min_length, current_length);
				}
				current_length = 1;
			}
		}

		max_length = Math.max(max_length, current_length);
		if (current_length > 1) {
			min_length = Math.min(min_length, current_length);
		}

		return new int[] { max_length, min_length };
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập và chuỗi");
		String string = sc.nextLine();
		while (checkLeastAllLowercaseAlphabeticCharater(string) == false
				|| numberOfCharacterPassFrom8To256(string) == false) {
			string = sc.nextLine();
		}
		int[] result = findMaxAndMinConsecutiveLength(string);
		int maxConsecutiveLength = result[0];
		int minConsecutiveLength = result[1];
		System.out.println("Độ dài lớn nhất của dãy con đúng: " +maxConsecutiveLength);
		System.out.println("Độ dài lớn nhất của dãy con đúng: " +minConsecutiveLength);
	}
}
