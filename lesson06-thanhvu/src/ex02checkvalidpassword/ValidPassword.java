package ex02checkvalidpassword;

import java.util.Scanner;

public class ValidPassword {

	public static void checkNumberOfCharacter(String arr) throws PasswordException {
		if (arr.length() < 8 || arr.length() > 256) {
			throw new PasswordException("At least 8 characters and at most 256 character");
		}
	}

	public static void checkLeast1LowercaseAlphabeticCharater(String arr) throws PasswordException {
		int count = 0;
		for (int i = 0; i < arr.length(); i++) {
			char ch = arr.charAt(i);
			if (Character.isLowerCase(ch)) {
				count++;
			}
		}
		if (count == 0) {
			throw new PasswordException("At least 1 lowercase alphabetic character(a, b, c...)");
		}
	}

	public static void checkLeast1UppercaseAlphabeticCharater(String arr) throws PasswordException {

		int count = 0;
		for (int i = 0; i < arr.length(); i++) {
			char ch = arr.charAt(i);
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		if (count == 0) {
			throw new PasswordException("At least 1 uppercase alphabetic character(A, B, C...)");
		}
	}

	public static void checkLeast1Number(String arr) throws PasswordException {

		int count = 0;
		for (int i = 0; i < arr.length(); i++) {
			char ch = arr.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		if (count == 0) {
			throw new PasswordException("At least 1 number (1, 2, 3...)");
		}
	}

	public static void checkLeast1SpecialCharacter(String arr) throws PasswordException {

		int count = 0;
		for (int i = 0; i < arr.length(); i++) {
			char ch = arr.charAt(i);
			if (!Character.isLetterOrDigit(ch)) {
				count++;
			}
		}
		if (count == 0) {
			throw new PasswordException("At least 1 special character");
		}

	}

	public static void checkPassword(String pass) throws PasswordException {
		checkNumberOfCharacter(pass);
		checkLeast1LowercaseAlphabeticCharater(pass);
		checkLeast1UppercaseAlphabeticCharater(pass);
		checkLeast1Number(pass);
		checkLeast1UppercaseAlphabeticCharater(pass);
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Create your password: ");
				String pw = ip.nextLine();
				checkPassword(pw);
				System.out.println("Create successfully");
				break;

			} catch (PasswordException e) {
				System.out.println("--> " + e.getMessage());
				System.out.println("Enter again!!!");
			}
		}
	}
}
