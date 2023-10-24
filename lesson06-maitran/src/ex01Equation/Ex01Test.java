package ex01Equation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ex01Test {

    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("\t| Solve The Equation ax + b = 0 |\t");
            System.out.println("Result: " + calculate());
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Message: " + e.getMessage());
        }
    }

    private static BigDecimal calculate() {
        BigDecimal a = input("Enter a: ");
        BigDecimal b = input("Enter b: ");
        if (a.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Denominator should not be zero");
        }
        return b.negate().divide(a, 2, RoundingMode.HALF_UP);
    }

    private static BigDecimal input(String messsage) {
        System.out.print(messsage + ": ");
        return new BigDecimal(ip.nextLine());
    }
}
