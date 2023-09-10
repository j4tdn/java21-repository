package view;

import java.util.Scanner;

// Viết chương trình(hàm) kiểm tra số nguyên N có phải là số nguyên tố hay không.

public class Ex08CheckPrime {
	public static void main(String[] args) {
		int n, maximumNumber = 5;
		n = enterInteger("Nhập số nguyên dương n: ", maximumNumber);
		if (isPrime(n)) {
			System.out.println(n + " là số nguyên tố.");
		} else {
			System.out.println(n + " không phải là số nguyên tố.");
		}
	}
	
	public static int enterInteger(String prompt, int maximumNumber) {
		Scanner sc = new Scanner(System.in);
		int n;
		int numberOfTries = 0;
		while (numberOfTries < maximumNumber) {
			System.out.println(prompt);
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				if (n > 0) {
					sc.close();
					return n;
				} else {
					System.out.println("n phải là số nguyên dương. Hãy thử lại.");
				}
			} else {
				System.out.println("n phải là số nguyên dương. Hãy thử lại.");
				sc.next(); // Đọc bỏ dòng nhập không hợp lệ
			}
			numberOfTries++;
		}
		System.out.println("Bạn đã nhập sai quá " + maximumNumber + " lần. Kết thúc chương trình.");
		System.exit(0);
		sc.close();
		return 0;
	}
	
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
