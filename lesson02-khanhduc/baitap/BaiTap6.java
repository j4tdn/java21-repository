package baitap;

import java.util.Scanner;

public class BaiTap6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;

	
		System.out.print("Nhập số nguyên a (0 <= a < 20): ");
		while (!scanner.hasNextInt()) {
			System.out.println("Không phải số nguyên. Hãy nhập lại.");
			scanner.next(); // Xóa dữ liệu nhập sai
		}
		a = scanner.nextInt();

		
		System.out.print("Nhập số nguyên b (0 <= b < 20): ");
		while (!scanner.hasNextInt()) {
			System.out.println("Không phải số nguyên. Hãy nhập lại.");
			scanner.next(); // Xóa dữ liệu nhập sai
		}
		b = scanner.nextInt();

		
		System.out.print("Nhập số nguyên c (0 <= c < 20): ");
		while (!scanner.hasNextInt()) {
			System.out.println("Không phải số nguyên. Hãy nhập lại.");
			scanner.next(); // Xóa dữ liệu nhập sai
		}
		c = scanner.nextInt();

		
		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a, b), c);

		System.out.println("Số lớn nhất là " + max);
		System.out.println("Số nhỏ nhất là " + min);

		scanner.close();
	}
}
