package ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String s = ip.nextLine();
		
		findMostAppearChar(s);

	}

	public static void findMostAppearChar(String s) {
		Map<Character, Integer> charCount = new HashMap<>();

		for (char c : s.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		int maxCount = 0;
		for (int count : charCount.values()) {
			if (count > maxCount)
				maxCount = count;
		}

		System.out.print("Kí tự có số lần xuất hiện nhiều nhất: ");
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if(entry.getValue() == maxCount) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}
}
