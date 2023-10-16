package test02;

import java.util.Scanner;

public class SpecialNumber {

	public static boolean isSpecialNumber(int n) {

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
			if (sum == n) {
				return true;
			}

		}

		return false;
	}

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập n = ");
		int n = ip.nextInt();
		if (isSpecialNumber(n)) {
			System.out.println(n + " is a special number");
		} else {
			System.out.println(n + " is not a special number");

		}

	}
}
