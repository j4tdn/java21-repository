package bai1;

import java.math.BigInteger;
import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

public class bai1 {
	public static String getMinFract(double decimal) {
		int numerator = (int) (decimal * 1000000);
		int denominator = 1000000;

		int gcd = findGCD(numerator, denominator);

		numerator /= gcd;
		denominator /= gcd;

		return numerator + "/" + denominator;
	}

	public static int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return findGCD(b, a % b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so n");
		int i = 0;
		int k = 0;
		Double n = 0.0;
		while (k != 1) {
			try {

				n = Double.parseDouble(sc.nextLine());
				k = 1;

			} catch (NumberFormatException e) {
				System.out.println("khong hop le nhap lai");
			}

		}
		String result = getMinFract(n);
        System.out.println("Phân số tối giản của số thập phân đó: " + result);
	}

}