package baitap2;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int n;
		int a[] = new int[10];
		int count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập số hệ 10:");
		n = sc.nextInt();

		while (n != 0) {
			a[count++] = n % 2;
			n /= 2;
		}

		System.out.print("Chuyển sang hệ cơ số 2 là:");
		for (int i = count - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
	}
}

