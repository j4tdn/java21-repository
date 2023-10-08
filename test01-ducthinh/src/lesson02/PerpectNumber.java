package lesson02;

import java.util.Scanner;

public class PerpectNumber {
	private static Scanner ip = new Scanner(System.in);
	public static int inputNumber() {
		
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
		int num = inputNumber();
		if(isPerfectNumber(num)) {
			System.out.println("Số "+num+" là số hoàn hảo");
		}else {
			System.out.println("Số "+num+" không phải là số hoàn hảo");
		}
	}
	
	public static boolean isPerfectNumber(int num) {
		int sum = 0;
		for(int i=1;i < num; i++) {
			sum += i;
		}
		if (sum == num) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
