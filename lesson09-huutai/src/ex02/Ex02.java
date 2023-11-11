package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num = sc.nextInt();

		int result = num;

		// 4 -16 - 37 - 58 - 89 - 145 - 42 - 20 - 4. vòng lặp(wiki)
		while (result != 1 && result != 16) {
			result = checkForHN(result);
		}

		// check for 1
		if (result == 1) {
			System.out.println("true");
		}
		else if (result == 16) {
			System.out.println("false");
		}
	}

	// check for happyNumber
	public static int checkForHN(int num) {
		int temp = 0, sum = 0;

		while (num > 0) {
			temp = num % 10;
			sum = sum + (temp * temp);
			num = num / 10;
		}
		return sum;
	}
}
