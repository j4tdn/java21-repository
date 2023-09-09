package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		// random 1 số nguyên ngẫu nhiên từ 5 - 20
		
		// kiểm tra số nguyên đó có phải là số chẵn k
		// nếu là số chẵn in ra ngược lại k làm gì cả
		
		Random rd = new Random();
		int number = 5 + rd.nextInt(16);
		//System.out.println(number);
		if(isEven(number)) {
			System.out.println("random number is an even number -->" + number);
		}
		
		// vailidate độ dài mật khẩu người dùng nhập vào
		// nếu độ dài >=8 --> hợp lệ
		
		String password = "dsafs23";
		if(password.length() >= 8) {
			System.out.println("Pass OK");
		} else {
			System.out.println("Không hợp lệ");
		}
		
		// nhập vào DTB học sinh
		// 0.0 ->10
		// nếu 0-5) yếu
		//[5,6.5) khá
		// [6.5,8) khá
		// giỏi
		
		float avgPoint = rd.nextFloat() * 10;
		
		if(avgPoint < 5) {
			System.out.println("yếu");
		} else if(avgPoint < 6.5) {
			System.out.println("TB");
		} else if(avgPoint < 8) {
			System.out.println("Khá bảnh");
		} else {
			System.out.println("ni hảo");
		}
		
	}
	
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}
}
