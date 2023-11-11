package Test04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		try {
			System.out.print("Nhập tên tài khoản: ");
			String username = ip.nextLine();
			
			String password;
			
			do {
					System.out.print("Nhập mật khẩu: ");
					password = ip.nextLine();
					validPassword(password, username);
					
			} while (password == null);
			
			System.out.println("Đăng kí tài khoản thành công!");
			
		} catch (IllegalArgumentException e) {
			System.out.println("Đã có lỗi!!!" + e.getMessage());
		}
		
	}

	public static void validPassword(String password, String username) {
		if (password.length() < 8) {
			throw new IllegalArgumentException("\nMật khẩu phải có ít nhất 8 kí tự!");
		}

		if (!password.matches(".*\\d.*") || !password.matches(".*[A-Z].*") || !password.matches(".*[~!@#$%^&*].*")) {
			throw new IllegalArgumentException("\nMật khẩu phải chứa ít nhất 1 chữ số, 1 kí tự in hoa và 1 kí tự đặc biệt!");
		}

		for (int i = 0; i < username.length() - 2; i++) {
			String substring = username.substring(i, i + 3);
			if (password.contains(substring)) {
				throw new IllegalArgumentException("\nKhông được trùng quá 3 ký tự với tên tài khoản!");
			}
		}
	}

}
