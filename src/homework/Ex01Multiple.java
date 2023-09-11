package lesson02;

import java.util.Scanner;

public class Ex01Multiple {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		int max = 5;
		String text = "";
		System.out.println("\n--- CHECK MULTIPLE OF 2 ---\n");
		do {
			System.out.print("Enter number: ");
			text = ip.nextLine();
			max--;
//			System.out.println(max);
			if(max < 1 ) {
				System.out.println("Maximum attempts reached.");
				return;
			}
			
		} while (!isNumber(text));

		int number = Integer.parseInt(text);
		System.out.println(number + " --> " + isMultiple(number));
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

	private static boolean isMultiple(int number) {
		if (number < 0 || number % 2 != 0) {
			return false;
		}
		return true;
	}
}
