package view;

import java.util.Scanner;

//Viết chương trình kiểu tra N có phải là số đối xứng hay không

public class Ex05CheckReversed {

	public static void main(String[] args) {
		int n = enterInteger();
		if (checkReversed(n)) {
			System.out.println(n + " là số đối xứng");
		} else {
			System.out.println(n + " không phải là số đối xứng");
		}
	}
	
	public static int enterInteger() {
		Scanner scanner = new Scanner(System.in);
		int numberOfTries = 5;
		int n = 0;
		while (numberOfTries > 0) {
			System.out.print("Nhập số nguyên dương N có hai chữ số trở lên: ");
			if (scanner.hasNextInt()) {
				n = scanner.nextInt();
				if (n > 10) {
					scanner.close();
					return n;
				} else {
					System.out.println("N phải là số nguyên dương có hai chữ số trở lên. Hãy thử lại");
				}
			} else {
				System.out.println("N phải là số nguyên dương có hai chữ số trở lên. Hãy thử lại");
				scanner.next(); // Đọc bỏ dòng nhập không hợp lệ
			}
			numberOfTries--;
		}
		scanner.close();
		return -1;
	}
	
	public static boolean checkReversed(int n) {
		int originalNumber = n;
		int reversedNumber = 0;
		
		while (n != 0) {
			int digit = n % 10;
			reversedNumber = reversedNumber * 10 + digit;
			n /= 10;
		}
		return originalNumber == reversedNumber;
	}
}
