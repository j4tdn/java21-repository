package view;

import java.util.Scanner;

public class Ex01FindTheSimplifyFraction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int errorCount = 0;

		while (errorCount < 3) {
			try {
				System.out.print("Nhập vào một số thực có phần thập phân khác 0: ");
				double decimal = Double.parseDouble(scanner.nextLine());

				if (decimal == 0 || decimal == (int) decimal) {
					throw new NumberFormatException();
				}

				int numerator = (int) (decimal * 100);
				int denominator = 100;
				int[] simplifiedFraction = simplifyFraction(numerator, denominator);

				System.out.println("Phân số tối giản của " + decimal + " là " + simplifiedFraction[0] + "/" +
						simplifiedFraction[1]);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Số bạn nhập không hợp lệ. Vui lòng nhập lại.");
				errorCount++;
			}
		}

		if (errorCount >= 3) {
			System.out.println("Số lần nhập sai vượt quá 3 lần. Kết thúc chương trình.");
		}
	}

	public static int[] simplifyFraction(int numerator, int denominator) {
		int gcd = findGCD(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;
		return new int[] { numerator, denominator };
	}

	public static int findGCD(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}

}
