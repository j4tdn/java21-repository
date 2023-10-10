package a.validation_try_catch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex01Exception_Validation {

	// Enter year of birth --> calculate age of candidate
		public static void main(String[] args) {
			
			Scanner ip = new Scanner(System.in);
			
			//System.out.print("Enter year of birth:");
			
			//Validation
			// String yobAsText = ip.nextLine();
			String yobAsText = "";
			 do { // dùng vòng lặp nhập sai chuỗi thì phải nhập lại
					System.out.print("Enter year of birth:");
					 yobAsText = ip.nextLine();		// matches.("\\d+") 1 hoặc nhiều chữ số
				 if (yobAsText.matches("\\d+")) // nếu nhập đúng là số thì đúng, nếu sai thì nhập lại
					 {							// regex pattern, regular  expression
					 break;
				 }
			 }  while(true);
			
			int yob = Integer.parseInt(yobAsText);
			
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
