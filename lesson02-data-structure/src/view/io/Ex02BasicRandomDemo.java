package view.io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02BasicRandomDemo {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		// tạo 1 số nguyên ngẫu nhiên
		int rn1 = rd.nextInt(); // Integer.MIN --> Integer.MAX
		
		// tạo ra 1 số  nguyên ngẫu nhiên từ [0, n) --> inclusive 0, exclusive n
		int rn2 = rd.nextInt(20);
		
		// tạo ra 1 số  nguyên ngẫu nhiên từ [a, b)
		int rn3 = rd.nextInt(4, 20); // JDK 17
		
		int rn4 = 4 + rd.nextInt(16); // a + nextInt(b-a+1)
		
		System.out.println("rn1 --> " +rn1);
		System.out.println("rn2 --> " +rn2);
		System.out.println("rn3 --> " +rn3);
		System.out.println("rn4 --> " +rn4);
		
		System.out.println("\n==========================\n");
		
		// VD: random 1 số thực từ 2.20 đến 56.80
		//   : kết quả là số thập phân làm tròn 2 chữ số
		
		
		// tạo 1 số thực ngẫu nhiên trong phạm vi của float
		float rf1 = rd.nextFloat();
		
		// tạo 1 số thực ngẫu nhiên từ [0.0, n)
		float rf2 = rd.nextFloat(12.8f);
		
		// tạo 1 số thực ngẫu nhiên từ [a, b)
		float rf3 = rd.nextFloat(2.2f, 56.8f);
		
		System.out.println("rf1 --> " +rf1);
		System.out.println("rf2 --> " +rf2);
		System.out.println("rf3 --> " +rf3);
		
		// round up          --> Math.ceil
		// round down        --> Math.floor
		// commercial round  --> Math.round
		
		
		float rf3Rounded = Math.round(rf3 * 100f) / 100f;
		
		// hạn chế
		// làm thủ công * / cho 10^n số trong đó n là số chữ số thập phân
		
		System.out.println("rf3Rounded --> " +rf3Rounded);
		
		// DecimalFormat --> format to String for presentation
		// BigDecimal 
		// --> store big float number
		// --> support rounding mode
		// --> support scaling
		
		// chuyển đổi float/double sang BigDecimal
		// design pattern: builder pattern
		
		BigDecimal bdRf3 = BigDecimal.valueOf(rf3)
				.setScale(4, RoundingMode.HALF_UP)
				.multiply(BigDecimal.valueOf(rf1))
				.setScale(2, RoundingMode.HALF_UP);
		
		System.out.println("rf3Rounded --> " +bdRf3);
	}
}
