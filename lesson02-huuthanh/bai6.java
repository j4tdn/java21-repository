package homework;

import java.math.BigInteger;
import java.util.Scanner;

public class bai6 {
	public static int check(int n, int i) {
		int k = 0;
		// int n=0;
		while (k != 1) {
			try {

				Scanner sc = new Scanner(System.in);
				n = Integer.parseInt(sc.nextLine());
				if (n < 0)
				{
					System.out.print("So thu " + i + " khong hop le: ");
					System.out.println("Nhap lai");
				}
					
				else
					k = 1;

			} catch (NumberFormatException e) {
				System.out.print("So thu " + i + " khong hop le: ");
				System.out.println("Nhap lai");
			}

		}
		return n;
	}

	public static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public static int min(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("nhap so n");
		int t = 0;
		int a[] = new int[3];
		// int n=sc.nextInt();
		for (int i = 0; i < 3; i++) {
			System.out.println("Nhap vao so thu " + (i + 1));
			a[i] = check(0,i+1);
		}
		int min = 0;
		int max = 0;
		for (int i = 0; i < 2; i++) {
			min = min(a[i], a[i + 1]);
			max = max(a[i], a[i + 1]);

		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
}
