package ex01_equation;

import java.util.Scanner;

public class Ex01EquationDucThinh {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		double a,b;
		while(true) {
			try {
				System.out.println("Input a: ");
				a = Double.parseDouble(ip.nextLine());
				System.out.println("Input b: ");
				b = Double.parseDouble(ip.nextLine());
				if(a == 0) {
					System.out.println("a must be a non-zero number ");
				}else if(b < 0) {
					System.out.println("First degree equation is: "+a+"x "+b+"=0");
					System.out.println("Solution of degree is: "+(-b)/a);
					break;
				}else {
					System.out.println("First degree equation is: "+a+"x +"+b+"=0");
					System.out.println("Solution of degree is: "+(-b)/a);
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Error: Let's input digit for a and b!");
			} catch (ArithmeticException e) {
				System.out.println("Error: error divide for 0!");
			}
		}
	
	
	}
}
