package baitap2;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Kiểm tra N có đối xứng:");
		n = sc.nextInt();

		int tmp = n;
		int reverse = 0;

		while (tmp != 0) {
			reverse = reverse * 10 + tmp % 10;
			tmp /= 10;
		}

		// In kết quả so sánh:
		System.out.println((n == reverse) ? "True" : "False");

	}
}