package leson2;

import java.math.BigInteger;
import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

public class bai5 {
	public static BigInteger giaithua(int n) {
		if (n == 0 || n == 1) {
			return BigInteger.ONE;
		} else {
			BigInteger t = BigInteger.ONE;
			for (int i = 2; i <= n; i++) {
				t = t.multiply(BigInteger.valueOf(i));
			}
			return t;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so n");
		int i = 0;
		int k = 0;
		int n = 0;
		while (k != 1) {
			try {

				n = Integer.parseInt(sc.nextLine());
				if (n < 10)
					System.out.println("Nhap lai");
				else
					k = 1;

			} catch (NumberFormatException e) {
				System.out.println("khong hop le nhap lai");
			}

		}
		// System.out.println(s);
		int h = 0;
		int t = 0;
		int a[] = new int[100000000];
		// System.out.println(s.length());
		for (int i1 = 0; n != 0; i1++) {
			a[i1] = n % 10;
			n = n / 10;
			h++;
		}

		for (int i1 = 0; i1 < h / 2; i1++) {
			if (a[i1] == a[h - i1 - 1])
				t = t + 1;
		}
		if ((double) t == (h / 2))
			System.out.println("T");
		else
			System.out.println("F");
	}
}
