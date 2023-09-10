package view;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int a = rd.nextInt(10, 21);
		int b = rd.nextInt(10, 21);
		int c = rd.nextInt(10, 21);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		System.out.println("Giai thua cua a = " + factorial(a));
		System.out.println("Giai thua cua b = " + factorial(b));
		System.out.println("Giai thua cua c = " + factorial(c));
		
		sumFunction(factorial(a), factorial(b), factorial(c));
		System.out.println("Tong các các 3 giai thua = " + sumFunction(factorial(a), factorial(b), factorial(c)));
		//double sum = giaiThua(a) + giaiThua(b) + giaiThua(a);
		//System.out.println("SUM = " + sum);
	}
	
	
	private static double factorial(int n) {
		double giaithua = 1;
		for (int i = 1; i <= n; i++) {
			giaithua *= i;
		}
		return giaithua;

}
	
	private static double sumFunction(double a, double b, double c) {
		double tong = 0;
		tong = a + b + c;
		return tong;
	}
}
