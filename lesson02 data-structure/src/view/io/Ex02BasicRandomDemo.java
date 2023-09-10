package view.io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02BasicRandomDemo {
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		// tạo 1 số nguyên ngẫu nhiên
		 
		int rn1 = rd.nextInt(); // Integer.Min --> Integer.Max
		
		// tạo 1 số nguyên ngẫu nhiên [0;n) --> Inclusive 0, Exclusive n
		int rn2 = rd.nextInt(20);
		
		// tạo 1 số nguyên ngẫu nhiên [a;b)
		int rn3 = rd.nextInt(4, 20); // support từ JDK 17
		
		int rn4 = 4 + rd.nextInt(16); // a + nextInt(b-a)
		
		System.out.println("rn1 --> " + rn1);
		
		System.out.println("rn2 --> " + rn2);
		
		System.out.println("rn3 --> " + rn3);

		System.out.println("rn4 --> " + rn4);
		
		System.out.println("\n ==================\n");
		
		// VD: ramdom ngẫu nhiên 1 số thực từ 2.20 đến 56.80
		// kết quả là 1 số thập phân làm tròn 2 chữ số
		
		// tạo 1 số thực ngẫu nhiên trong phạm vi của float
		float rf1 = rd.nextFloat();
		
		// tạo 1 số thực ngẫu nhiên [0.0;n)
		float rf2 = rd.nextFloat(12.8f);
		
		// tạo 1 số thực ngẫu nhiên [a;b)
		float rf3 = rd.nextFloat(2.2f, 56.8f);
		
		System.out.println("rf1 --> " + rf1);
		
		System.out.println("rf2 --> " + rf2);
		
		System.out.println("rf3 --> " + rf3);
		
		// round up         --> math.ceil
		// round down       --> math.floor
		// commercial round --> math.round
		
		// DecimalFormat --> format to String for presentation
		// Big Decimal
		// --> store big float number
		// --> support rounding mode
		// --> support scalling
		
		// chuyển đổi float hoặc double sang BigDecimal
		// design pattern : builder pattern
		
		BigDecimal bdRf3 = BigDecimal.valueOf(rf3)
				.multiply(BigDecimal.valueOf(rf1))
				.setScale(4, RoundingMode.HALF_UP);
		
		// hạn chế
		// làm thủ công  * / cho 10^n số, trong đó n là số chữ số thập phân
		
		System.out.println("rf3Rounded --> " + bdRf3);
		}

}
