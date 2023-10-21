package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a, b;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("Enter the coefficient a: ");
				a = scanner.nextDouble();

				System.out.print("Enter the coefficient b: ");
				b = scanner.nextDouble();

				if (a == 0) {
					System.out.println("Coefficient 'a' cannot be zero. Please try again.");
					continue;
				}

				double x = -b / a;
				System.out.println("Result: x = " + x);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Error: Please enter a valid number.");
				scanner.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("Error: Division by zero is not allowed.");
			}
		}

		scanner.close();
	}
}
