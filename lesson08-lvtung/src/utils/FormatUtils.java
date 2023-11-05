package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatUtils {

	private FormatUtils() {
	}

	public static boolean isValidName(String name) {
		// Kiểm tra xem họ tên chỉ chứa các ký tự [A-Za-z ]
		if (!Pattern.matches("^[A-Za-z ]+$", name)) {
			System.out.println("Họ tên chỉ được chứa các ký tự [A-Za-z ]!");
			return false;
		}

		// Kiểm tra xem có ký tự có dấu hoặc ký tự số trong họ tên không
		Pattern pattern = Pattern.compile("[\\p{InCombiningDiacriticalMarks}\\p{Digit}]");
		Matcher matcher = pattern.matcher(name);

		if (matcher.find()) {
			System.out.println("Họ tên không được chứa ký tự dấu hoặc ký tự số. Vui lòng nhập lại họ tên.");
		}
		return true;
	}
}
