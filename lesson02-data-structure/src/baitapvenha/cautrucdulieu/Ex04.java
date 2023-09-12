package baitapvenha.cautrucdulieu;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random rd = new Random();
		int a  = rd.nextInt(10, 20);
		int b  = rd.nextInt(10, 20);
		int c  = rd.nextInt(10, 20);
		int d  = rd.nextInt(10, 20);
		
		//System.out.println("a " + a);
		//System.out.println("b " + b);
		//System.out.println("c " + c);
		//System.out.println("d " + d);
		
		double factA = factorial(a);
		double factB = factorial(b);
		double factC = factorial(c);
		double factD = factorial(d);
		
		//System.out.println("factA = " + factA);
		//System.out.println("factB = " + factB);
		//System.out.println("factC = " + factC);
		//System.out.println("factD = " + factD);
	
		double sumFact = factA + factB + factC + factD;
			
		System.out.println("Tổng giai thừa là: " + sumFact);
		
	}
	private static double factorial(int n) {
		double factN = n;
		for (int i = 1; i <= (n-1); i++) {	
			factN = factN*i;
		}
		return factN;
	}
}
