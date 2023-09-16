package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfEsle {
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(5, 20);
		if (a % 2 == 0)
			System.out.println("so random la: " + a + " la so chan");
		else
			System.out.println("so random la: " + a + " la so le");

		// Validate(kiểm tra tính hợp lệ) độ dài mật khẩu người dùng nhập vào
		// Nếu độ dài >= 8 ==> Ok hợp lệ
		// nếu độ dài <8 ==> k hợp lệ
		String password = "dvjdvkdnvkd";
		if (password.length() >= 8)
			System.out.println("Ok hợp lệ");
		else
			System.out.println("k hợp lệ");

		// Nhập vào điểm trung bình của học sinh
		// Yêu cầu từ [0.0,10.0]
		// [0,5.0) Ngu
		// [5, 6.5) tạm
		// [6.5, 8.0) đc
		// [8.0, 10.0] giỏi

		float avgPoint = rd.nextFloat(10.1f);
		System.out.println("avg point" + BigDecimal.valueOf(avgPoint).setScale(1, RoundingMode.HALF_UP));
		if (avgPoint < 5)
			System.out.println("ngu");
		else if (avgPoint < 6.5)
			System.out.println("tam");
		else if (avgPoint < 8)
			System.out.println("dc");
		else
			System.out.println("gioi");

		// toán tử 3 ngôi
		// (exp) ? result1 : result2
		/*
		  
		 * if (exp){
		 * stm1; 
		 * } else { stm2; }
		 */
		
		//Vd1: Tìm max của 2 số nguyên c,b
		
		int c=7;
		int b=3;
		int max =(c>b) ? c : b;
		System.out.println("max--->" + max);
		System.out.println("min--->" + ((c<b)?c :b));
	}
}
