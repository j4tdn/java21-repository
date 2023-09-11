package view;

import java.util.Scanner;

public class Ex01MultiplesOf2 {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		int numberOfTries = 4;
		System.out.print("Nhập n = ");
		String number = ip.nextLine();
		
		while ((!isNumeric(number) || Integer.parseInt(number) < 1) && numberOfTries > 0) {
			System.out.print("Nhập lại n = ");
			number = ip.nextLine();
			numberOfTries--;
			if(numberOfTries == 0 && !isNumeric(number)) {
				return;
			}
		}
		
		isMultipleOf2(number);
		ip.close();
	}
	
	private static void isMultipleOf2(String numberS) {
		int number = Integer.parseInt(numberS);
		if(number % 2 == 0) {
			System.out.println(number + " is a multiple of 2");
		} else {
			System.out.println(number + " is NOT a multiple of 2");
		}
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
