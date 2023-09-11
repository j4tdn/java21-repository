package view;

import java.util.Scanner;

public class Ex06LargestSmallestNumber {
	public static void main(String[] args) {
		int a = inputData("a");
		int b = inputData("b");
		int c = inputData("c");
		
		System.out.println("Max = " + (a > b ? (a > c ? a: c) : (b > c ? b : c)));
		System.out.println("Min = " + (a < b ? (a < c ? a: c) : (b < c ? b : c)));
	}

	private static int inputData(String s) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập " + s + " = ");
		String number = ip.nextLine();
		
		while (!isNumeric(number) || Integer.parseInt(number) < 0 || Integer.parseInt(number) > 19) {
			System.out.print("Nhập lại " + s + " = ");
			number = ip.nextLine();
		}
		//ip.close();
		
		return Integer.parseInt(number);
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
