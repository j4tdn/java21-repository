package a.validation_try_catch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex02Exception_TryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int yob = 0;
		
		do {
			System.out.println("Enter year of birth: ");
		try {
			yob = Integer.parseInt(ip.nextLine());
			break;
		} catch (NumberFormatException nfe) {
			System.out.println("nfe " + nfe.getMessage()); // default trace erro from java
		
		}
	} while(true);
		
		int cyear = Year.now().getValue();
		int age = cyear - yob + 1;
		System.out.println("Your age: "+age);
			ip.close();
	}
}

