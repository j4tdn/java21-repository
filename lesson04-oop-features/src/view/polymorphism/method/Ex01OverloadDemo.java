package view.polymorphism.method;

public class Ex01OverloadDemo {
	
	public static void main(String[] args) {
		System.out.println("sum --> "+ sum(3,4));
		System.out.println("sum --> "+ sum(4d,5d));
		System.out.println("sum --> "+ sum(3,6,11));
	}
	
	private static double sum(double a, double b) {
		return a + b;
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

}
