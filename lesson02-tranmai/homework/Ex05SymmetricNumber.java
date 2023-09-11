package lesson02;

import java.util.Scanner;

public class Ex05SymmetricNumber {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String text = "";
		
		do {
			System.out.print("Enter number: ");
			text = ip.nextLine();
		} while (!isNumber(text));

		StringBuilder sb = new StringBuilder();
		sb.append(text);
		sb.reverse();
		String sb1 = sb.toString();
		if(text.equals(sb1)) {
			System.out.println(text + " is a symmetric number");
		} else {
			System.out.println(text + " is NOT a symmetric number");
		}		
		ip.close();

	}
	private static boolean isNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			char index = text.charAt(i);
			if (!Character.isDigit(index)) {
				return false;
			}
		}
		return true;
	}
	
}
