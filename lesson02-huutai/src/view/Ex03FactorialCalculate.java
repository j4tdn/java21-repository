package view;

import java.util.Scanner;

public class Ex03FactorialCalculate {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập n = ");
		String number = ip.nextLine();
		
		if(isNumeric(number)) {
			
			System.out.println("Giai thừa của " + number + " là: " + factorial(Integer.parseInt(number)));
		}
		
		ip.close();
	}
	
	private static int factorial(int number) {
		if(number == 1) {
			return 1;
		}
		return (number * factorial(number - 1));
	}
	
	private static boolean isNumeric(String number) {

		if ("".equals(number)) {
			return false;
		}
		final int size = number.length();
		for (int i = 0; i < size; i++) {
			if (!Character.isDigit(number.charAt(i))) {
				return false;
			}
		}

		return true;
	}
}
