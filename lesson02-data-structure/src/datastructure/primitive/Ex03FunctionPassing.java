package datastructure.primitive;

public class Ex03FunctionPassing {
	public static void main(String[] args) {
		int a = 22, b = 37;
		
		modify(a); //không thay đổi a trong hàm nhận giá trị mà giá trị hiện tại là 22 đang gán cho a --> joke
		
		b = a;
		
		System.out.println("a: " + a); //a = 22
		System.out.println("b: " + b); //b = 22
	}
	
	private static void modify(int a) {
		a  = 999;
	}
	
	// pass by value AT STACK
	// truyển tham số qua hàm --> truyền giá trị(STACK) qua cho tham số
	
	
}
