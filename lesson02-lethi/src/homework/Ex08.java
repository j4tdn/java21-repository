package homework;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		while (true) {
			// Nhập giá trị cho n
			System.out.print("Nhập n = ");
			if (ip.hasNextInt()) {
				int n = ip.nextInt();
				if (n < 1) {
					break;
				} else {
					if (isPrime(n)) {
						System.out.println(n + " là số nguyên tố");
					} else {
						System.out.println(n + " không phải là số nguyên tố");
					}

				}
			} else {
				System.out.println("Lỗi: Vui lòng chỉ nhập số nguyên.");
				ip.next(); // Đọc bỏ giá trị không hợp lệ
			}
		}

	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
