package view;

import java.util.Scanner;

public class Ex01Fix {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		String text = ip.nextLine();
		
		int wrongTime = 0;
		final int maxWrongTime = 5;
		
		
		while(true) {
			if(isPositiveNumber(text)) {
				break;
			}
			wrongTime++;
			if(wrongTime == 5) {
				System.out.println("Tài khoản bị khoá");
				return;
			}
			System.out.println("Please enter a valid number(" + wrongTime + ")");
		}
		
		int number = Integer.parseInt(text);
		
		boolean isEven = number % 2 == 0;
		
		System.out.println("isEven --> " + isEven);
	}

	private static boolean isPositiveNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			// Kiểm tra kí tự phải là số ko
			if(!Character.isDigit(letter)) {
				return false;
			}
		}
		return Integer.parseInt(text) > 0;
	}
	
}
