package BT2;

import java.util.Scanner;

public class Ex07ChuyenHe10SangHe2 {

	public static void changeDecimalToBinary(int n) {
//		// Cách 1: 
//		System.out.println("Đổi số " + n + " từ hệ thập phân sang nhị phân: " + Integer.toBinaryString(n));
		
		// Cách 2:
		int a[] = new int[40];
		int index = 0;
		while (n > 0) {
			a[index++] = n % 2;
			n = n / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
		
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
		changeDecimalToBinary(n);
	}
}