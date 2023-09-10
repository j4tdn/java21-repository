package view;

import java.util.Scanner;

// Viết chương trình chuyển đổi cơ số một số tự nhiên ở hệ cơ số 10(thập phân) thành số ở hệ
// cơ số 2(nhị phân)

public class Ex07DecimalToBinary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập một số n: ");
		int n = scanner.nextInt();
		
		System.out.println("Giá trị nhị phân của " + n + " là: " + Integer.toBinaryString(n));
		
		scanner.close();
	}
}	
