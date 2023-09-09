package datastructure.primitive;

public class Ex03FunctionPassing {
	
	public static void main(String[] args) {
		// phạm vi sử dụng của biến
		// function scope, block scope
		
		int a = 22;
		int b = 37;
		
		// sysout --> 22, 37
		
		modify(a);
		// b = a;
		// swap(a, b);
		
		System.out.println("a --> " + a); // 22
		System.out.println("b --> " + b); // 22
	}
	
	// pass by value AT STACK
	// truyền tham số qua hàm --> truyền giá trị(STACK) qua cho tham số
	
	// int a
	// khai báo tham số a kiểu int
	// nhận giá trị tử bên ngoài vào
	private static void modify(int a) {
		a = 999;
	}
	
	// swap(5, 7)
	private static void swap(int a, int b) {
		int tmp = a; // t5
		a = b; // a7, b7
		b = tmp; // a7 b5
	}
	
}
