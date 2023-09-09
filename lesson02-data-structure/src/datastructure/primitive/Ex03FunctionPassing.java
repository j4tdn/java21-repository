package datastructure.primitive;

public class Ex03FunctionPassing {
	public static void main(String[] args) {
		
		int a = 22;
		int b = 37;
		
		modify(a);
		b = a;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	private static void modify(int a) {
		a = 999;
	}
}
