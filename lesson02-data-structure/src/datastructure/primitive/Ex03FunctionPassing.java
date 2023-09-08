package datastructure.primitive;

public class Ex03FunctionPassing {

	public static void main(String[] args) {
		//phạm vi sử dụng của biến
		//function scope, block scope
		int a = 22;
		int b =27;
		
		//modify(a);
		
		//b = a;
		
		swap(a, b);
		
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
	}
	
	//pass by value
	//truyền tham số qua hàm --> truyền giá trị(STACK) qua cho tham số
	
	//private static void modify(int a) {
	//	a = 999;
	//}
	
	private static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
}
