package bt3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số hàng của tam giác Pascal: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int num = 1; // Phần tử đầu tiên luôn bằng 1

			// In các số trong hàng hiện tại
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num * (i - j) / (j + 1); // Tính toán phần tử tiếp theo
			}

			System.out.println(); // Xuống dòng sau khi in xong một hàng
		}
	}
}
