package ex04;

import java.util.Scanner;

public class AccountRegistration {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập tên tài khoản: ");
		String username = scanner.nextLine();

		String password;
		do {
			System.out.print("Nhập mật khẩu: ");
			password = scanner.nextLine();
		} while (!isValidPassword(password, username));

		System.out.println("Đăng ký tài khoản thành công!");
	}

	public static boolean isValidPassword(String password, String username) {
		if (password.length() < 8) {
			System.out.println("Mật khẩu phải có ít nhất 8 ký tự.");
			return false;
		}

		if (!password.matches(".*\\d.*") || !password.matches(".*[A-Z].*") || !password.matches(".*[~!@#$%^&*].*")) {
			System.out.println("Mật khẩu cần chứa ít nhất 1 số, 1 ký tự in hoa và 1 ký tự đặc biệt.");
			return false;
		}

		int count = 0;
		for (int i = 0; i < password.length() - 2; i++) {
			if (username.toLowerCase().contains(password.substring(i, i + 3).toLowerCase())) {
				count++;
			}
		}
		if (count > 3) {
			System.out.println("Mật khẩu không được trùng quá 3 ký tự với tên tài khoản.");
			return false;
		}

		return true;
	}
}
