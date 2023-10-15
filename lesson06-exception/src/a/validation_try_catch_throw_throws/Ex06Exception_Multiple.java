package a.validation_try_catch_throw_throws;

import java.util.Scanner;

public class Ex06Exception_Multiple {
	
	private static Scanner sc = new Scanner(System.in);
	
	/*
	 * Cách xử lý khi method, chương trình có nhiều exception
	 * 1. Nếu các exception ko liên quan gì đến nhau
	 * --> Catch multiple exception
	 * 
	 * 2. Nếu các exception cs quan hệ cha cn
	 * --> Cacth exception con trước cha sau(prefer)
	 * --> xóa luôn exception con, catch duy nhất exception cha(Tuwf 1.7 prefer)
	 * 
	 * * Không nên catch duy nhất Exception cho mọi trường hợp
	 * --> Code k rõ ràng , không biết code đang bị exceptiob gì
	 *  
	 */
	
	
	public static void main(String[] args) {
			try {
				System.out.println("Calculated value: " + manualInputAndDivide());
				
			} catch (NumberFormatException | ArithmeticException e) {
				e.printStackTrace();
			}
	}
	
	private static int manualInputAndDivide() {
		int a = input("Enter a");
		int b = input("Enter b");
		if(b==0) {
			throw new ArithmeticException("Denominator shoule nt be xezo");
			
		}
		return a/b;
	}
	
	private static int input(String message) {
		System.out.println(message + " : ");
		return Integer.parseInt(sc.nextLine());
			}
	
}
