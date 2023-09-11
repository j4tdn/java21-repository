package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		// Random 1 số nguyên ngẫu nhiên từ [5 đến 20)
		Random rd = new Random();
		int number = rd.nextInt(5, 20);

		
		// Kiểm tra số nguyên đó có phải là số chẵn không
		// Nếu là số chẵn thì in ra, nếu không thì không làm gì cả
		// if (expression)
		// else if ((expression))
		// (expression) -->true || false
		
		// if (number % 2 == 0)
		// if (isEven == true) --> if(isEven)
		// if (isEven == false) -- if(!isEven)
		// if (isEven() ) 1 hàm
		boolean isEven = number % 2 ==0;

		if (isEven(number)) {
			System.out.println("random number is an number --> " +number);
		}
		System.out.println("Line 17 - finished");
		// Validate ( Kiểm tra tính hợp lệ) đọ dài mật khẩu người dùng
		// Nếu độ dài >= 8 --> ok hợp lệ
		// Nếu độ dài < 8 --> Mật khẩu không hợp lệ
		
		String password = "jdjd101";
		if (password.length() >=8) {
			System.out.println("Mật khẩu hợp lệ");
		}
		else {
			System.out.println("Mật khẩu Không hợp lệ");
		}
		System.out.println("------------");
		// Nhập vào điểm trung bình của học sinh
		// Yêu cầu: điểm nhập vào [0,10]
		// Nếu điểm 
		// [0,5): Yếu
		// [5,6.5): Trung bình
		// [6.5, 8): Khá
		// [8, 10] :  Giỏi
		
		float avgPoint = rd.nextFloat(10.1f);
		if (avgPoint >10) {
			avgPoint = 10;
		}
		
		//in ra rồi làm tròn 1 chữ số, dùng hàm BigDecimal theo cú pháp dưới
		System.out.println("ĐTB-->" +BigDecimal.valueOf(avgPoint).setScale(1,RoundingMode.HALF_UP));
		if (avgPoint <5) {
			System.out.println("Yếu");	
			} else if (avgPoint < 6.5) {
				System.out.println("Trung Bình"); 
			} else if (avgPoint <8 ) {
					System.out.println("Khá");
			} else {
				System.out.println("Giỏi");
			}
		// Toán tử 3 ngôi
		// (exp) ? result 1 : result 2
		/*
		 * if (exp) {
		 * stm1;
		 * } else {
		 * 	  stm2;
		 * }
		 */
		//VD1: Tìm max của 2 số nguyên a, b
		int a = 7;
		int b = 2;
		int max = (a>b) ? a : b;
		System.out.println("Max --> "+max);
		System.out.println("Min -->"+ ((a<b)?a:b));
		
		String rank = avgPoint < 5  ? "Yếu"
				                  : avgPoint <6.5 ? "Trung bình"
						  		                  : avgPoint < 8 ? "Khá"
						  				  		                  : "Giỏi";
		System.out.println("Rank---->" +rank);
		// Chỉ dùng toán tử 3 ngôi khi biểu thức if else có 1 dòng code
	}
	private static boolean isEven(int number) {
		return number % 2 ==0;
	}
}

