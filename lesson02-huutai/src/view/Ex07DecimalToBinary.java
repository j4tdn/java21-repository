package view;

import java.util.Scanner;

public class Ex07DecimalToBinary {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập n = ");
		int number = Integer.parseInt(ip.nextLine());
		StringBuilder sb = new StringBuilder();
		
		while (number > 0) {
			sb.append(number % 2);
			number /= 2;
		}
		
		System.out.println("Decimal to Binary: " + sb.reverse());
		
		ip.close();
	}
}
