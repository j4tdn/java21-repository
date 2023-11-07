package ex03stringwithoutaccent;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class StringWithoutAccent {

	public static void main(String[] args) {
		String vietnameseString = "Em có yêu anh không anh để anh biết còn chờ\n" +
	            "Em xin lỗi em đã có thái độ không đúng với anh";
		
		System.out.println("Input: \n" + vietnameseString);
		String output = removeDiacritics(vietnameseString);
		System.out.println("Output: \n" + output);
	}

	public static String removeDiacritics(String input) {
		// Loại bỏ dấu sử dụng Normalizer
		String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);

		// Sử dụng regular expression để loại bỏ ký tự không phải chữ cái hoặc số
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(normalized).replaceAll("");
	}

}
