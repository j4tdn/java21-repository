package lesson02;

import java.util.Scanner;

public class Ex03Factorial {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String text = "";
		System.out.println("\n--- FIND FACTORIAL ----\n");
		do {
			System.out.println("Enter number: ");
			text = ip.nextLine();
		} while (!isNumber(text));
		
		int number = Integer.parseInt(text);
//		System.out.print("\n" + text + "! = " + findFactorial(number));
		System.out.print("\n" + text + "! = " + findFacRecursive(number));
		ip.close();
	}
	
	
	private static boolean isNumber(String text) {
		for(int i = 0; i < text.length(); i++) {
			char index = text.charAt(i);
			if(!Character.isDigit(index)) {
				return false;
			}
		}
		return true;
	}
//no recursive
	private static long findFactorial(int number) {
		long result = 1;
		if(number == 0 || number == 1) {
			return result;
		} else {
			for(int i = number; i > 1; i--) {
				result *= i;
			}
			return result;
		}
	}
	
//recursive
	
	private static long findFacRecursive(int number) {
		if(number > 0 ) {
			return number * findFacRecursive(number - 1);
		} else {
			return 1;
		}
	}
}
