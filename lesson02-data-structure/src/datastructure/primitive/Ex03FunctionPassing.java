package datastructure.primitive;

public class Ex03FunctionPassing {

	public static void main(String[] args) {
		// phạm vi sử dụng của biến
		// function scope, block scope
		int a = 22;
		int b = 37;
	
		modify(a);
		b = a;
		
		System.out.println("a --> "+a);
		System.out.println("b --> "+b);
		
	}
	
	// pass by value
	// truyền tham số qua hàm --> truyền giá trị(STACK) qua cho tham số
	
	// int a
	// khai báo tham số
	
	private static void modify(int a) {
		a = 999;
	}
}
