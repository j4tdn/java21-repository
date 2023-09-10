package view;

// Viết chương trình tìm giai thừa của một số nguyên dương N.

public class Ex03CheckFactorial {

	public static void main(String[] args) {
		Ex02CheckExponential ex02 = new Ex02CheckExponential();
		int N = ex02.enterInteger();
		System.out.println("Giai thừa của " + N + " là: " + factorial(N));
	}
	
	private static int factorial(int n) {
		if (n == 1) {
			return 1; 
		}
		return (n*factorial(n-1));
	}
}
