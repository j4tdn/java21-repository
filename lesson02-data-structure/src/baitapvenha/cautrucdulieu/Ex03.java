package baitapvenha.cautrucdulieu;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("Nhập số nguyên N:");
		Scanner ip = new Scanner(System.in);
		int N = ip.nextInt();
		int S = N;
		for (int i = 1; i <= (N-1); i++) {
			S = S*i;
		}
		System.out.println("Giai thừa của N = " + N + ": " + S);
	}	
}
