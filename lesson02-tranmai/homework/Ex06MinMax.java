package lesson02;

import java.util.Scanner;

public class Ex06MinMax {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int max = Integer.MIN_VALUE;

		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter value " + i);
			
			if (ip.hasNextInt()) {
				int x = ip.nextInt();
				
				if (x >= 0 && x < 20) {
					if (x > max) {
						max = x;
					}
				} else {
					System.out.println("Please enter a number in range [0,20)");
					i--;
				}
				
			} else {
				System.out.println("Please enter the integer number");
				ip.next().trim();
				i--;
			}
		}
		System.out.println("Max of three numbers is: " + max);

		ip.close();
	}
}
