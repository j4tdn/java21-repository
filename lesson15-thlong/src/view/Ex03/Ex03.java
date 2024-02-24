package view.Ex03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(sc.nextLine());
		
		if (checkHappyNumber(n)) {
			System.out.println(n + " là số hạnh phúc");
		} else {
			System.out.println(n + " không phải số hạnh phúc");
		}
		
		sc.close();
		
		
	}
	
	private static int squareSum(int n) {
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + (digit*digit);
			n /= 10;
		}
		return sum;
	}
	
	private static boolean checkHappyNumber(int n) {
		Set<Integer> set = new HashSet<>();
		while (n != 1 && !set.contains(n)) {
			set.add(n);
			n = squareSum(n);
		}
		return n == 1;
	}
	
}
