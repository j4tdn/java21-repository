package homework;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String input;

		do {
			System.out.print("Nhập chuỗi: ");
			input = ip.nextLine();

			if (checkString(input)) {
				break;
			} else {
				System.out.println("Vui lòng nhập lại!");
			}
		} while (true);
		
		System.out.println("Chuỗi sau khi được viết hoa: " + uppercaseName(input));
		
	}
	
	public static boolean checkString(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static String uppercaseName(String input) {
		String[] words = input.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < words.length; i++) {
			String word = words[i];
			if(word.length() > 0) {
				String name = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
				
				sb.append(name);
				
				if(i < words.length - 1) {
					sb.append(" ");
				}
			} 
		}
		return sb.toString();
	}
	
}
