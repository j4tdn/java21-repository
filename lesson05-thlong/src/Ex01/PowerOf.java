package Ex01;

import java.util.Scanner;


public class PowerOf {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập a: ");
		int a = ip.nextInt();
		System.out.println("Nhập b: ");
		int b = ip.nextInt();
		
		if (isPowerOf(a, b)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}
	
	public static boolean isPowerOf(int a, int b) {
		
		if (a == b) {
			return false;
		}
		
		
		if (a>b) {
			while (a != 1) {
				if (a % b != 0) {
					return false;
				}
				a = a/b;
				if (a==1) {
					return true;
				}
			}
		} else {
			while (b != 1) {
				if (b % a != 0) {
					return false;
				}
				b = b/a;
				if (b==1) {
					return true;
				}
			}
		}
		return false;
	}
}
