package baitap;

import java.util.Scanner;

public class BaiTap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		while (count < 5) {
			System.out.println("Enter a positive integer: ");
			if (sc.hasNextInt()) {
				int a = sc.nextInt();
				if (a > 0 && isPowerOf2(a)) {
					System.out.println(a + " is the power of 2");
					break;
				} else {
					System.out.println(a + " not a power of 2");

				}
			} else {
				System.out.println("Error: Please enter a positive integer....");
				sc.nextLine();

			}
			count++;
		}
		if (count >= 5) {
			System.out.println("You have limited imports: ");
		}
		sc.close();
	}

	public static boolean isPowerOf2(int a) {
		if (a < 0) {
			return false;
		}

		return (a & (a - 1)) == 0;
	}
}
