

package view;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		int limited = 5;
		int number;
		System.out.print("Nhập số nguyên dương: ");
		
		for(int i = 0; i < limited; i++ ) {
			
			if(ip.hasNextInt()) {
				number = ip.nextInt();
				if(number > 0) {
					System.out.println("Đây là số nguyên dương: " + number);
					if (luyThua2(number)) {
						System.out.println(number +" là luỹ thừa của 2");
					} else {
						System.out.println("Không phải luỹ thừa của 2");
						return;
					}
					return;
				}else {
					System.out.print("Không phải số nguyên dương, nhập lại: ");
				}
			}else {
				System.out.print("Không phải số nguyên, nhập lại: ");
				ip.next();
			}
			
			if(i == limited -1) {
				System.out.println("\n\n===\n");
				System.out.println("Bạn đã nhập quá số lần quy định!");
			}
		}
	}
		
//		Scanner ip = new Scanner(System.in);
//		
//		
//		int i = 0;
//		while (i < 5) {
//			System.out.print("Nhap so N: ");
//			int n = ip.nextInt();
//			
//			if (luyThua2(n)) {
//				System.out.println(n + " là luỹ thừa của 2");
//				return;
//			} else {
//				System.out.println(n + " không là luỹ thừa của 2");
//				i++;
//			}
//		}
//		
//		System.out.println("Bạn đã nhập quá số lần qui định");
//		
//	}
	
	public static boolean luyThua2(int n) {
        
        while (n > 1) {
            if (n % 2 != 0) {
                return false; // Nếu N không chia hết cho 2, không phải lũy thừa của 2
            }
            n /= 2;
        }
        return true;
    }
}
