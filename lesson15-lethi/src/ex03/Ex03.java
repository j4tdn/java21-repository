package ex03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập chuỗi thứ nhất: ");
		String s1 = ip.nextLine();

		System.out.print("Nhập chuỗi thứ hai: ");
		String s2 = ip.nextLine();

		if (checkAnagram(s1, s2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static boolean checkAnagram(String s1, String s2) {
		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");

		if (s1.length() != s2.length())
			return false;

		Map<Character, Integer> charCount = new HashMap<>();

		for (char c : s1.toLowerCase().toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		for (char c : s2.toLowerCase().toCharArray()) {
			if (!charCount.containsKey(c) || charCount.get(c) == 0) {
				return false;
			} else {
				charCount.put(c, charCount.get(c) - 1);
			}
		}

		return true;
	}

}
