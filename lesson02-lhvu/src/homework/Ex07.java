package homework;

import java.util.Scanner;

// Viết chương trình chuyển đổi cơ số một số tự nhiên ở hệ cơ số 10(thập phân) thành số ở hệ
// cơ số 2(nhị phân)

public class Ex07 {
	public static void main(String[] args) {
		int n;
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số tự nhiên:");
		n = ip.nextInt();
		
		String binary = "";
		
		while (n>0) {
			binary = (n%2) + binary ;
			n /= 2;
		}
		System.out.println("Số ở hệ cơ số nhị phân là:" +binary);
	}
}
