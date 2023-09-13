package view;

import java.util.Scanner;

// Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không.

// kiểm tra n có phải là lũy thừa của 2 không
// 2^n = number(số nhập từ bàn phím)
// n = log(number)/log(2)
// --> bài toán kiểm tra có là số nguyên hay không

public class Ex02CheckExponential {
	
	public static void main(String[] args) {
		int N = enterInteger();
		if (isPowerOfTwo(N)) {
			System.out.println(N + " là lũy thừa của 2.");
		} else {
			System.out.println(N + " không phải là lũy thừa của 2.");
		}
		
	}
	
	public static int enterInteger() {
		Scanner scanner = new Scanner(System.in);
		int N = 0;
		int numberOfTries = 5;
		while (numberOfTries > 0) {
			System.out.print("Nhập số nguyên dương N: ");
			if (scanner.hasNextInt()) {
				N = scanner.nextInt();
				if (N > 0) {
					scanner.close();
					return N;
				} else {
					System.out.println("N phải là số nguyên dương. Vui lòng thử lại !");
				}
			} else {
				System.out.println("N phải là số nguyên dương. Vui lòng thử lại !");
				scanner.next(); // Đọc bỏ dòng nhập không hợp lệ
			}
			numberOfTries--;
		}
		scanner.close();
		return -1;
	}
	
	// Hàm kiểm tra xem số N có phải là lũy thừa của 2 hay không
	public static boolean isPowerOfTwo(int N) {
		// ktra n có phải là 1 số nguyên hay không
		if (N < 0) {
			return false;
		}
		double logBase2 = Math.log(N) / Math.log(2);
		System.out.println("Kết quả của logBase2: " + logBase2);
		double roundCeil = Math.ceil(logBase2);
		double roundFloor = Math.floor(logBase2);
		System.out.println("Làm tròn trên: " +roundCeil);
		System.out.println("Làm tròn dưới: " +roundFloor);
		
		return (roundCeil == roundFloor); // Kiểm tra xem logBase2 có phải là số nguyên hay không
	}
}
