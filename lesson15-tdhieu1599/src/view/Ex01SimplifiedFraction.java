package view;

import java.util.Scanner;

public class Ex01SimplifiedFraction {
	
	public static void main(String[] args) {
		
		Scanner ip  = new Scanner(System.in);
		int count = 0;
		double number;
		do {
			System.out.println("Nhập số thực có phần thập phân khác 0: ");
			number = ip.nextDouble();
			count++;
			if (check(number)) {
				result(number);
				break;
			} else {
				System.out.println("Số nhập vào không hợp lệ.");
			}
			
			if (count > 3) {
				System.out.println("Đã nhập sai 3 lần. ");
				return;
			}
		} while (true);
	}
	
	private static boolean check(double number) {
		return number != (int) number;
	}
	
	private static void result(double number) {
		int numerator = (int) (number*100);
		int denominator = 100;
		int gcd = getGCD(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;
		System.out.println("Phân số tối giản là: " + numerator + "/" + denominator);
	}
	
	private static int getGCD(int a, int b) {
		while(b!=0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
}
