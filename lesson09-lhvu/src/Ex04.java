import java.awt.dnd.InvalidDnDOperationException;
import java.util.Scanner;

public class Ex04 {

	/*
	 * 
	 * Bài 4(20đ): Viết chương trình thực hiện chức năng đăng ký tài khoản B1. Nhập
	 * tên tài khoản ví dụ byztkhx256 B2. Nhập mật khẩu admin123 Yêu cầu mật khẩu
	 * như sau: 1. Độ dài mật khẩu: >= 8 2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và
	 * một kí tự đặc biệt (~!@#$%^&*) 3. Không được trùng quá 3 ký tự với tên tài
	 * khoản [Đăng ký khi bắt đầu chương trình] Sau khi đã thỏa mãn yêu cầu thông
	 * báo đăng ký tài khoản thành công
	 */

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		do {
			try {
				System.out.print("Enter your password: ");
				String password = ip.nextLine();
				System.out.print("Enter your ID: ");
				String id = ip.nextLine();
				passWordValid(password, id);
				break;

			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println("Please enter your password again:");
			}
		} while (true);

		ip.close();
		System.out.println("Your password is created success");

	}

	private static void passWordValid(String password, String id) throws RuntimeException {
		if (password.length() < 8 || password.length() > 256) {
			throw new ArithmeticException(
					"Độ dài mật khẩu phải lớn hơn 8 ký tự!" + "\nCó ít nhất 1 ký tự viết hoa!" + "\nCó ít nhất 1 số!"
							+ "\nCó ít nhất 1 ký tự đặc biệt!" + "\nKhông được trùng quá với tên tài khoản");
		}
		if (!password.matches(".*[A-Z].*")) {
			throw new ArithmeticException(
					"Độ dài mật khẩu phải lớn hơn 8 ký tự!" + "\nCó ít nhất 1 ký tự viết hoa!" + "\nCó ít nhất 1 số!"
							+ "\nCó ít nhất 1 ký tự đặc biệt!" + "\nKhông được trùng quá với tên tài khoản");
		}
		if (!password.matches(".*\\d.*")) {
			throw new ArithmeticException(
					"Độ dài mật khẩu phải lớn hơn 8 ký tự!" + "\nCó ít nhất 1 ký tự viết hoa!" + "\nCó ít nhất 1 số!"
							+ "\nCó ít nhất 1 ký tự đặc biệt!" + "\nKhông được trùng quá với tên tài khoản");
		}
		if (!password.matches(".*\\W.*")) {
			throw new ArithmeticException(
					"Độ dài mật khẩu phải lớn hơn 8 ký tự!" + "\nCó ít nhất 1 ký tự viết hoa!" + "\nCó ít nhất 1 số!"
							+ "\nCó ít nhất 1 ký tự đặc biệt!" + "\nKhông được trùng quá 3 ký tự với tên tài khoản");
		}
		
		int count = 0;
		for(int i = 0; i < password.length(); i++) {
			String ch = password.charAt(i) + "";
			if(id.contains(ch)) {
				count++;
			}
			if(count >= 3) {
				throw new ArithmeticException("Không được trừng quá 3 ký tự với tên tài khoản !!!");
			}
		}
	}

}
