package baitapvenha.cautrucdulieu;

import java.util.Scanner;


public class Ex08 {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("Nhập số nguyên N:");	
		
		while (i < 6) {			
			Scanner ip = new Scanner(System.in);
			try {				
				int N = ip.nextInt();				
				if (N <= 1) {
					System.out.println("N = " + N + " -> false");
					ip.close();
					break;
				} else if (N < 0) {
					System.out.println("báo lỗi, yêu cầu nhập lại" + " --> " + "Số lần nhập sai: " + i);
					i++;
				} else {
					if (isPrime(N)) {
						System.out.println("N = " + N + " -> true");
					} else {
						System.out.println("N = " + N + " -> false");
					}
				}
			} catch (Exception e) {
				System.out.println("báo lỗi, yêu cầu nhập lại" + " --> " +"Số lần nhập sai: " + i);	
				i++;							
			}
		}	
	}
	private static boolean isPrime (int n) {
		for (int k = 2; k <= n / 2; k++) {
			if (n % k == 0) {
				return false;
			} 			
		}
		return true;
	}
}
