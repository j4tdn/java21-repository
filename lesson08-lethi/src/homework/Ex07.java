package homework;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        String S = getInputString();
        int maxConsecutiveLength = 0;
        int minConsecutiveLength = Integer.MAX_VALUE;

        char prevChar = '\0';

        int currentConsecutiveLength = 1;

        for (char c : S.toCharArray()) {
            if (c == prevChar) {
                currentConsecutiveLength++;
            } else {
                if (currentConsecutiveLength > maxConsecutiveLength) {
                    maxConsecutiveLength = currentConsecutiveLength;
                }
                if (currentConsecutiveLength < minConsecutiveLength) {
                    minConsecutiveLength = currentConsecutiveLength;
                }
                currentConsecutiveLength = 1;
            }

            prevChar = c;
        }

        if (currentConsecutiveLength > maxConsecutiveLength) {
            maxConsecutiveLength = currentConsecutiveLength;
        }
        if (currentConsecutiveLength < minConsecutiveLength) {
            minConsecutiveLength = currentConsecutiveLength;
        }

        System.out.println("Độ dài lớn nhất: " + maxConsecutiveLength);
        System.out.println("Độ dài nhỏ nhất: " + minConsecutiveLength);
    }

    public static String getInputString() {
        Scanner ip = new Scanner(System.in);
        String input;

        do {
            System.out.print("Nhập chuỗi: ");
            input = ip.nextLine();

            if (isValidInput(input)) {
                return input;
            } else {
                System.out.println("Chuỗi không hợp lệ. Vui lòng nhập lại.");
            }
        } while (true);
    }

    public static boolean isValidInput(String input) {
        return input.matches("^[a-z]{1,255}$");
    }
}
