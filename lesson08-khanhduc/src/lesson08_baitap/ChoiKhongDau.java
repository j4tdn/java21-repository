package lesson08_baitap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ChoiKhongDau {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		while(true) {
			System.out.println("Enter String Input: ");
			input = sc.nextLine();
			if(isNonDiacritic(input)) {
				break;
				
			}else {
				System.err.println("The input must be an unsigned character");
				System.out.println("Please Enter Again: ");
			}
		}
		System.out.println("Enter successful : "  + input);

	}

	public static boolean isNonDiacritic(String input) {
		return input.matches("[a-zA-Z ]+");
		// maches để kiểm tra regex có khớp nhau không

	}
}
