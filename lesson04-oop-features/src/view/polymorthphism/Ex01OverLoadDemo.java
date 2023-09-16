package view.polymorthphism;

public class Ex01OverLoadDemo {
	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

	private static double sum(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
System.out.println(sum(3, 4));
	}
}
