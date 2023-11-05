package homework;

import java.util.Scanner;

public class Ex02NormalLize {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Input fullname: ");
        String fullName = ip.nextLine();

        String capitalizedFullName = capitalizeName(fullName);
        System.out.println("Họ và tên đã được viết hoa: " + capitalizedFullName);
    }

    public static String capitalizeName(String fullName) {
        // Chia chuỗi thành các từ sử dụng khoảng trắng làm dấu phân cách
        String[] words = fullName.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Viết HOA chữ cái đầu tiên của từ và thêm kí tự thường vào phần còn lại
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1).toLowerCase();

                // Nếu đây là từ đầu tiên, không cần thêm khoảng trắng
                if (result.length() > 0) {
                    result.append(" ");
                }

                result.append(firstLetter).append(restOfWord);
            }
        }

        return result.toString();
    }
}

