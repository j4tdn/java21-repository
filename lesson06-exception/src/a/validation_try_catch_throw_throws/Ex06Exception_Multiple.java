package a.validation_try_catch_throw_throws;

import java.util.Scanner;

public class Ex06Exception_Multiple {
	
	private static Scanner ip = new Scanner(System.in);
	
	/*
	 
	 Cách xử lý khi method, chương trình có nhiều exception
	 1. Nếu các exception không liên quan gì nhau
	 	--> catch multiple exception
	 	
	 2. Nếu các exception có mối quan hệ cha con
	 	--> catch exception con trước, cha sau
	 	--> xóa luôn exception con, catch duy nhất exception cha(Từ 1.7 prefer)
	 	
	 *Không nên catch duy nhất Exception cho mọi trường hợp
	 --> code không rõ ràng, không biết code bị exception gì
	 
	 */
	
	public static void main(String[] args) {
		try {
			System.out.println("Calculated value: " + manualInputAndDivide());
		} catch (NumberFormatException | ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("finished");
	}
	
	private static int manualInputAndDivide() {
		int a = input("Enter a");
		int b = input("Enter b");
		if(b == 0) {
			throw new ArithmeticException("Denominator shoule not be zero");
		}
		return a / b;
	}
	
	private static int input(String message) {
		System.out.print(message + ": ");
		return Integer.parseInt(ip.nextLine());
	}
}