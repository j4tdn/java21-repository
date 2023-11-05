package homework;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập N: ");
		long N = Long.parseLong(ip.nextLine());
		System.out.print("Nhập M: ");
		long M = Long.parseLong(ip.nextLine());

		if (checkEquivalentPrime(N, M)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static boolean checkEquivalentPrime(long N, long M) {
		long smallerNumber = Math.min(N, M);
		long UCLN = gcd(N, M);

		if (UCLN == 1 && smallerNumber > 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public static long gcd(long x, long y) {
		while (y != 0) {
			long temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
}
