package utils;

public class validationUtils {
	public static boolean isValidString(String pattern, String text, String message) {
		if (!text.matches(pattern)) {
			System.out.println(message);
			return false;
		}
		return true;
	}
	


}