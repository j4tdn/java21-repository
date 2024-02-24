package exam.cau3;

import java.util.Scanner;

public class App03 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập một số nguyên dương: ");
		int number = Integer.parseInt(scanner.nextLine());

		boolean isHappy = isHappyNumber(number);
		
		if (isHappy) {
			System.out.println(number + " là số hạnh phúc.");
		} else {
			System.out.println(number + " không phải là số hạnh phúc.");
		}

		scanner.close();
		
	}
	
	private static boolean isHappyNumber(int n) {
		int slow = n;
		int fast = n;

		do {
			slow = calculateSumOfSquares(slow);
			fast = calculateSumOfSquares(calculateSumOfSquares(fast));
		} while (slow != fast);

		return slow == 1;
	}

	private static int calculateSumOfSquares(int n) {
		int sum = 0;

		while (n > 0) {
			int digit = n % 10;
			sum += digit * digit;
			n /= 10;
		}

		return sum;
	}

}
