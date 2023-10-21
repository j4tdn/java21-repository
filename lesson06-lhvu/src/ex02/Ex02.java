package ex02;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		//System.out.print("Enter your password: ");
		//System.out.print("ur pass is : " +password);
		
		do {
			try {System.out.print("Enter your password: ");
				String password = ip.nextLine();
				passWordValid(password);
				break;
				
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println("Please enter your password again:");
			}
		} while (true);
		
		ip.close();
		System.out.println("Your password is created success");
		
	}
	private static void passWordValid (String password) throws RuntimeException {
		if (password.length()< 8 || password.length()>256) {
			throw new ArithmeticException("At least 8 characters & At most 256 characters");
		}
		if (!password.matches(".*[a-z].*")) {
			throw new ArithmeticException("At least 1 lơwercase alphabetic character");
		}
		if (!password.matches(".*[A-Z].*")) {
			throw new ArithmeticException("At least 1 uppercase alphabetic character");
		}
		if (!password.matches(".*\\d.*")) {
			throw new ArithmeticException("At least 1 number");
		}
		if (!password.matches(".*\\W.*")) {
			throw new ArithmeticException("At least 1 special character");
		}
	}
}
