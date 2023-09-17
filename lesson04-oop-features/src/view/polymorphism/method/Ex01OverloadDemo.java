package view.polymorphism.method;

public class Ex01OverloadDemo {
	public static void main(String[] args) {
		System.out.println(sum(4, 3));
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
