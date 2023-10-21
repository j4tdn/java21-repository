package bt1;

import java.util.Scanner;

public class Validation {
	Scanner sc = new Scanner(System.in);

	public double checkInputDouble() {
		while (true) {
			try {

				double result = Double.parseDouble(sc.nextLine().trim());
				return result;
			} catch (NumberFormatException e) {
				System.err.println("Input must be a number Double...");
				System.out.println("Please enter again: ");
			}
		}
	}

	public double checkInputNonZeroDouble() {
		while (true) {
			double result = checkInputDouble();
			if (result == 0) {
				System.err.println("Input must be a non-zero Double...");
				System.out.println("Please enter again: ");
			} else {
				return result;
			}
		}
	}

}
