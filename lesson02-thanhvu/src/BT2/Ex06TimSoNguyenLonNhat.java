package BT2;

import java.util.Scanner;

public class Ex06TimSoNguyenLonNhat {

	public static void maxOfThreeNum(int a, int b, int c) {
	    int max = a;
		if (b > max && b > c) {
			max = b;
		} else if (c > max && c > b) {
			max = c;
		}
		System.out.println("Gia tri lon nhat trong 3 so la: " + max);
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
		int count = 0;
		do {
			try {
				System.out.print("Nhap vao so nguyen duong a = ");
				a = Integer.parseInt(ip.nextLine());
				if (a <= 0)
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
		
		do {
			try {
				System.out.print("Nhap vao so nguyen duong b = ");
				b = Integer.parseInt(ip.nextLine());
				if (b <= 0)
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
		
		do {
			try {
				System.out.print("Nhap vao so nguyen duong c = ");
				c = Integer.parseInt(ip.nextLine());
				if (c <= 0)
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
		maxOfThreeNum(a, b, c);
	}
}
