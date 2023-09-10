package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfElse {

	public static void main(String[] args) {
		
		// random 1 số nguyên ngẫu nhiên từ 5 đến 20
		Random rd = new Random();
		int number = rd.nextInt(5, 20);
		
		// kiểm tra số nguyên đó có phải là số chẵn ko
		if(number % 2 == 0) {
			System.out.println("random number is an even number --> "+number);
		}
		
		System.out.println("finished");
		
		// validate(ktra tính hợp lệ) độ dài mật khẩu người dùng nhập vào
		// nếu độ dài >= 8 ==> OK hợp lệ
		// Nếu độ dài < 8  ==> Mật khẩu ko hợp lệ
		
		String password = "jdj101";
		if(password.length() >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		}else {
			System.out.println("Mật khẩu không hợp lệ");
		}
		
		// nhập điểm trung bình của học sinh
		// yêu cầu: [0.0, 10)
		// nếu điểm mà
		//+ [0, 5)  : yếu
		//+ [5, 6.5): trung bình
		//+ [6.5, 8): khá
		//+ [8, 10) : giỏi
		
		float avgPoint = rd.nextFloat(11f);
		if(avgPoint > 10) {
		   avgPoint = 10;
		}
		
		System.out.println("avg Point: " + BigDecimal.valueOf(avgPoint).setScale(1, RoundingMode.HALF_UP));
		
		if(avgPoint < 5) {
			System.out.println("yếu");
		}else if(avgPoint < 6.5){
			System.out.println("Trung bình");
		}else if(avgPoint < 8) {
			System.out.println("Khá");
		}else {
			System.out.println("Giỏi");
		}
		
		// toán tử 3 ngôi
		// (exp) ? stm1 : stm2
		
		/*
		 if(exp){
		  stm1;
		 } else{
		 stm2;
		 }
		*/
		 
		
	}

}
