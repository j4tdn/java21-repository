package a.validation_try_catch_throw_throws;

import java.util.Scanner;

public class Ex06Exception_multiple {
	
	private static Scanner ip = new Scanner(System.in);
	
	/*
	  Cách xử lý khi method, chương trình có nhiều exception
	  1. Nếu các exception ko liên quan gì nhau
	  --> catch multiple exception
	  
	  2. Nếu các exception có quan hệ cha con
	  --> catch exception con trước, cha sau(prefer)
	  --> xóa luôn exception con, catch duy nhất exception cha(Từ 1.7 prefer)
	  
	  * Không nên catch duy nhất Exception cho mọi trường hợp
	  --> Code không rõ ràng, không biết code đang bị exception gì
	  
	 */
	
	public static void main(String[] args) {
		try {
			System.out.println("Calculate value: " + manualInputAndDivde());
		} catch (NumberFormatException | ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Finished");
	}
	
	private static int manualInputAndDivde() {
		int a = input("Enter a: ");
		int b = input("Enter b: ");
		if (b == 0) {
			throw new ArithmeticException("Denominator should not be zero");
		}
		return a / b;
	}
	
	private static int input(String message) {
		System.out.println(message);
		return Integer.parseInt(ip.nextLine());
		
	}
}