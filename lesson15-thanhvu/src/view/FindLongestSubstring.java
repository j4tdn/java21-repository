package view;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSubstring {
	
	 public static String longestSubstringWithoutRepeatingCharacters(String s) {
	        int n = s.length();
	        int maxLength = 0;
	        String longestSubstring = "";
	        Map<Character, Integer> charIndexMap = new HashMap<>();

	        for (int start = 0, end = 0; end < n; end++) {
	            char currentChar = s.charAt(end);
	            if (charIndexMap.containsKey(currentChar)) {
	                start = Math.max(charIndexMap.get(currentChar) + 1, start);
	            }

	            if (end - start + 1 > maxLength) {
	                maxLength = end - start + 1;
	                longestSubstring = s.substring(start, end + 1);
	            }

	            charIndexMap.put(currentChar, end);
	        }

	        return longestSubstring;
	    }

	    public static void main(String[] args) {
	        String input = "pickoutthelongestsubstring";
	        String longestSubstring = longestSubstringWithoutRepeatingCharacters(input);
	        System.out.println("Chuỗi con lớn nhất không lặp lại là: " + longestSubstring);
	        System.out.println("Độ dài của chuỗi con là: " + longestSubstring.length());
	    }
}
