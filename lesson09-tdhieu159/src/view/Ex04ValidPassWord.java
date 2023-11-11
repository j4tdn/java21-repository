package view;

import java.util.Scanner;

public class Ex04ValidPassWord {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập tên tài khoản: ");
		String account = ip.nextLine();

		System.out.print("Nhập mật khẩu: ");
		String password = ip.nextLine();

		// Check password requirements
		if (checkPassword(password)) {
			System.out.println("Đăng ký tài khoản thành công");
		} else {
			System.out.println("Mật khẩu không hợp lệ");
		}
	}


	public static boolean checkPassword(String password) {
		if (password.length() < 8) {
			return false;
		}

		boolean hasUpperCase = false;
		boolean hasDigit = false;
		boolean hasSpecialChar = false;

		String specialChars = "~!@#$%^&*";

		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);

			if (Character.isUpperCase(ch)) {
				hasUpperCase = true;
			} else if (Character.isDigit(ch)) {
				hasDigit = true;
			} else if (specialChars.indexOf(ch) != -1) {
				hasSpecialChar = true;
			}
		}

		if (!hasUpperCase || !hasDigit || !hasSpecialChar) {
			return false;
		}

		return true;
	}
}