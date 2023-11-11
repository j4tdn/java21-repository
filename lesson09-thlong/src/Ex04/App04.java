package Ex04;

import java.util.Scanner;

public class App04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập tên tài khoản: ");
		String name = ip.nextLine();
		while (true) {
			try {
				System.out.println("Nhập mật khẩu: ");
				String password = ip.nextLine();
				checkPassword(name, password);
				System.out.println("Đăng ký tài khoản thành công");
				break;
			} catch (RuntimeException e) {
				System.out.println("ef -> " + e.getMessage());
			}
		}
	}

	private static void checkPassword(String name, String password){
		int count = 0;
		String nameLowercase = name.toLowerCase();
		String passwordLowercase = password.toLowerCase();

		for (int i = 0; i < nameLowercase.length(); i++) {
			for (int j = 0; j < passwordLowercase.length(); j++) {
				if (i == j) {
					count += 1;
				}
			}
		}

		if (password.length() < 8) {
			throw new IllegalArgumentException("Mật khẩu phải có ít nhất 8 ký tự");
		} else if (!password.matches(".*[A-Z].*")) {
			throw new IllegalArgumentException("Có ít nhất 1 ký tự viết hoa");
		} else if (!password.matches(".*[0-9].*")) {
			throw new IllegalArgumentException("Có ít nhất 1 ký tự số");
		} else if (!password.matches(".*[^a-zA-Z0-9].*")) {
			throw new IllegalArgumentException("Có ít nhất 1 ký tự đặc biệt");
		} else if (count == 3) {
			throw new ArithmeticException("Không được trùng quá 3 ký tự với tên tài khoản");
		}
	}
}
