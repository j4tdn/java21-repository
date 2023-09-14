package homework;

import java.util.Scanner;

//Bài 1: Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
//Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối
//đa 5 lần) Mutilple

public class Ex01 {
	public static void main(String[] args) {
		int n, mul;
		Scanner ip = new Scanner(System.in);
		do {
			System.out.print("Nhập vào số nguyên n:");

			while (!ip.hasNextInt()) {
				System.out.print("Đây không phải số nguyên, hãy nhập lại n:");
				ip.next();
			}
			n = ip.nextInt();
			mul = n % 2;
			if (mul == 0) {
				System.out.println(+n +" " + "là bội của 2:");
				break;
			} else {
				System.out.println(+n + " " + "không phải là bội của 2");
				break;
			}
		} while (true);
	}
}