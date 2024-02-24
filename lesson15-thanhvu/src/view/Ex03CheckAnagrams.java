package view;

import java.util.HashMap;

public class Ex03CheckAnagrams {

	public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (!charCountMap.containsKey(ch) || charCountMap.get(ch) == 0) {
                return false;
            }
            charCountMap.put(ch, charCountMap.get(ch) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("Word", "orWd")); 
        System.out.println(areAnagrams("Word", "Word")); 
        System.out.println(areAnagrams("word", "DoRw")); 
        System.out.println(areAnagrams("Word", "worrd")); 
        System.out.println(areAnagrams("Java", "ajav")); 
        System.out.println(areAnagrams("Vava", "Avav")); 
        System.out.println(areAnagrams("Hello", "Hellloo")); 
    }
}
