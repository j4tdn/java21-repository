package common;

public class Ex02Swap {
	public static void main(String[] args) {
		int x1 = 2;
		int x2 = 8;
		
		swapInt(x1, x2);
		
//		System.out.println(x1);
//		System.out.println(x2);
//		
		Integer xo1 = 17;
		Integer xo2 = 91;
//		
		swapInteger(xo1, xo2);
//		System.out.println(xo1);
//		System.out.println(xo2);
	}
	
	private static void swapInt(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	private static void swapInteger(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;	
		System.out.println(a);
		System.out.println(b);
	}
}
