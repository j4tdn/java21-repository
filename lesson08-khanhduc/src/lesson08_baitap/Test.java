package lesson08_baitap;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập họ tên: ");
		String hoTen = scanner.nextLine();

		// Xóa khoảng trắng thừa
		hoTen = hoTen.strip().replaceAll("\\s+", " ");

		// Tách chuỗi thành mảng từ
		String[] words = hoTen.split(" ");

		// Viết hoa chữ cái đầu mỗi từ
		String result = "";
		for (String word : words) {
			result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
		}

		// In kết quả
		System.out.println(result.trim());
	}
}
