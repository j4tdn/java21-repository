package datastructure.primitive;

public class Ex03FunctionPassing {
	private static void modifile(int a) {
		a=999;
	}
	public static void main(String[] args) {
		int a=22,b=37;
		modifile(a);
		b=a;
		System.out.println("a--> " +a);
		System.out.println("a--> " +b);
	}
}
