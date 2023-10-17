package a.validation_try_catch_throw_throws;

import java.time.Year;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ex02Exception_TryCatch {
 
	// Enter year of birth --> calculate age of candidate 
		public static void main(String[] args) {
			
		
		Scanner ip = new Scanner(System.in);
		
		int yob = 0;
		
		do {
			try {
				System.out.println("Enter your year of birth: ");
				yob = Integer.parseInt(ip.nextLine());
				if(yob > 1920) {
					break;
				}
				System.out.println("Require year > 1920");
			} catch (NumberFormatException nfe) {
				//nfe.printStackTrace(); // default trace error from java
				//System.out.println(">>> nfe --> " + nfe.getMessage());
				System.out.println("Input is incorrect, please enter again !!!");
			}
			
		} while (true);
		
		int cyear = Year.now().getValue();
		int age = cyear - yob + 1;
		System.out.println("Your age: " + age);
		
		
		// validation
		
		
		
		ip.close(); // ngắt kết nối
	}
	
	
}


