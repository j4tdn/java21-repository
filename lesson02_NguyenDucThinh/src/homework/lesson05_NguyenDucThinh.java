package homework;

import java.util.Scanner;

public class lesson05_NguyenDucThinh {
	public static int inputNumber(Scanner ip) {
		
		int num = 0;
		int inputAgainCount = 5;
		System.out.println("Input N: ");
		while(inputAgainCount > 0) {
			try {
				
				num = Integer.parseInt(ip.nextLine());
				if(num <= 0) {
					System.out.println("N must be positive number, please input again!");					
				}else {
					return num;
				}
			}catch(Exception e) {
				System.out.println("N must be positive number: ");
				ip.nextInt();
				
				
			}
			inputAgainCount--;
			System.out.println("you have "+inputAgainCount+" times to input again");
		}
		System.out.println("Exceeded maximum number of attempts. Exiting program.");
        return num; 
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = inputNumber(ip);
		System.out.println("is N symmetrical number? " +isSymNumber(n) );
	}
	
	public static boolean isSymNumber(int n) {
		int reverseNumber = 0;
		int originalNumber = n;
		if(n < 0 ) {
			return false;
		}
		while(n > 0) {
			int digit = n % 10;
			reverseNumber = reverseNumber * 10 + digit;
			n /= 10;
		}
		return reverseNumber == originalNumber;
	}
}
