package ex02ValidateLogin;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import view.bean.User;
import view.exception.InvalidUserValidation;

public class Ex02Test {
	public static void main(String[] args) {
		try {
			validate(new User("mnbvcxz", "aaMAITAN@123"));
			System.out.println("PASSWORD IS VALID!");
		} catch (InvalidUserValidation e) {
			System.out.println("Message --> " + e.getMessage());
		}
	}

	private static User validate(User checkUser) throws InvalidUserValidation {
		String password = checkUser.getPassword();

		int passwordLength = password.length();

		// 1-2. Pass có ít nhất 8 kí tự, tối đa 256 kí tự
		if (passwordLength < 8 || passwordLength > 256) {
			throw new InvalidUserValidation("Password length must be between 8 and 256 characters");
		}

		// 3. Pass Có ít nhất 1 chữ thường, 1 chữ hoa, 1 số, 1 kí tự đặc biệt
		List<String> validationErrors = new ArrayList<>();
		Pattern lowercasePattern = Pattern.compile("(?=.*[a-z])");
		Pattern uppercasePattern = Pattern.compile("(?=.*[A-Z])");
		Pattern digitPattern = Pattern.compile("(?=.*\\d)");

		Pattern specialCharPattern = Pattern.compile(".*[~!@#$%^&*()_\\[\\]{}|;:,.<>/\\?-].*");

		check(lowercasePattern, "Password must contain at least one lowercase letter", password);
		check(uppercasePattern, "Password must contain at least one uppercase letter", password);
		check(digitPattern, "Password must contain at least one digit", password);
		check(specialCharPattern, "Password must contain at least one special character", password);

		if (!validationErrors.isEmpty()) {
			throw new InvalidUserValidation(String.join("\n", validationErrors));
		}
		return checkUser;
	}

	private static void check(Pattern pattern, String message, String password) throws InvalidUserValidation {
		Matcher matcher = pattern.matcher(password);
		if (!matcher.find()) {
			throw new InvalidUserValidation(message);
		}
	}
}
