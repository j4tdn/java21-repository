package datastructure;

import java.util.Random;

public class Ex04SumOfFactorial {
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		int a = 10 + rd.nextInt(11);
		System.out.println("a " + a);
		
		int b = 10 + rd.nextInt(11);
		System.out.println("b " + b);
		
		int c = 10 +  rd.nextInt(11);
		System.out.println("c " + c);
		
		int d = rd.nextInt(11);
		System.out.println("d " + d);
		
		long sum;
		sum = factorial(a) + factorial(b) + factorial(c) + factorial(d);

		System.out.println("Tổng giai thừa 4 số: " + sum);
	}
	
	
	// tính giai thừa
	private static long factorial(int n) {
		long result = 1;
		for (int i =1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}