package exercises;

import java.util.Scanner;

public class exercises06 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        a = getInput("Nhập số nguyên a (0 <= a < 20): ", 0, 19, scanner);
        b = getInput("Nhập số nguyên b (0 <= b < 20): ", 0, 19, scanner);
        c = getInput("Nhập số nguyên c (0 <= c < 20): ", 0, 19, scanner);

        int max = findMax(a, b, c);
        int min = findMin(a, b, c);

        System.out.println("Số lớn nhất là " + max);
        System.out.println("Số nhỏ nhất là " + min);

        scanner.close();
    }

    public static int getInput(String prompt, int min, int max, Scanner scanner) {
        int input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Số không hợp lệ. Vui lòng nhập lại.");
                scanner.next();
            }
            input = scanner.nextInt();
            if (input < min || input >= max) {
                System.out.println("Số không hợp lệ. Vui lòng nhập lại.");
            }
        } while (input < min || input >= max);
        return input;
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int findMin(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}


