package exam;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương: ");
        int a = scanner.nextInt();

        if (isHappyNumber(a)) {
            System.out.println(a + " là số hạnh phúc.");
        } 
        else {
            System.out.println(a + " không là số hạnh phúc.");
        }

        scanner.close();
    }

    public static boolean isHappyNumber(int b) {
        int sumOfSquares = b;
        while (sumOfSquares != 1 && sumOfSquares != 4) {
            int currentNumber = sumOfSquares;
            sumOfSquares = 0;
            while (currentNumber > 0) {
                int digit = currentNumber % 10;
                sumOfSquares += digit * digit;
                currentNumber /= 10;
            }
        }
        return sumOfSquares == 1;
    }
}