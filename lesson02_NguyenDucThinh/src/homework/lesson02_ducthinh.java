package homework;

import java.util.Scanner;

public class lesson02_ducthinh {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int num = inputNumber(ip);
		System.out.println("N = "+ checkPowerOf2(num));
	}
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
	public static boolean checkPowerOf2(int num) {
		if(num <= 0) {
			return false;
		}
		while(num>1) {
			if(num % 2 != 0) {
				return false;
			}
			num /= 2;
		}
		return true;
	}
}
