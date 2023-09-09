package datastructure.primitive;

public class Ex03FunctionPassing {
	public static void main(String[] args) {
		int a = 22;
		int b = 27;
		modifly(a);
		b = a;
		System.out.println("a--->" + a);
		System.out.println("b--->" + b);
	}

	private static void modifly(int a) {
		a = 999;
	}
}
