package ex01;

import java.util.Scanner;

public class FindX {
	
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("x = " + findX());
	}
	
	private static double findX() {
		int a = input("a");
		int b = input("b");
		do {
			try {
				return -b /a;
			} catch (ArithmeticException e) {
				System.out.println("Enter a != 0");
				a = input("a");
			}
		} while (true);
	}

	private static int input(String message) {
		int x;
		do {
			try {
				System.out.print("Input: " + message + " = ");
				x = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.print("Input again\n");
			}
		} while (true);
		return x;
	}
}
