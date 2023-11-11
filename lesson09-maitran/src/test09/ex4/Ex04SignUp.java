package test09.ex4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import view.bean.User;
import view.exception.InvalidUserValidation;

public class Ex04SignUp {
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		signUp();
	}

	private static void signUp() {
		boolean validPassword = false;

		while (!validPassword) {
			try {
				User user = input();
				validate(user);
				validPassword = true;
			} catch (InvalidUserValidation e) {
				System.out.println("Message --> " + e.getMessage());
				System.out.println("\nPlease enter a valid password.\n");
			}
		}

		System.out.println("\nUser registered successfully!\n");
	}

	private static User input() {
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		System.out.println("Enter password: ");
		String password = sc.nextLine();

		return new User(username, password);
	}

	private static User validate(User checkUser) throws InvalidUserValidation {
		String password = checkUser.getPassword();

		String username = checkUser.getUsername();

		int passLength = password.length();

		if (passLength < 8) {
			throw new InvalidUserValidation("Password length must be larger than 8");
		}

//		Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)
		Pattern digitPattern = Pattern.compile("[\\d+]");
		Pattern uppercasePattern = Pattern.compile("([A-Z]+)");
		Pattern specialCharPattern = Pattern.compile(".*[~!@#$%^&*].*");

		check(digitPattern, "Password must contain at least one digit", password);
		check(uppercasePattern, "Password must contain at least one uppercase letter", password);
		check(specialCharPattern, "Password must contain at least one special character", password);

//Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]

		if (count(username, password) > 3) {
			throw new InvalidUserValidation(
					"Password should not have more than 3 common characters with the username.");
		}
		return checkUser;

	}

	private static int count(String username, String password) {
		int count = 0;
		for (char c : username.toCharArray()) {
			if (password.contains(String.valueOf(c))) {
				count++;
			}
		}
		return count;
	}

	private static void check(Pattern pattern, String message, String password) throws InvalidUserValidation {
		Matcher matcher = pattern.matcher(password);
		if (!matcher.find()) {
			throw new InvalidUserValidation(message);
		}
	}
}
