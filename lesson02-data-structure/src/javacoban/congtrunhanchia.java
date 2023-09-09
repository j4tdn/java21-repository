package javacoban;

import java.util.Scanner;

public class congtrunhanchia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập số a: ");
		int a = sc.nextInt();

		System.out.print("Nhập số b: ");
		int b = sc.nextInt();

		int tong = a + b;
		int hieu = a - b;
		int tich = a * b;
		int thuong = a / b;
		int du = a % b;

		System.out.println("Tổng a + b = " + tong);
		System.out.println("Hiệu a - b = " + hieu);
		System.out.println("Tích a * b = " + tich);
		System.out.println("Thương a / b = " + thuong);
		System.out.println("Dư a % b ="+du);
	}
}
