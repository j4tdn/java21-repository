package BT2;

import java.util.Scanner;

public class Ex05KiemTraSoDoiXung {
	
	public static void kiemTraDoiXung(int n) {
		int original = n;
		int reversed = 0;
		
		while (n != 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n = n / 10;
		}
		
		if (reversed == original) {
			System.out.println(original + " là số đối xứng");
		} else {
			System.out.println(original + " không là só đối xứng");
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
		kiemTraDoiXung(n);
	}	
	
}
