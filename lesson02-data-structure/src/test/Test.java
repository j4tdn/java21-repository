package test;

import java.util.Scanner;

import homework.BaiTap8;

public class Test {
	public static void main(String[] args) {
		int n;
		int dem = 0;
		for (n= 1; n <=10000; n++) {
			if (BaiTap8.isPrime(n)) {
				dem = dem +1;
				if (dem == 200) break;
			}
				
		}
		System.out.println("200th prime number is: "+ n);
	}

}
