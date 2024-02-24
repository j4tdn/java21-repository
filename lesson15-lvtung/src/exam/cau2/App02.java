package exam.cau2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi ký tự trong phạm vi [a-zA-Z]: ");
        String input = scanner.nextLine();
        
        System.out.println("Output: " + findCharacter(input));
        
        scanner.close();
	}
	
	public static String findCharacter(String input) {
		// Kiểm tra ràng buộc chuỗi chỉ chứa các ký tự trong phạm vi [a-zA-Z]
        if (!input.matches("[a-zA-Z]+")) {
            return "Chuỗi không hợp lệ";
        }
        
        Map<Character, Integer> charFrequency = new HashMap<>();
        int maxFrequency = 0;

        // Đếm tần suất xuất hiện của từng ký tự
        for (char ch : input.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
            maxFrequency = Math.max(maxFrequency, charFrequency.get(ch));
        }

        // Tạo danh sách các ký tự có tần suất xuất hiện 
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                result.append(entry.getKey()).append(", ");
            }
        }

        // Xóa dấu phẩy cuối cùng nếu có
        if (result.length() > 0) {
            result.delete(result.length() - 2, result.length());
        }

        return result.toString();
	}
}
