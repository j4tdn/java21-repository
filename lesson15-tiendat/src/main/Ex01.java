package main;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thực có phần thập phân khác 0: ");
        double decimalNumber = scanner.nextDouble();

        int[] fraction = convertToFraction(decimalNumber);
        int simplifiedNumerator = fraction[0];
        int simplifiedDenominator = fraction[1];

        String result = "Phân số tối giản của " + decimalNumber + " là: " + simplifiedNumerator + "/" + simplifiedDenominator;
        System.out.println(result);
    }

    private static int[] convertToFraction(double decimalNumber) {
        int precision = 1000000;
        int numerator = (int) Math.round(decimalNumber * precision);
        int denominator = precision;

        int commonDivisor = findGCD(numerator, denominator);

        int[] fraction = {numerator / commonDivisor, denominator / commonDivisor};
        return fraction;
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
