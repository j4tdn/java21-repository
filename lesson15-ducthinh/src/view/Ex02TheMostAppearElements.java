package view;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Ex02TheMostAppearElements {
	public static void main(String[] args) {
		String inputString1 = "aaaababbbddc";
		String inputString2 = "aaaaccdcec";
		
		System.out.println("Elements appear the most times in the string 1 --> " + findTheMostAppearElements(inputString1));
		System.out.println("Elements appear the most times in the string 2--> " + findTheMostAppearElements(inputString2));
	}

	private static String findTheMostAppearElements(String input) {
		Map<Character, Integer> charCount = new HashMap<>();
		
		// Count appear times of each element
		for(char c : input.toCharArray()) {
			if(Character.isLetter(c)) {
				charCount.put(c, charCount.getOrDefault(c, 0) + 1);
			}
		}
		// find the most appear times
		Integer maxCount = 0;
		for(int count : charCount.values()) {
			maxCount = Math.max(maxCount, count);
		}
		
		StringBuilder rs = new StringBuilder();
		for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if(entry.getValue()==maxCount) {
				rs.append(entry.getKey()).append(", ");
			}
		}
		if (rs.length() > 0) {
            rs.delete(rs.length() - 2, rs.length());
        }
		return rs.toString();
	}
}
