package view;

import java.util.Scanner;

public class Ex01 {

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
					if (boiCua2(number)) {
						System.out.println(number +" là bội của 2");
					} else {
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
		
	private static boolean boiCua2(int number) {
		return number % 2 == 0 && number > 0;
	}
	
	
}