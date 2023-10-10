package a.validation_try_catch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex02Exception_tryCatch {

	// Enter year of birth --> calculate age of candidate
	public static void main(String[] args) {
		
		
		//System.out.print("Enter year of birth:");
		
		//Validation
		// String yobAsText = ip.nextLine();
		Scanner ip = new Scanner(System.in);
		int yob = 0;

		do {
			try {
				System.out.print("Enter ur year of birth:");
				yob = Integer.parseInt(ip.nextLine());

				break;
			} catch (NumberFormatException nfe) {
				System.out.println("Vui lòng nhập lại:");
			}

		} while (true);
		int cyear = Year.now().getValue();
		int age = cyear - yob + 1;
		System.out.println("Your age:" +age);

		ip.close();
	}
	/* Khi nhập chuỗi thì bị lỗi
	 * Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
at java.base/java.lang.Integer.parseInt(Integer.java:668)
at java.base/java.lang.Integer.parseInt(Integer.java:786)
at a.validation_try_catch_throw_throws.Ex01Exception_Validation.main(Ex01Exception_Validation.java:14)

	 */


}
