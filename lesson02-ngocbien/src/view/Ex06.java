package view;

import java.util.Scanner;

public class Ex06 {
	// 6: Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
	// Biết rằng a,b,c là số nguyên được nhập từ bàn phiasm và nhỏ hơn 20 [0, 20)

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập a = ");
		int a = ip.nextInt();
		
		if (a < 0 || a >= 20) {
			System.out.println("Mời bạn nhập lại");
		} else {

		}
		
		System.out.print("Nhập b = ");
		int b = ip.nextInt();
		
		System.out.print("Nhập c = ");
		int c = ip.nextInt();
	}

}
