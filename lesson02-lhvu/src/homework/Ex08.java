package homework;

import java.util.Scanner;

//Bài 8: Viết chương trình(hàm) kiểm tra số nguyên N có phải là số nguyên tố hay không
//Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
//(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
//VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
//= 4 → false
//= 7 → true

public class Ex08 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;

		System.out.print("Nhập vào số nguyên n:");

		while (!ip.hasNextInt()) {
			System.out.print("Đây không phải số nguyên, hãy nhập lại n:");
			ip.next();
		}
		n = ip.nextInt();
		if(kiemtra(n)){
            System.out.println(n+" là số nguyên tố!");
        } else {
            System.out.println(n+" không là số nguyên tố!");
        }

        ip.close();
    }
		
		public static boolean kiemtra (int n) {
	        if (n <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= n / 2; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
		   
}

