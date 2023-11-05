package homework;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		String input;

		do {
			System.out.print("Nhập chuỗi có dấu: ");
			input = ip.nextLine();

			if (checkString(input)) {
				break;
			} else {
				System.out.println("Vui lòng nhập lại!");
			}
		} while (true);
		
		System.out.println("Chuỗi không dấu: " + removeDiacritics(input));

	}

	public static boolean checkString(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static String removeDiacritics(String input) {
		String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

		return pattern.matcher(normalized).replaceAll("");

	}

}
