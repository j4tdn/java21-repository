package datastructure.primitive;

public class Ex03FunctionPassing {
	
	public static void main(String[] args) {
		// biến cục bộ = local variable
		// phạm vi sử dụng: 
		int a = 22;
		int b = 37;
				
		modify(a);
		// b = a;
		// swap (a, b);
		System.out.println("a --> " + a); 
		System.out.println("b --> " + b); 
	}
	
	private static void modify(int a) {
		a = 999;
		
		//    9:33  -- xem lại
	}
	
	// swap a, b
	private static void swap(int a, int b) {
		int tmp  = a;
		a = b;
		b = tmp;
	}
	
}
