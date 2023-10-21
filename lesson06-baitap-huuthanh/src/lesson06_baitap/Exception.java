package lesson06_baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exception {
	public boolean numberOfCharacterPassFrom8To256(String arr) {
		if (arr.length() < 8 || arr.length() > 256) {
			System.out.println("Lỗi không phù hợp số lượng phần tử của pass. ");
			return false;
		}
		return true;
	}

//------------------------------//
	public boolean checkLeast1LowercaseAlphabeticCharater(String arr) {
		int count = 0;
		for (int i = 0; i < arr.length(); i++) {
			char ch = arr.charAt(i);
			if (Character.isLowerCase(ch)) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Không tồn tại kí tự thường nào trong pass");
			return false;
		}
		return true;
	}

//------------------------------//	
	public boolean checkLeast1UppercaseAlphabeticCharater(String arr) {

		int count = 0;
		for (int i = 0; i < arr.length(); i++) {
			char ch = arr.charAt(i);
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Không tồn tại kí tự hoa nào trong pass");
			return false;
		}
		return true;
	}

//------------------------------//
	public boolean checkLeast1Number(String arr) {

		int count = 0;
		for (int i = 0; i < arr.length(); i++) {
			char ch = arr.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Không tồn tại kí tự số nào trong pass");
			return false;
		}
		return true;
	}

//------------------------------//
	public boolean checkLeast1SpecialCharacter(String arr) {

		int count = 0;
		for (int i = 0; i < arr.length(); i++) {
			char ch = arr.charAt(i);
			if (!Character.isLetterOrDigit(ch)) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Không tồn tại kí tự đặt biệt nào trong pass");
			return false;
		}
		return true;

	}

//------------------------------//
	public boolean checkLeatEmail(String arr) {
		String check = "@gmail.com";
		String tam = "";
		for (int i = arr.length() - 10; i < arr.length(); i++) {
			char character = arr.charAt(i);
			String myString = Character.toString(character);
			tam = tam.concat(myString);
		}
		if (check.equals(tam) == false) {
			System.out.println("Phần sau của Email không hợp lệ. ");
			return false;
		}
		return true;
	}

//------------------------------//	
	public boolean validateEmail(String email) {
		String emailRegex = "^[A-Za-z0-9]+[A-Za-z0-9_\\-.]*[A-Za-z0-9]*@[A-Za-z]+\\.[A-Za-z]{2,}$";
		String combinedRegex = "^(?!.*[-.]{2})(?!.*-@)(?!.*\\.\\..*@)(?!^\\..*@)(?!.*#.*@)" + emailRegex;
		Pattern pattern = Pattern.compile(combinedRegex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
//------------------------------//		

	public static String readNumber(int n) {
		String[] units = { "", "Mươi", "Trăm", "Mười" };
		String[] digits = { "", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín" };
		if (n < 1 || n > 999) {
			return "Số n không hợp lệ";
		}

		if (n == 0) {
			return "Không";
		}

		String result = "";

		int digit1 = n % 10;
		int digit10 = (n / 10) % 10;
		int digit100 = n / 100;

		if (n >= 100) {
			result = result.concat(digits[digit100]).concat(" ").concat(units[2]).concat(" ");
		}

		if (n >= 10) {
			if (digit10 == 1) {
//				result += units[1] + " ";
				result = result.concat(units[3]).concat(" ");
			} else {
				result += digits[digit10] + " " + units[0] + " ";
			}
			if (digit1 == 0 && digit10 != 1 && n != 10 && digit10 != 0)
				result = result.concat(units[1]);
		}

		if (n > 0) {
			if (digit10 == 0 && digit1 != 0 && n > 10) {

				result += "linh " + digits[digit1] + " ";
			} else if (digit10 == 1) {
				result = result.concat(digits[digit1]).concat(" ");
			} else {
				result = result.concat(digits[digit1]).concat(" ");
			}
		}

		return result.trim();
	}

}
