package a.validation_try_catch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex02Exception_Try_Catch {
	
	// Enter year of birth --> calculate age of candidate
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		
		int yob = 0;
		
		do {
			try {
				System.out.println("Enter year of birth: ");
				
				yob = Integer.parseInt(ip.nextLine());
				break;
				
			} catch (NumberFormatException nfe) {
				//nfe.printStackTrace();
				System.out.println("Input not correct");
			}
		} while (true);
		
		int cyear = Year.now().getValue();
		int age = cyear - yob + 1;
		System.out.println("Your age: " + age);
		
		ip.close();
				
	}
}
