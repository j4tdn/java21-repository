package bai3;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Main {
	public static String remove(String string) {
		String string1 = Normalizer.normalize(string, Normalizer.Form.NFD);

		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(string1).replaceAll("");

	}

	public static void main(String[] args) {

		String string = "Đặng Hữu Thanh 123";
		System.out.println(remove(string));
	}
}
