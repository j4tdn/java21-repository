package homework;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03RemoveDiacritics {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhập chuỗi tiếng Việt có dấu: ");
        String vietnameseString = ip.nextLine();

        String withoutDiacritics = removeDiacritics(vietnameseString);
        System.out.println("Chuỗi không dấu: " + withoutDiacritics);
    }

    public static String removeDiacritics(String inputString) {
        // Sử dụng Normalizer.normalize để chuẩn hóa chuỗi và chuyển đổi thành Unicode NFC
        String normalizedString = Normalizer.normalize(inputString, Normalizer.Form.NFC);

        // Sử dụng biểu thức chính quy để loại bỏ các dấu
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        String withoutDiacritics = pattern.matcher(normalizedString).replaceAll("");

        return withoutDiacritics;
    }
}

