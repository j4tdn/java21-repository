package baitapvenha.cautrucdulieu;

import java.util.Scanner;

import javax.management.ImmutableDescriptor;

public class Ex01 {
	public static void main(String[] args) {
		
		/*
		 * Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
		Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối
		đa 5 lần)
		VD: Nhập N  = abc  báo lỗi, yêu cầu nhập lại
					= 4  true
					= 6  true
					= 7  false*/
		
		int i = 1;
		System.out.println("Nhập số nguyên N:");	
		
		while (i < 6) {			
			Scanner ip = new Scanner(System.in);
			try {				
				int N = ip.nextInt();				
				if (N > 0 & N % 2 == 0) {
					System.out.println("N = " + N + " -> true");
					ip.close();
					break;
				} else if (N > 0 & N % 2 != 0) {
					System.out.println("N = " + N + " -> false");
					ip.close();
					break;
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
