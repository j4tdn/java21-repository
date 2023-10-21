package ex02;

import java.util.Scanner;

public class CreatePassword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pw = "";
		do {
			try {
				System.out.print("Enter password: ");
				pw = sc.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} while (!validate(pw));
		System.out.println("Create password successfully");
		sc.close();
	}

	private static boolean validate(String pw) {
		if (pw.length() < 8) {
			throw new IllegalArgumentException("Your password must contain more than 8 letters");
		}
		if (pw.length() > 256) {
			throw new IllegalArgumentException("Your password must contain less than 256 letters");
		}
		boolean atLeastOneLowerLetter = false;
		boolean atLeastOneUpperLetter = false;
		boolean atLeastOneNumber = false;
		boolean atLeastOneSpecialCharacter = false;
		
		for (int i = 0; i < pw.length(); i++) {
			if (Character.isLowerCase(pw.charAt(i))) {
				atLeastOneLowerLetter = true;
			}
			if (Character.isUpperCase(pw.charAt(i))) {
				atLeastOneUpperLetter = true;
			}

			if(Character.isDigit(pw.charAt(i))) {
				atLeastOneNumber = true;
			}
			
			if (pw.matches(".*[$&+,:;=\\\\\\\\?@#|/'<>.^*()%!-].*")) {
				atLeastOneSpecialCharacter = true;
				break;
			}
		}
		if (!atLeastOneLowerLetter) {
			throw new IllegalArgumentException("At least one lower characters");
		}
		if (!atLeastOneUpperLetter) {
			throw new IllegalArgumentException("At least one upper characters");
		}
		if (!atLeastOneNumber) {
			throw new IllegalArgumentException("At least one number");
		}
		if (!atLeastOneSpecialCharacter) {
			throw new IllegalArgumentException("At least one special character");
		}
		return true;
	}
}

