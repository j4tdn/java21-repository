package view;


import java.util.Scanner;

public class Ex01OppositePeakTriangleDouble{

	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = inputNumber();
		print(n);
	}
	
	private static void print(int n) {
		// duyệt từng dòng
		for (int i = 1; i <= 2*n-1; i++) {			
			for (int k = 1; k <= 2*n-1; k++) {			
				int count = i <= n ? i : 2*n-i;
				if (k <= count || k >= 2*n - count)
					System.out.print(k + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	private static int inputNumber() {
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
