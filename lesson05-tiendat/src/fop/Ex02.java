package fop;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.print("Enter the random number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean result = isSpecialNumber(n);
		System.out.print(n + " is the special number: " + result);
	}

	public static boolean isSpecialNumber(int n) {
		int sum = 0;
		int i = 1;
		while (sum < n) {
			sum += i;
			i++;
		}
		return sum == n;
	}

}