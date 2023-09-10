package datastructure.primitive;

public class Ex03FunctionPassing {
	public static void main(String[] args) {
		// phạm vi sử dụng của biến
		// function scope, block scope
		
		int a = 22;
		int b = 37;
		
		modify(a);
		b = a;
		
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
	}
	private static void modify(int a) {
		a = 999;
	}
	
	// swap(5, 7)
	private static void swap(int a, int b) {
		int tmp = a; // t5
		a = b; 
	}
}
