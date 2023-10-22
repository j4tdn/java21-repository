package ex03checkemail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {

	public static boolean isValidEmail(String email) {

		String emailPattern = "^[a-zA-Z0-9_.\\-]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+$";
		Pattern pattern = Pattern.compile(emailPattern);
		Matcher matcher = pattern.matcher(email);

		return matcher.matches();
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		while (true) {
			System.out.print("Nhập địa chỉ email: ");
			String email = ip.nextLine();

			if (isValidEmail(email)) {
				System.out.println("Địa chỉ email hợp lệ: " + email);
				break;
			} else {
				System.out.println("Lỗi: Địa chỉ email không hợp lệ. Vui lòng thử lại.");
			}
		}
	}
}
