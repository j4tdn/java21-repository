package Ex02;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
        String randomString = generateRandomString(10);
        System.out.println("Random string: " + randomString);
        
        findMostFrequentCharacters(randomString);
    }

    public static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        // Phạm vi các ký tự từ 'a' đến 'z' và từ 'A' đến 'Z'
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < length; i++) {
            // Chọn ngẫu nhiên một ký tự từ phạm vi đã cho
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public static void findMostFrequentCharacters(String input) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        int maxCount = 0;
        for (int count : charCount.values()) {
            maxCount = Math.max(maxCount, count);
        }

        System.out.print("Output: ");
        boolean first = true;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == maxCount) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(entry.getKey());
                first = false;
            }
        }
        System.out.println();
    }

}
