package baitap2;

public class Ex04 {
	public static void main(String[] args) {
		long sum;

		sum = factorial(2) + factorial(5) + factorial(12) + factorial(18);

		System.out.println(sum);
	}

	private static long factorial(int n) {
		long s = 1;
		for (int i = 1; i <= n; i++) {
			s *= i;
		}
		return s;
	}
}