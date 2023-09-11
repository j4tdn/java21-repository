package view;

import java.math.BigInteger;
import java.util.Random;

public class Ex04SumFactorial {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int a = 10 + rd.nextInt(11);
		int b = 10 + rd.nextInt(11);
		int c = 10 + rd.nextInt(11);
		int d = 10 + rd.nextInt(11);
		
		System.out.println("Tổng của " + a + "! + " + b + "! +" + c + "! + " + d + "! = " 
								+ factorial(a).add(factorial(b)).add(factorial(c)).add(factorial(d)));
	}
	
	private static BigInteger factorial(int number) {
		if(number == 1) {
			return BigInteger.ONE;
		}
		
		return (BigInteger.valueOf(number).multiply(factorial(number - 1)));
	}
}
