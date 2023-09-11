package baitapvenha.cautrucdulieu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("Nhập số nguyên N:");		
		while (i < 6) {						
			Scanner ip = new Scanner(System.in);			
			try {				
				int N = ip.nextInt();
				int n = N;
				if(n > 0) {
					while (n != 1) {
						if (n %2 != 0) {
							System.out.println("N = " + N + " -> false ");
							break;
						}
						n = n/2;
						if (n == 1) {
							System.out.println("N = " + N + " -> true ");
							break;
						} 
					}
					ip.close();
					return;
				} else {
					System.out.println("báo lỗi, yêu cầu nhập lại" + " --> " +"Số lần nhập sai: " + i);
					i++;
				}
			} catch (Exception e) {
				System.out.println("báo lỗi, yêu cầu nhập lại" + " --> " +"Số lần nhập sai: " + i);	
				i++;	
			}
		}
	}
}
