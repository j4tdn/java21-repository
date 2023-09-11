package homework;

import java.util.Scanner;

//Bài 3: Viết chương trình tìm giai thừa của một số nguyên dương N
//Biết rằng: N có thể được nhập từ bàn phím hoặc khai báo sẵn

public class Ex03 {
	public static void main(String[] args) {
		int n;
		int gt = 1;
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên dương n:");
	while (!ip.hasNextInt() ) {
		System.out.print("Đây không phải số nguyên dương, hãy nhập lại n:");
		ip.next();
	} 	n = ip.nextInt();
		for (int i=1;i<n; i++) {
			gt=gt*i;
		}
		System.out.println("Giai thừa của" + " " + +n + " " + "là:" +gt);
	}
}
