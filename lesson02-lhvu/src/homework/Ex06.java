package homework;

import java.util.Scanner;

//Bài 6: Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
//Biết rằng a,b,c là số nguyên được nhập từ bàn phím và nhỏ hơn 20 [0, 20)

public class Ex06 {
	public static void main(String[] args) {
		int a, b, c, max1, max;

		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số tự nhiên từ [0-20] a:");
		while (!ip.hasNextInt()) {
			System.out.print("Không phải số nguyên. Hãy nhập lại a:");
			ip.next();
		}
		a = ip.nextInt();
		System.out.print("Nhập số tự nhiên từ [0-20] b:");
		while (!ip.hasNextInt()) {
			System.out.print("Không phải số nguyên. Hãy nhập lại b:");
			ip.next();
		}
		b = ip.nextInt();
		System.out.print("Nhập số tự nhiên từ [0-20] c:");
		while (!ip.hasNextInt()) {
			System.out.print("Không phải số nguyên. Hãy nhập lại c:");
			ip.next();
		}
		c = ip.nextInt();

		if (a > b) {
			max1 = a;
		} else {
			max1 = b;
		}
		if (max1 > c) {
			max = max1;
		} else {
			max = c;
		}
		System.out.println("Số lớn nhất là:" + max);
	}
}
