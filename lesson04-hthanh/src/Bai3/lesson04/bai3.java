package Bai3.lesson04;

import java.math.BigInteger;
import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so n: ");
		int n = sc.nextInt();
		BigInteger[][] arr = new BigInteger[n + 1][n + 2];
		arr[0][0] = BigInteger.ONE;
		arr[0][1] = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			arr[i][0] = BigInteger.ONE;
			for (int j = 1; j <= i; j++) {
				arr[i][j] = arr[i - 1][j - 1].add(arr[i - 1][j]);
			}
			arr[i][i + 1] = BigInteger.ONE;
		}
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i + 1; j++) {
				System.out.print(arr[i][j]+ "  ");
			}
			System.out.println();
		}
	}
}
