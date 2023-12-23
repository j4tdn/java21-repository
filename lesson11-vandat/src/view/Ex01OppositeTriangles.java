package view;

import java.util.Scanner;

public class Ex01OppositeTriangles {

	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = input();
		print(n);
	}
	
	private static void print(int n) {
		for (int i = 1; i < n; i++) {
			int count = 1;
			for (int k = 0; k < i; k++) {
				System.out.print(count + " ");
				count++;
			}
			for (int k = 1; k < 2*n-2*i; k++) {
				System.out.print("  ");
				count++;
			}
			for (int k = 0; k < i; k++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
		for (int i = 1; i <= 2*n-1; i++)
			System.out.print(i + " ");
		System.out.println();
		for (int i = n+1; i <= 2*n-1; i++) {
			int count = 1;
			for (int k = i; k <= 2*n-1; k++) {
				System.out.print(count + " ");
				count++;
			}
			for (int k = 2*n+1; k <= 2*i-1; k++) {
				System.out.print("  ");
				count++;
			}
			for (int k = i; k <= 2*n-1; k++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
	
	private static int input() {
		int n;
		do {
			try {
				System.out.print("Nhập số nguyên N -> ");
				n = Integer.parseInt(ip.nextLine());
				if (n > 0)
					return n;
				else
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				System.out.println("Nhập sai ! Nhập lại !");
			}
			
		} while (true);
	}
}
