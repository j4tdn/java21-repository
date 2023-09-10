package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		// Random 1 số nguyên ngẫu nhiên từ 5->20
		Random rd = new Random();
		int number = rd.nextInt(5, 20);
		
		if (number % 2 == 0) {
			System.out.println("Random number is an even number: " + number);
		} else {
			System.out.println("Random number is NOT an even number: " + number);
		}
		System.out.println("\n=======Finished========\n");
		
		//BigDecimal.valueOf(number).setScale(1,RoundingMode.HALF_UP);
		
		/*
		 *  Nhập vòa điểm trung bình của học sinh
		 *  Yêu cầu: [0, 10]
		 *  Nếu điểm mà:
		 *  +) [0, 5]: Yếu
		 *  +) [5, 6.5]: TB
		 *  +) [6.5, 8]: Khá
		 *  +) [8, 10]: Giỏi
		 */
		
		/*
		 * Toán tử 3 ngôi
		 * exp1 ? result1 : result2
		 * Chỉ dùng khi biểu thức if else có 1 dòng code
		 */
	}
}
