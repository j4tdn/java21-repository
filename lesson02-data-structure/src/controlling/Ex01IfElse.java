package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		
		// Random 1 số nguyên từ 5 đến 20
		Random rd = new Random();
		int number = rd.nextInt(5, 20);
		
		
		
		// Kiểm tra số nguyên đó có phải số chẵn không
		if (number %2 == 0) {
			System.out.println("random number is an evev number -->" + number);
			
		}
		
		System.out.println("Finished");
		
		//Validate(kiểm tra tính hợp lệ) độ dài mật khẩu người dùng nhập vào
		//Nếu độ dài >=8 ==> OK hợp lệ
		//Nếu độ dài < 8 ==> Mật khẩu k hợp lệ
		
		String password = "jdj101";
		
		if (password.length() >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		} else {
			System.out.println("Mật khẩu k hợp lệ");
		}
		
		float avgPoint = rd.nextFloat(11f);
		
		avgPoint = 10.5f;
		
		System.out.println("avgPoint -->" + avgPoint);
		
		if (avgPoint > 10) {
			avgPoint = 10;
		}
		
		System.out.println(BigDecimal.valueOf(avgPoint).setScale(1, RoundingMode.HALF_UP));
		
		if (avgPoint < 5) {
			System.out.println("Yếu");
		}else if (avgPoint < 6.5) {
			System.out.println("Trung bình");
		}else if (avgPoint < 8) {
			System.out.println("Khá");
		}else {
			System.out.println("Giỏi");
		}
		
		// Toán tử 3 ngôi 
		// --> chỉ dùng khi biểu thức if else có 1 dòng code
		// (exp) ? stm1:stm2
		
		String rankString = avgPoint < 5 ? "Yếu" : avgPoint < 6.5 ? "Trung bình" : "Giỏi";
		
	}
}
