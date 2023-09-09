package javacoban;

import java.util.Scanner;

public class kiemtrasonguyento {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số muốn kiểm tra: ");
		int a = sc.nextInt();
		boolean soNguyenTo = true;
		if (a <= 1) { // kiểm tra số nguyên tố, số nguyên tố phải lớn hơn 1
			// Số nguyên tố chỉ chia hết cho 1 và chính nó
			// Cách kiểm tra 1 số có phải số nguyên tố hay không :
			// ----> Lấy số đó chia: khoảng từ 2 đến căn bậc 2 của số đó
			soNguyenTo = false;
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				// Math.sqrt : hàm căn bậc 2 trong JAVA

				// vòng lặp này kiểm tra xem a có chia hết cho bất kì số nào từ khoảng 2 đến căn
				// bậc 2 của a hay không
				// nếu a chia hết cho bất kì số nào trong khoảng 2 đến căn bậc 2 của a---> a
				// không phải số nguyên tố
				// ---> false
				// ngược lại nếu không có số nào để a chia hết được ---> giữ nguyên giá trị true
				if (a % i == 0) {
					soNguyenTo = false;
					break;
				}
			}
		}
		if (soNguyenTo) {
			System.out.println(a + " là số nguyên tố");
		} else {
			System.out.println(a + " không phải là số nguyên tố");
		}

	}
}
