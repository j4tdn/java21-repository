package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfElse {
	
	public static void main(String[] args) {
		
		// Random 1 số nguyên ngẫu nhiên từ [5, 20)
		Random rd = new Random(); 
		int number = rd.nextInt(5, 20);
		
		//kiểm tra số nguyên đó có phải là số chẵn ko
		// nếu là số chẵn thì in ra, ngược lại không làm gì cả 
		if(number % 2 ==0) {
			System.out.println("random number is an even number --> " + number);
		}
		
		System.out.println("Line 17 - Finished");
		
		//Validate (kiểm tra tính hợp lệ) độ dài mật khẩu người dùng nhập vào 
		//nếu độ dài >= 8 ==> hợp lệ
		//nếu độ dài < 8 ==> ko hợp lệ
		
		String password = "jj12w2";
		
		if(password.length()>= 8) {
			System.out.println("mật khẩu hợp lệ");
		}else {
			System.out.println("mật khẩu không hợp lệ");
		}
		
		//nhập vào điểm trung bình của học sinh 
		//yêu cầu: [0.0, 10]
		//nếu điểm mà 
		//+ [0, 5) 	 : yếu
		//+ [5, 6.5) : trung bình
		//+ [6.5, 8] : khá
		//+ [8, 10]  : giỏi 
		
		float avgPoint = rd.nextFloat(11f);
		if(avgPoint > 10) {
			avgPoint = 10;
		}
		
		System.out.println("avgPoint : " + BigDecimal.valueOf(avgPoint).setScale(1, RoundingMode.HALF_UP));
		
		if (avgPoint < 5) {
			System.out.println("yếu");
		}
		
		
		//toán tử 3 ngôi
		// (exp) ? result1 : result2
		
		/*
		 if (exp){
		 	stm1;
		 }else{
		 	stm2;
		 }
		 */
		
		//VD1: tìm max của 2 số nguyên a, b
		int a = 7;
		int b = 2; 
		
		int max = (a > b) ? a : b;
		System.out.println("max --> " + max);
		System.out.println("min --> " + ((a > b) ? a : b));
		
		
		//chỉ dùng toán tử 3 ngôi khi biểu thức if else có 1 dòng code
	}

}
