package homework;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("nhập N: ");
		int n = Integer.parseInt(ip.nextLine());
		
		System.out.println(n + "! = " + tinhGiaiThua(n));
	}
	
	private static int tinhGiaiThua(int n) {
		int a = 1;
		if(n == 0 || n ==1) {
			return a;
		}else {
			for(int i = 2; i <= n; i++) {
				a *= i; 
			}return a;
		}
	}
	
	
	
		
	
}
