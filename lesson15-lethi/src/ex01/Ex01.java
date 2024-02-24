package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		double n = 0;
		int attempt = 0;
		
		while (attempt < 3) {
			System.out.println("Nhập số thực có phần thập phân khác 0: ");
			n = Double.parseDouble(ip.nextLine());
			
			if(isValidNumber(n)) {
				break;
			}else {
				attempt++;
				if(attempt == 3) {
					System.out.println("Bạn đã nhập sai quá 3 lần!");
					return;
				}
				System.out.println("Số nhập không hợp lệ. Vui lòng nhập lại!");
			}
		}
		
		System.out.println("Phân số tối giản của " + n + " là: " + simplifyFraction(n));
		
	}
	
	public static boolean isValidNumber(double n) {
		return Math.abs(n - Math.floor(n)) > 0;
	}
	
	public static String simplifyFraction(double n) {
		int gcd = GCD((int) (n * 100), 100);
		
		int numerator = (int) (n * 100) / gcd;
		int denominator = 100 / gcd;
		
		return numerator + "/" + denominator;
	}
	
	public static int GCD(int a, int b) {
		if(b == 0) 
			return a;
			return GCD(b, a % b);
	}
	
}
