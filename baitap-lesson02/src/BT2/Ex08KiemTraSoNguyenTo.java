package BT2;

import java.util.Scanner;

public class Ex08KiemTraSoNguyenTo {

	public static void checkPrime(int n) {
		int original = n;
		if (n < 2) {
			System.out.println(original + " không là là số nguyên tố");
		}
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println(original + " không là số nguyên tố");
				return;
			}
		}
		System.out.println(original + " là số nguyên tố");
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = 0;
		int count = 0;
		do {
			try {
				System.out.print("Nhap vao so nguyen duong n = ");
				n = Integer.parseInt(ip.nextLine());
				if (n <= 0)
					System.out.println("Nhap lai");
				else
					break;

			} catch (NumberFormatException e) {
				System.out.println("Nhap khong hop le");
			}
			count++;
			if (count == 5) {
				System.out.println("Nhap toi da 5 lan");
				return;
			}
		} while (count < 5);
		checkPrime(n);
	}
}