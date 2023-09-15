package ex02dangkimuaxe;

import java.util.Scanner;

public class Validate {

	private static final Scanner in = new Scanner(System.in);
	
	public static String inputString(String msg) {	
		while (true) {
			System.out.println(msg);
			String str = in.nextLine();
			if (str == null || str.length() == 0) {
				System.out.println("It can not empty, try again");
				continue;
			}
			return str;
		}
	}
	
	public static double inputDouble(String msg) {
		while (true) {
			try {
				String num_raw = inputString(msg);
				double num = Double.parseDouble(num_raw);
				if (num <= 0) {
					System.out.println("Error information, please enter again!");
					continue;
				}
				return num;
			} catch (NumberFormatException e) {
				System.out.println("It must be a number, try again!");
			}
			
		}
	}
	
	public static int inputIntMinMax(String msg, int min, int max) {
		while (true) {
			try {
				String num_raw = inputString(msg);
				int num = Integer.parseInt(num_raw);
				if (num < min || num > max) {
					System.out.println("Please enter again! It must be range from " + min + " to " + max);
					continue;
				}
				return num;
			} catch (NumberFormatException e) {
				System.out.println("It must be a number, try again!");
			}
			
		}
	}
}
