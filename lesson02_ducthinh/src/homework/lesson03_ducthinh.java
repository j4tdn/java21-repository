package homework;

import java.util.Scanner;

public class lesson03_ducthinh {
	public static void main(String[] args) {
		int n = 0;
		System.out.println("Input N : ");
		Scanner ip = new Scanner(System.in);
		n = ip.nextInt();
		System.out.println("factorial of N : "+facOfNumber(n));
	}
	
	public static double facOfNumber(int n ) {
		double fac = 1;
		for(int i = n; i != 0; i--) {
			fac *= (double)i;
		}
		return fac;
	}
}
