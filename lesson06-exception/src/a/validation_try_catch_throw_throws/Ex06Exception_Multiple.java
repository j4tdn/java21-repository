package a.validation_try_catch_throw_throws;

import java.util.Scanner;

public class Ex06Exception_Multiple {
	private static Scanner ip = new Scanner(System.in);
	
	/*
	 Cách xử lý khi method, chương trình có nhiều exception
	 1. Nếu các exception ko liên quan gì nhau
	 --> catch multiple exception
	 
	 2. Nếu các exception có quan hệ cha con
	 --> catch exception con, catch duy nhất exception cha
	 
	 * Không nên catch duy nhất exception cho mọi trường hợp
	 * --> code ko rõ ràng, ko biết code đang bị exception gì
	 */
	
	public static void main(String[] args) {
		try {
			manualInputAndDivide();
			System.out.println("calculated value: "+ manualInputAndDivide());
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println(e.getMessage());
		} 
	}
	private static int manualInputAndDivide() {
		int a = input("Enter a");
		int b = input("Enter b");
		if(a==2) {
			throw new ArithmeticException("Denominator shoule not be two");
		}
		if(b==1) {
			throw new ArithmeticException("Denominator shoule not be zero");
		}
		
		return a/b;
	}
	private static int input(String messange) {
		System.out.println(messange + ": ");
		return Integer.parseInt(ip.nextLine());
	}
}
