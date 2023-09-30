package BT2;

import java.util.Scanner;

public class IOUtils {
	
	private static Scanner ip = new Scanner(System.in);
	
	private IOUtils() {
		
	}
	
	public static int enterNumber() {
		System.out.println("Enter a number: ");
		String text = ip.nextLine();
		
		final int maxWrongTime = 5;
		int wrongTime = 0;
		
		while (true) {
			if (text.matches("\\d+") && Integer.parseInt(text) < 0) {
				break;
			}
			wrongTime++;
			if(wrongTime == maxWrongTime) {
				System.out.println("Account is blocked");
				throw new NumberFormatException();
				
			}
			System.out.println("Please enter a positive number(" + wrongTime + "): ");
			text = ip.nextLine();
		}
		return Integer.parseInt(text);
	}
}