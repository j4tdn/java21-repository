package utils;

import java.util.Scanner;

public class IoUtils {
	
	private static final Scanner ip = new Scanner(System.in);
	
	private IoUtils() {
	}
	
	public static int enterNumber() {
		System.out.print("Enter a number: ");
		String text = ip.nextLine();
		
		final int maxWrongTime = 5;
		int wrongTime = 0;
		
		while(true) {
			if (text.matches("\\d+") && Integer.parseInt(text) > 0) {
				break;
			}
			wrongTime++;
			if (wrongTime == maxWrongTime) {
				System.out.println("Your account is locked");
				System.exit(0);
			}
			System.out.print("Please enter a positive number(" + wrongTime + "): ");
			text = ip.nextLine();
		}
		
		return Integer.parseInt(text);
	}
}
