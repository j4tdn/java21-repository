package a.validation_try_catch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex01Exception_TryCatch {

	// Enter year of birth --> calculate age of candidate
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int yob = 0;
		do {
			try {
				System.out.print("Enter your year of birth: ");
				yob = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("nfe: " + nfe.getMessage());
			}
		} while (true);

		int cyear = Year.now().getValue();
		int age = cyear - yob + 1;
		System.out.println("Your age: " + age);

		scanner.close();
	}

}
