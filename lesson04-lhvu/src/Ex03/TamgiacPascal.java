package Ex03;

import java.util.Scanner;

public class TamgiacPascal {
	static long pascal (int k , int n) {
		if( k ==0|| k == n )
			return 1;
		else return pascal(k,n-1) + pascal(k-1, n-1);
	}
	static void disPlay() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n:");
		int n = sc.nextInt();
		for ( int i = 0; i<=n; i++) {
			for (int k = 0; k<=i; k++)
				System.out.print(pascal(k, i)+" ");
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		disPlay();
	}
}
