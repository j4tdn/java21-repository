package Ex02Dictionary.check;

import java.util.Scanner;

public class Validation {
	private static final Scanner sc = new Scanner(System.in);
	
	
	public static int checkInput(int min, int max) {
		while(true) {
			try {
				int result = Integer.parseInt(sc.nextLine().trim());
				if(result < min || result > max) {
					throw new NumberFormatException();
				}
			} catch (NumberFormatException e) {
				  System.err.println("Please input number in rage [" + min + ", " + max + "]");
				  System.out.println("Enter again: ");
				
			}
		}
	}
	private static String checkInputString() {
		while(true) {
			String result = sc.nextLine().trim();
			if(result.isEmpty()) {
				System.err.println("Not Empty");
				System.out.println("Enter aganin: ");
			}else {
				return result;
		}
	}
}
	public boolean checkInputYN() {
		System.out.println("Do you want to continue (Y/N): ");
		while(true) {
			String result = checkInputString();
			if(result.equalsIgnoreCase("Y")) {
				return true;
			}
			if(result.equalsIgnoreCase("N")) {
				return false;
			}
			System.err.println("Please input y/Y or n/N");
			System.out.println("Enter again: ");
		}
	}
}
