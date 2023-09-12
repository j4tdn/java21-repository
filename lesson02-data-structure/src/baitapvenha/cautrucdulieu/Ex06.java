package baitapvenha.cautrucdulieu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {	
		
		int a = checkNumber("a");
		int b = checkNumber("b");
		int c = checkNumber("c");
		
		int min = a;
		int max = a;
		
		if (min > b) {
			min = b;
			if (min > c) {
				min = c;
			}
		}
		
		if (max < b) {
			max = b;
			if (max < c) {
				max = c;
			}
		}
		
		System.out.println("Số lớn nhất là: " + max);
		System.out.println("Số nhỏ nhất là: " + min);
		
	}
	private static int checkNumber (String str) {
		int i = 0;
		int N = 0;
		System.out.println("Nhập " + str + " = ");
		while (i == 0) {		
			Scanner ip = new Scanner(System.in);
			try {
				int n = ip.nextInt();
				if (n >= 0 & n <= 20) {
					N = n;
					System.out.println(str + " = " + n);
					i = 1;
				} else {
					System.out.println("báo lỗi, yêu cầu nhập lại");
				}
			} catch (Exception e) {
				System.out.println("báo lỗi, yêu cầu nhập lại");
			}
		}
		return N;
	}
}
