package baitap;

import java.util.Scanner;

public class BaiTap7 {

	public static String chuyenDoiThapPhanSangNhiPhan(int n) {
		if (n == 0) {
			return "0";
		}

		StringBuilder binary = new StringBuilder();
		while (n > 0) {
			int remainder = n % 2;
			binary.insert(0, remainder);
			n = n / 2;
		}

		return binary.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N;

		System.out.print("Nhập số tự nhiên ở hệ cơ số 10 (thập phân): ");
		while (!scanner.hasNextInt()) {
			System.out.println("Không phải số tự nhiên. Hãy nhập lại.");
			scanner.next(); // Xóa dữ liệu nhập sai
		}
		N = scanner.nextInt();

		if (N < 0) {
			System.out.println("Số tự nhiên phải không âm. Hãy nhập lại.");
		} else {
			String nhiPhan = chuyenDoiThapPhanSangNhiPhan(N);
			System.out.println("Số ở hệ cơ số 2 (nhị phân) là: " + nhiPhan);
		}

		scanner.close();
	}
}
