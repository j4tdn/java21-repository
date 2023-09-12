package homework;

import java.math.BigInteger;
import java.util.Scanner;

public class bai8 {
	public static int check(int n) {
		int k=0;
		int s=0;
		while(k!=1) {
			try {
				Scanner sc = new Scanner(System.in);
				n = Integer.parseInt(sc.nextLine());
				
				if (n < 0) {
					
					System.out.println("Khong hop le nhap lai");
				}
				else
					k=1;
				
			
		} catch (NumberFormatException e) {
			System.out.println("Khong hop le nhap lai");
		}
			finally {
				s=s+1;
			}
			if(s==5) {
				System.out.println("Vuot qua so lan cho phep: EXIT");
				System.exit(1);
			}
			}
		return n;
		}

	public static boolean checkPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so n");
		
		if(checkPrime(check(0))) System.out.println("is Prime");
		else System.out.println("No prime");
	}
}
