package view;

import java.util.HashMap;
import java.util.Map;

public class Ex04 {
	
	 public static void main(String[] args) {
	        String input1 = "aaaababbbddc";
	        String input2 = "aaaccdcee";

	        System.out.println("Input: " + input1);
	        System.out.println("Output: " + findMostFrequentChars(input1));

	        System.out.println("Input: " + input2);
	        System.out.println("Output: " + findMostFrequentChars(input2));
	    }

	    public static String findMostFrequentChars(String str) {
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        int maxCount = 0;
	        for (int count : charCountMap.values()) {
	            maxCount = Math.max(maxCount, count);
	        }

	        StringBuilder result = new StringBuilder();
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() == maxCount) {
	                result.append(entry.getKey()).append(" ");
	            }
	        }

	        return result.toString().trim();
	    }
}
