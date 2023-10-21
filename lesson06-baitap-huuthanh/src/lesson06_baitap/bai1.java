package lesson06_baitap;

import java.util.Scanner;

public class bai1 {

	private static final Scanner sc = new Scanner(System.in);

	public static boolean checkLinearEquation() {
		System.out.println("-----Linear Equation-----");
		while (true) {
			try {
				System.out.println("Enter a: ");
				int a = Integer.parseInt(sc.nextLine());
				if (a == 0) {
					throw new NumberFormatException();
				} else {
					System.out.println("Enter b: ");
					int b = Integer.parseInt(sc.nextLine());
					if (b > 0)
						System.out.println("The value of x when " + a + "x + " + b + " = 0 --> x = " + (float) -b / a);
					else if (b < 0)
						System.out
								.println("The value of x when " + a + "x - " + (-b) + " = 0 --> x = " + (float) -b / a);
					else
						System.out.println("The value of x when " + a + "x = 0 --> x = " + (float) -b / a);
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