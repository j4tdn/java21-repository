package leson2;

import java.math.BigInteger;
import java.util.Scanner;

public class bai3 {
	public static BigInteger giaithua(int n) {
		 if (n == 0 || n == 1) {
	            return BigInteger.ONE;
	        } else {
	            BigInteger t = BigInteger.ONE;
	            for (int i = 2; i <= n; i++) {
	                t = t.multiply(BigInteger.valueOf(i));
	            }
	            return t;
	        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so n");
		int i = 0;
		int k=0;
		int n=0;
		while (k!=1) {
			try {
				
					n = Integer.parseInt(sc.nextLine());
					if (n < 0)
						System.out.println("Nhap lai");
					else
						k=1;
				
			} catch (NumberFormatException e) {
				System.out.println("khong hop le nhap lai");
			}
		
		}
		BigInteger kq = giaithua(n);
		System.out.println(kq);
	}
}
