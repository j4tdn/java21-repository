package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		
		// Random 1 số nguyên ngẫu nhiên từ [5 - 20)
		Random rd = new Random();
		int number = rd.nextInt(5,20);
		
		boolean isEven = number % 2 == 0; 
		// Kiểm tra số nguyên đó có phải là số chẵn k
		// Nếu là số chẵn thì in, ko thì ko làm gì cả
		
		if (isEven) {
			System.out.println(number + " là số chẵn");
		}
		
		
		
		System.out.println("finished at line 17 ");
		
		// Validate(kiểmt ra tính hợp lệ) độ dài mật khẩu người dùng nhập vào
		// Nếu length >= 8 --> hợp lệ,  nhỏ hơn 8 ko hợp lệ
		
		String password = "quynhdao259";
		if (password.length() >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		} else {
			System.out.println("Mật khẩu không hợp lệ");
		}
		
		// Nhập vào điểm trung bình của học sinh [0, 10]
		
		float avgPoint = rd.nextFloat(10.1f);
		if (avgPoint > 10) {
			avgPoint = 10;
		}
		System.out.println("Điểm trung bình của hs là: " + avgPoint);
		
		System.out.println("Điểm trung bình của hs đã làm tròn là: " + BigDecimal.valueOf(avgPoint).setScale(2, RoundingMode.HALF_UP));
		
		if ( avgPoint < 5) {
			System.out.println("Yếu");
		} else if ( avgPoint < 6.5 ) {
			System.out.println("Trung bình");
		} else if ( avgPoint < 8) {
			System.out.println("Khá");
		} else {
			System.out.println("Giỏi");
		}
		
		// Toán tử 3 ngôi
		// (biểu thức 1) ? result1 : result2;
		
		int a = 6, b = 2;
		int max = (a > b)? a : b;
		System.out.println("Max của a, b là: " + max);
		
		int min = (a < b)? a : b;
		System.out.println("Min của a, b là: " + min);

		
		// Chỉ dùng toán tử 3 ngôi khi biểu thức if else có 1 dòng code
		
		
		
	}
	private static boolean isEven(int number) {
		return number % 2 ==0;
	}
}
