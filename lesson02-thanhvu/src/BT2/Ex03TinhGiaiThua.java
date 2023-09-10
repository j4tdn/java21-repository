package BT2;

import java.util.Scanner;

public class Ex03TinhGiaiThua {

	public static void tinhGiaiThua(int n) {
		int S = 1;
		for (int i = 1; i <= n; i++) {
			S = S*i;
		}
		System.out.println("Giai thua cua " + n + " la " + S);
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
		tinhGiaiThua(n);
	}
}
