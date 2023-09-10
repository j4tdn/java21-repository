package view;

import java.util.Scanner;

public class Ex07 {

	// Bài 7: Viết chương trình chuyển đổi cơ số một số tự nhiên ở hệ cơ số 10(thập phân) 
	// thành số ở hệ cơ số 2(nhị phân)
	
	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên cơ số 10 = ");
        int decimalNumber = ip.nextInt();

        String binaryNumber = Integer.toBinaryString(decimalNumber);

        System.out.println("Số tự nhiên " + decimalNumber + " ở hệ cơ số 2 là: " + binaryNumber);
    }

}
