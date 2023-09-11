package view;

import java.util.Scanner;

public class Ex08PrimeNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		int numberOfTries = 4;
		System.out.print("Nhập n = ");
		String number = ip.nextLine();

		while (numberOfTries > 0 && (!isNumeric(number) || Integer.parseInt(number) < 1) ) {
			System.out.print("Nhập lại n = ");
			number = ip.nextLine();
			numberOfTries--;
			if(numberOfTries == 0 && !isNumeric(number)) {
				return;
			}
		}
		if(isPrimeNumber(number)) {
			System.out.println(number + " là số nguyên tố");
		} else {
			System.out.println(number + " không phải là số nguyên tố");
		}
		
		ip.close();
	}

	private static boolean isPrimeNumber(String numberS) {
		int number = Integer.parseInt(numberS);
		if(number < 2) {
			return false;
		}
		for(int i = 2; i <= number/2; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		
		return true;
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
