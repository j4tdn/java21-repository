package view;

import java.util.Scanner;

public class Ex01 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = input();
		output(n);
	}

	private static int input() {
		int n;
		do {
			try {
				System.out.print("Enter the random integer number: ");
				n = Integer.parseInt(sc.nextLine());
				if (n > 0) {
					return n;
				} else {
					throw new NumberFormatException();
				}
			} catch (NumberFormatException e) {
				System.out.println("Enter the available value");
			}
		} while (true);
	}

	private static void output(int n) {
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int k = 1; k <= 2 * n - 1; k++) {
				int count = i <= n ? i : 2 * n - i;
				if (k <= count || k >= 2 * n - count)
					System.out.print(k + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
