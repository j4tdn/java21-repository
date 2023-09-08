package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		//Random 1 số nguyên ngẫu nhiên từ [5,20)
		// Kiểm tra số nguyên đó có phải là số chẳn không
		
		Random rd = new Random();
		
		int number = rd.nextInt(5,20);
		
		
		if (number % 2 == 0) {
			System.out.println( number  + " là số chẳn");
	    } 
			System.out.println( number  + " là số lẻ");
			
			// Validate( kiểm tra tính hợp lệ) độ dài mật khẩu người dùng nhập vào 
			// Nếu độ dài >= 8 --> Ok hợp lệ
			// Nếu độ dài < 8 --> không hợp lệ
			
			String password = "12345";
			if (password.length() >= 8) {
				System.out.println("Hợp lệ");
			} else {
			System.out.println("Không hợp lệ ");
			}
			
			
			// Toán tử 3 ngôi 
			// (exp1) ? result1 : result2
			
			//Chỉ dùng toán tử 3 ngôi khi biểu thức if else có 1 dòng code 
			
			
			//vd1: tìm max của 2 số nguyên a,b
			int a = 7;
			int b = 2;
			
			int max = (a > b) ? a : b;
			System.out.println("Max is "+ max);
			
			
	}
	
}
