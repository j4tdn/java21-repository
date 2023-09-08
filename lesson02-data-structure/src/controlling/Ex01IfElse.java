package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfElse {

	public static void main(String[] args) {
		
		// Random một số nguyên ngẫu nhiên từ 5 đến 20
		Random rd = new Random();
		int number = rd.nextInt(5, 20);
		
		// Kiểm tra số nguyên đó có phải là số chẵn không
		// Nếu là số chẵn thì in ra, ngược lại ko là gì cả
		
		// if (expression)
		// else if (expression)
		// (expression) --> true || false
		
		// if (number % 2 == 0)
		// if(isEven == true) --> if(isEven)
		// if(isEven == false) --> if(!isEven)
		// if(isEven())

		//boolean isEven = number % 2 ==0;
		
		if (isEven(number)) {
			System.out.println("random is an even number --> " + number);
		}
		
		System.out.println("Line 18 - Finished");
		
		// validate(kiểm tra tính hợp lệ) độ dài mật khẩu người dùng nhập vào
		// nếu độ dài >= 8 ==> OK hợp lệ
		// nếu độ dài <= 8 ==> Mật khẩu không hợp lệ
		
		String password = "bfvfvfd";
		if (password.length() >= 8 ) {
			System.out.println("Mật khẩu hợp lệ");
		} else {
			System.out.println("Mật khẩu không hợp lệ");
		}
		
		// Nhập vào điểm trung bình của học sinh
		// yêu cầu: [0, 10]
		// Nếu điểm mà
		// + [0,5): 	yếu
		// + [5, 6.5): 	TB
		// + [6.5, 8): 	khá
		// + [8, 10]: 	giỏi
		
		
		float avgPoint = rd.nextFloat(10.1f);
		if (avgPoint >= 10) {
			avgPoint = 10;
		}
		
		avgPoint = avgPoint > 10 ? 10 : avgPoint;
		
		System.out.println("Avg Point = " + BigDecimal.valueOf(avgPoint).setScale(1, RoundingMode.HALF_UP));
		
		if (avgPoint < 5) {
			System.out.println("Yếu");
		}else if (avgPoint < 6.5) {
			System.out.println("TB");
		}else if (avgPoint < 8) {
			System.out.println("Khá");
		}else {
			System.out.println("Giỏi");
		}
		// Toán tử 3 ngôi
		// (exp) ? result1 : result2
		
		/**
		 	if(exp){
		 		result1;
		 	} else{
		 		result2;
		 	}
		 */
		
		//VD1: Tìm max của 2 số nguyên a, b
		int a = 7;
		int b = 2;
		int max = (a > b) ? a : b;
		System.out.println("max --> " + max);

		System.out.println("min -->" + ((a < b) ? a : b) );
		
		
		String rank = avgPoint < 5 ? "Yếu"
								   : avgPoint < 6.5 ? "TB"
													 : avgPoint < 8 ? "Khá"
																   : "Giỏi";
		
		System.out.println("rank --> " + rank);
				
		// chỉ dùng toán tử 3 ngôi khi biểu thức if else có 1 dòng code
		
	}
	
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

}
