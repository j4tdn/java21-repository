package baitap;

import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer ");
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("Enter a positive integer");
		} else {
			int factorial = 1;
			for (int i = 1; i <= a; i++) {
				factorial *= i;
			}
		
			System.out.println(a + "! = " + factorial);
		}
	}
}

