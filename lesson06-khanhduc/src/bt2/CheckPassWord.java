package bt2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPassWord {
	public static void validatePassword(String password) {
		if (password.length() < 8 || password.length() > 256) {
			throw new IllegalArgumentException("Mật khẩu phải chứa từ 8 đến 256 ký tự.");
		}
		
		//Pattern đại diện cho 1 mẫu chuỗi mà chúng tta muốn tìm kiếm, truy xuất
		//Matcher được sử dụng để tìm kiếm và so sánh có khớp với các chuỗi trong ăn bản với mẫu đã được biên dịch từ đối tượng Pattern
		// tạo một đối tượng Matcher bằng cách gọi phương thức matcher trên đối tượng Pattern

		Pattern lowercasePattern = Pattern.compile("[a-z]");
		Matcher lowercaseMatcher = lowercasePattern.matcher(password);

		Pattern uppercasePattern = Pattern.compile("[A-Z]");
		Matcher uppercaseMatcher = uppercasePattern.matcher(password);

		Pattern digitPattern = Pattern.compile("\\d");
		Matcher digitMatcher = digitPattern.matcher(password);

		Pattern specialCharPattern = Pattern.compile("[@#$()+\\-<>?]");
		Matcher specialCharMatcher = specialCharPattern.matcher(password);

		if (!lowercaseMatcher.find() || !uppercaseMatcher.find() || !digitMatcher.find()
				|| !specialCharMatcher.find()) {
			throw new IllegalArgumentException(
					"Mật khẩu phải chứa ít nhất 1 chữ thường, 1 chữ hoa, 1 số và 1 ký tự đặc biệt.");
		}

		if (password.contains("ten") || password.contains("email")) {
			throw new IllegalArgumentException("Mật khẩu không được chứa tên hoặc địa chỉ email.");
		}
	}
}
