package view;

import java.util.Scanner;

// Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không.

public class Ex01CheckMultiples {
	
	public static void main(String[] args) {
		int N = enterInteger();
		checkMultiples(N);
	}
	
	public static int enterInteger() {
		Scanner scanner = new Scanner(System.in);
		int numberOfTries = 5;
		int N = 0;
		
		while(numberOfTries > 0) {
			System.out.print("Nhập số nguyên dương N: ");
			if (scanner.hasNextInt()) { //Phương thức này kiểm tra xem mã thông báo tiếp theo trong đầu vào của máy quét này có hiểu là một int sử dụng phương thức nextInt () hay không.
				N = scanner.nextInt();
				if (N > 0) {
					scanner.close();
					return N;
				} else {
					System.out.println("N phải là số nguyên dương. Hãy thử lại !");
				}
			} else {
				System.out.println("N phải là số nguyên dương. Hãy thử lại !");
				scanner.next(); // Đọc bỏ dòng nhập không hợp lệ
			}
			numberOfTries--;
		}
		scanner.close();
		return -1;
	}
	
	private static void checkMultiples(int N) {
		if (N % 2 == 0) {
			System.out.println(N + " là bội của 2");
		} else {
			System.out.println(N + " không phải là bội của 2");
		}
	}
}
