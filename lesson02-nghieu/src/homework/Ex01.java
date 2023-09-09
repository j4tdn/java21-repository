package homework;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		int boi;
		Scanner ip = new Scanner(System.in);
		do {
			System.out.println("nhập số nguyên dương N : ");
			boi = Integer.parseInt(ip.nextLine());
		}while(boi < 0);
		
		ktra(boi);
	}
	
	private static void ktra(int a) {
		if(a % 2 == 0) {
			System.out.println( a + " là bội của 2");
		}else {
			System.out.println( a + " không phải là bội của 2");
		}
	}

}
