package view.strategy.practice;

import java.util.Scanner;

public class power {
	
	// a có phải là lũy thừa của b
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập a: ");
		int a = Integer.parseInt(ip.nextLine());
		
		System.out.println("Nhập b: ");
		int b = Integer.parseInt(ip.nextLine());
		
		while (a != 1) {
			if (a % b != 0) {
				System.out.println("a not power of b");
				break;
			}
			a = a/b;
			if (a == 1) {
				System.out.println("a is power of b");
				break;
			}
		}
	}
	
}
