package homework;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int x;
		int y;
		Scanner ip = new Scanner(System.in);
		do{
			System.out.println("nhập số a: ");
			a = Integer.parseInt(ip.nextLine());
		}while(a > 19);
		do {
			System.out.println("nhập số b: ");
			b = Integer.parseInt(ip.nextLine());
		}while(b > 19);
		do {
			System.out.println("nhập số c: ");
			c = Integer.parseInt(ip.nextLine());
		}while(c > 19);
		
		if(a > b) {
			x = a; // x lớn, y nhỏ
			y = b;
		}else {
			x = b;
			y = a;
		}if(x > c) {
			System.out.println("số lớn nhất là: " + x);
		}else {
			System.out.println("số lớn nhất là: " + c);
		}if(y < c) {
			System.out.println("số nhỏ nhất là: " + y);
		}else {
			System.out.println("số nhỏ nhất là: " + c);
		}
	}
	
}
