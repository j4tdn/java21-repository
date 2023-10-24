package ex03ValidateEmail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import view.exception.InvalidUserValidation;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				System.out.println("Enter email: ");
				String email = sc.nextLine();
				validateEmail(email);
				System.out.println("VALID!");
				sc.close();
				break;
				
			} catch (Exception e) {
				System.out.println("Message --> " + e.getMessage());
			}
		}
	}

	private static void validateEmail(String email) throws InvalidUserValidation {
		String regex = "^[a-zA-Z0-9]+([_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)*\\.[a-zA-Z]{2,}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		if (!matcher.matches()) {
			throw new InvalidUserValidation("Email address is invalid! Try again");
		}
	}
}
