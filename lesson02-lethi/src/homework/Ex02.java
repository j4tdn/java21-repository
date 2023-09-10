package homework;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		int n;

		while (true) {
			System.out.print("Nhập n = ");
			if (ip.hasNextInt()) {
				n = ip.nextInt();
				if (powerOfTwo(n)) {
					System.out.println(n + " --> true");
				} else {
					System.out.println(n + " --> false");
				}
			} else {
				System.out.println("Lỗi! Vui lòng nhập lại giá trị n");
				ip.next();
			}
		}
	}

	public static boolean powerOfTwo(int n) {
		if (n <= 0) {
			return false;
		} else {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}
}
