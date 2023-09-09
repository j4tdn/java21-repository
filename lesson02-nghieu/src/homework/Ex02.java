package homework;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("nhập N: ");
		int a = Integer.parseInt(ip.nextLine());
		
		if( luyThua(a) == true) {
			System.out.println( a + ": là lũy thừa của 2");
		}else{
			System.out.println(a + ":  không phải là lũy thừa của 2");
		}
	}

	private static boolean luyThua(int a) {
		boolean retun = false;
		if(a == 0) {
			return retun;
		}else {
			while(a != 1) { // 6  # 1, 3 # 1
				if(a % 2 != 0){ // 6 % 2 = 0 | 3 % 2 = 1 |
					return retun;
				}else {
					a = a / 2;  // a = 3 
				}
			}
			retun = true;
		}
		return retun;
	}
}

