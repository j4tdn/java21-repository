package datastructure.object.available;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		// Random 1 số nguyên ngẫu nhiên từ [5, 20)
		Random rd = new Random();
//		int number = rd.nextInt(5, 20);
		
		// kiểm tra số nguyên đó có phải là số chẵn ko
		// Nếu là số chẵn thì in ra, ngược lại thì ko làm gì cả 
//		if(number % 2 == 0) {
//			System.out.println(number);
//		}
		
		// Validate(Kiểm tra tính hợp lệ) Độ dài mật khẩu người dùng nhập vào 
		// Nếu độ dài >= 8 ==> OK hợp lệ
		// Nếu độ dài < 8 ==> Mật khẩu ko hợp lệ
		
		String password = "jdj101";
		if(password.length() >= 8) {
			System.out.println("Mat khau hop le");
		}else {
			System.out.println("Mat khau khong hop le");
		}
		
		// Nhập vào điểm tb của hs
		// yêu cầu [0, 10]
		// Nếu điểm mà 
		// + [0, 5]
		// + [5, 6.5]
		// + [6.5, 8)
		// + [8,10]
		
		float avgPoint = rd.nextFloat(11f);
		if (avgPoint > 10) {
			avgPoint = 10;
		}
		if(avgPoint < 5) {
			System.out.println("Yeu");
		}else if(avgPoint < 6.5) {
			System.out.println("Trung binh");
		}else if(avgPoint < 8) {
			System.out.println("kha");
		}else {
			System.out.println("Gioi");
		}
	}
}
