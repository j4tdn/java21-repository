package homework;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		do {
			try {
				System.out.print("Nhập mật khẩu: ");
				String password = ip.nextLine();

				if (isValidPassword(password)) {
					System.out.println("Mật khẩu hợp lệ!");
					break;
				} else {
					System.out.println("Mật khẩu không hợp lệ!");
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Lỗi! " + e.getMessage());
			}

		} while (true);

		ip.close();

	}

	public static boolean isValidPassword(String password) {
		if (password.length() < 8 || password.length() > 256) {
			throw new IllegalArgumentException("Mật khẩu phải chứa ít nhất 8 ký tự và tối đa 256 ký tự.");
		}
		if (!password.matches(".*[a-z].*")) {
			throw new IllegalArgumentException("Mật khẩu phải chứa ít nhất 1 chữ cái thường.");
		}
		if (!password.matches(".*[A-Z].*")) {
			throw new IllegalArgumentException("Mật khẩu phải chứa ít nhất 1 chữ cái in hoa.");
		}
		if (!password.matches(".*\\d.*")) {
			throw new IllegalArgumentException("Mật khẩu phải chứa ít nhất 1 chữ số.");
		}
		if (!password.matches("^.*[!@#$%&*()_+=,.:;/^|<>?{}\\\\[\\\\]~-]+.*$")) {
			throw new IllegalArgumentException("Mật khẩu phải chứa ít nhất 1 ký tự đặc biệt.");
		}
		return true;

	}

}
