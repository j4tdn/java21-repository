package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		float a = 0;
		float b = 0;
		do {
			try {
				do {
					System.out.println("nhập a != 0: ");
					a = Float.parseFloat(ip.nextLine());
				}while(a == 0);
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}while(true);
		
		do {
			try {
				System.out.println("nhập b: ");
				b = Float.parseFloat(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}while(true);
		
		System.out.println("ax + b = 0");
		System.out.println("==>x = " + result(a, b));
		
	}
	
	private static float result(float a, float b) {
		float x = 0;
		x = -b / a;
		return x;
	}
}
