package homework;

import java.util.Scanner;

public class lesson07_ducthinh {
	public static int inputNumber(Scanner ip) {
		
		int num = 0;
		int inputAgainCount = 5;
		System.out.println("Input decimalNum: ");
		while(inputAgainCount > 0) {
			try {
				
				num = Integer.parseInt(ip.nextLine());
				if(num < 0) {
					System.out.println("N must be natural number, please input again!");					
				}else {
					return num;
				}
			}catch(Exception e) {
				System.out.println("N must be natural number: ");
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
		int decimalNum = inputNumber(ip);
		int remainder = 0;
		int base = 1;
		int binaryNum = 0;
		if(decimalNum==0) {
			System.out.println("decimalNum = 0 --> 0");
		}
		while(decimalNum>0) {
			remainder = decimalNum % 2;
			binaryNum += remainder*base;
			base *= 10;
			decimalNum = decimalNum / 2;
			
		}
		System.out.println("decimalNum is inputed --> "+binaryNum);
	}
}
