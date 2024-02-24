package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex04MaxOccurringChar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String s = sc.nextLine();
		System.out.println(findTheBestOcc(s));
		sc.close();
	}

	private static List<Character> findTheBestOcc(String word) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		int max = 0;

		for (char c : word.toCharArray()) {
			int count = charCountMap.getOrDefault(c, 0) + 1;
			charCountMap.put(c, count);

			if (count > max) {
				max = count;
			}
		}
		List<Character> listMaxOccChars = new ArrayList<>();
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() == max) {
				listMaxOccChars.add(entry.getKey());
			}
		}
		return listMaxOccChars;
	}

}
