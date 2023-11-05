package homework.bai03;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App03 {
	
	// Viết chương trình nhập vào chuỗi TIẾNG VIỆT có dấu bất kì sau đó xuất ra kết quả là chuỗi
	// không dấu.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter any string: ");
		String input = scanner.nextLine().strip().replaceAll("\\s+", " ");
		
		String output = removeDiacritics(input);
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
		
		scanner.close();
	}
	
	private static String removeDiacritics(String input) {
		try {
			String normalizer = Normalizer.normalize(input, Normalizer.Form.NFD);
			Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
			return pattern.matcher(normalizer).replaceAll("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
