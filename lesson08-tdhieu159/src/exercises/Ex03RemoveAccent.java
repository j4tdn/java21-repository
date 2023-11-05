package exercises;

import java.text.Normalizer;
import java.util.Scanner;

public class Ex03RemoveAccent {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Chuỗi nhập: ");
		String text = ip.nextLine();
		System.out.println("Chuỗi không dấu: " + removeAccent(text));
	}

	public static String removeAccent(String text) {
		text = Normalizer.normalize(text, Normalizer.Form.NFD);
		text = text.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		return text;
	}
	
}