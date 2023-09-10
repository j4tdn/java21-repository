package view;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập sô nguyên dương N: ");
		int number = ip.nextInt();
		
		if(number <= 0) {
			System.out.println("N không phải số nguyên dương");
		}else {
			int factorial = 1;
			for (int i = 1; i <= number; i++) {
				factorial *= i;
			}
			System.out.println("giai thừa N = " + factorial);
		}
		
		
	}

}
