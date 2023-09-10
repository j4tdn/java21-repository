package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfElse {
	
	public static void main(String[] args) {
		
		// random 1 số nguyên ngẫu nhiên [5;20)
		
		Random rd = new Random();
		int number = rd.nextInt(5, 20);
		
		// kiểm tra số nguyên đó có phải là số chẵn không
		// nếu số chẵn thì in ra, ngược lại không làm gì cả
		
		// if (expression)
		// else if (expression)
		// (expression) --> true || false
		//
		
		// if (number % 2 == 0)
		// if (isEven == true) --> if (isEven)
		// if (isEven == false) --> if (!isEven)
		// if (isEven())
		
		boolean isEven = number % 2 == 0;
		
		if (isEven(number)) {
			 System.out.println("random number is an even number --> " + number);
		}
		System.out.println("Line 17 - Finished");
		// Validate (kiểm tra tính hợp lệ) độ dài mật khẩu người dùng nhập vào
		// nếu độ dài >= 8 ==> hợp lệ
		// nếu độ dài < 8 ==> mật khẩu không hợp lệ
		
		String password = "jdj101";
		if (password.length() >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		} else {
			System.out.println("Mật khẩu không hợp lệ");
		// nhập vào điểm trung bình của học sinh
		// yêu cầu: điểm nhập vào [0.0;10]
		// nếu điểm mà
		// +[0;5) : yếu
		// +[5;6.5) : trung bình
		// +[6.5;8) : khá
		// +[8; 10] : giỏi
		
		float avgPoint = rd.nextFloat(11f);
		if (avgPoint > 10) {
			avgPoint = 10;
		}
		System.out.println("avg point: " + BigDecimal.valueOf(avgPoint).setScale(1, RoundingMode.HALF_UP));
		if (avgPoint < 5) {
			System.out.println("Yếu");
		} else if (avgPoint < 6.5) {
			System.out.println("Trung bình");
		} else if (avgPoint < 8) {
			System.out.println("Khá");
		} else 
			System.out.println("Giỏi");
		}
	
		// toán tử 3 ngôi
		// (exp) ? result1 : result2
	
		/*
		if (exp){
			result1;
		} else {
			result2; 
		}
		 */
	// VD1: tìm max của 2 số nguyên a, b
	
		int a = 7;
		int b = 2;
	
		int max = (a > b) ? a : b;
		
		System.out.println("max --> " + max);
		
		System.out.println("min --> " + ((a < b) ? a : b));
		
		String rank = avgPoint < 5 ? "yếu" : avgPoint < 6.5 ? "Trung bình" : avgPoint < 8 ? "Khá" : "Giỏi";
		
		System.out.println("rank --> " + rank);		
		
		// chỉ dùng toán tử 3 ngôi khi biểu thức if else có 1 dòng code
	}
	private static boolean isEven(int number) {
		return number % 2 == 0;
		
	}
}
