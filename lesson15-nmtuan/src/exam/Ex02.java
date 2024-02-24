package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Đếm số lần xuất hiện của từng ký tự trong chuỗi
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) { // Kiểm tra xem ký tự có nằm trong khoảng [a-zA-Z] không
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        int maxCount = 0;
        StringBuilder result = new StringBuilder();

        // Tìm số lần xuất hiện nhiều nhất của ký tự
        for (int count : charCountMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // Xây dựng chuỗi kết quả chứa các ký tự xuất hiện nhiều nhất
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.append(entry.getKey()).append(", ");
            }
        }

        // Xóa dấu phẩy và khoảng trắng cuối cùng
        if (result.length() > 0) {
            result.delete(result.length() - 2, result.length());
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + result.toString());
    }
}