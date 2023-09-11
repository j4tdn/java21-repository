package homework;

import java.text.Normalizer.Form;
import java.util.Scanner;

//Bài 2: Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không
//Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
//(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ

public class Ex02 {
	public static void main(String[] args) {
		int n; int mul =1;
		Scanner ip = new Scanner(System.in);
			System.out.print("Nhập vào số nguyên dương n:");
		while (!ip.hasNextInt() ) {
			System.out.print("Đây không phải số nguyên dương, hãy nhập lại n:");
			ip.next();
		} 	n = ip.nextInt();
	 for (int i =0;i <n ; i++) {
		mul *= 2;
		if(mul == n) {
			System.out.println(+n + "Là lũy thừa của 2");
			break;
		} else if (mul>n) {
			System.out.println(+n + "Không phải là lũy thừa của 2");
			break;
		}
	 } 
		
}
}
