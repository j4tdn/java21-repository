package ex01checklinearequation;

import java.util.Scanner;

public class LinearEquation {

	private static final Scanner ip = new Scanner(System.in);

	public static boolean checkLinearEquation() {
		System.out.println("-----Linear Equation-----");
		while (true) {
			try {
				System.out.println("Enter a: ");
				int a = Integer.parseInt(ip.nextLine());
				if (a == 0) {
					throw new NumberFormatException();
				} else {
					System.out.println("Enter b: ");
					int b = Integer.parseInt(ip.nextLine());
					System.out.println("The value of x when " + a + "x + " + b + " = 0 --> x = " + (float)-b / a);
					return false;
				}
			} catch (NumberFormatException e) {
				System.err.println("Please enter a != 0 and it must be number");
			}

		}

	}

	public static void main(String[] args) {
		checkLinearEquation();
	}
}
