package BT2;

import java.util.Scanner;

public class Ex02KiemTraPhaiLaLuyThuaCua2 {

	public static void checkNum(int n) {
		while (n != 1) {	
			if (n % 2 != 0) {
				System.out.println("So da nhap khong la luy thua");
				return;
			}
			n = n/2;
		}
		if (n == 1) System.out.println("So da nhap la luy thua");
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
		checkNum(n);
	}
}