package homework;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập n = ");
		int n = ip.nextInt();

		int Factorial = 1;

		for (int i = 1; i <= n; i++) {
			Factorial *= i;
		}
		System.out.println(n + "! = " + Factorial);
	}

}
