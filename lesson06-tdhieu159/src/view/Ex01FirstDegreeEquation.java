package view;

import java.util.Scanner;


public class Ex01FirstDegreeEquation {

	public static void main(String[] args) {
		do {
			double a = enterNumber();
			double b = enterNumber();
			try {
				System.out.println(a + " * x " + " + " + b + " = 0 --> x = " + -(divide(b, a)));
				break;
			} catch (NumberFormatException | ArithmeticException e) {
				System.out.println(e.getMessage());

			}

		} while (true);
	}

	private static double enterNumber() {
		Scanner ip = new Scanner(System.in);
		double number = 0d;
		do {
			try {
				System.out.print("Enter a valid number: ");
				number = Double.parseDouble(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("WARNING --> " + e.getMessage());
			}
		} while (true);

		return number;

	}

	private static double divide(double b, double a) {
		if (a == 0) {
			throw new ArithmeticException("Denominator cannot be zero!!!");
		}
		return b / a;
	}

}