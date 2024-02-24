package main;

import java.util.*;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String result = findMostFrequentCharacter(input);
        System.out.println("Kết quả: " + result);
    }

    private static String findMostFrequentCharacter(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        int maxCount = 0;
        for (int count : charCountMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        ArrayList<Character> mostFrequentChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                mostFrequentChars.add(entry.getKey());
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : mostFrequentChars) {
            result.append("\"").append(c).append("\", ");
        }

        if (result.length() > 0) {
            result.delete(result.length() - 2, result.length());
        }

        return result.toString();
    }
}
