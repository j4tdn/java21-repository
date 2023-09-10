package homework;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(10, 21);
		int b = rd.nextInt(10, 21);
		int c = rd.nextInt(10, 21);
		int d = rd.nextInt(10, 21);

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);

		System.out.println("a! + b! + c! + d! = " + sum(a, b, c, d));
	}

	private static long sum(long a, long b, long c, long d) {
		return calcFactorial(a) + calcFactorial(b) + calcFactorial(c) + calcFactorial(d);
	}

	private static long calcFactorial(long n) {
		int Factorial = 1;
		for (int i = 1; i <= n; i++) {
			Factorial *= i;
		}
		return Factorial;
	}

}
