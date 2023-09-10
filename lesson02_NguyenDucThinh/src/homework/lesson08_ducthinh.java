package homework;

import java.util.Scanner;

public class lesson08_ducthinh {
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
			}catch(NumberFormatException e) {
				System.out.println("N must be positive number: ");	
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
		System.out.println("is N prime? --> "+checkPrime(n));
	}
	public static boolean checkPrime(int n) {
		for(int i=2; i < Math.sqrt(n);i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
