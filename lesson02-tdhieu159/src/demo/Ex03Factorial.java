package datastructure;

import java.util.Scanner;

public class Ex03Factorial {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = ip.nextInt();
		System.out.println(n+"!" + " có kết quả là: " +factorial(n));
	}
	
	
	// tính giai thừa
	private static long factorial(int n) {
		long result = 1;
		for (int i =1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
}
