package view.io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02BasicERandomDemo {
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		//tạo 1 số nguyên ngẫu nhiên
		
		int rn1 = rd.nextInt(); //Integer.MIN -> Integer.MAX
		
		
	    // tạo 1 số ngyên ngẫu nhiên từ [0, n) --> inclusive 0, exclusive n
		int rn2 = rd.nextInt(20);
		
		// tạo 1 số nguyên ngẫu nhiên từ [a, b)
		int rn3 = rd.nextInt(4,20); //JDK 17
		
		int rn4 = 4 + rd.nextInt(16); // a + nextInt(b-a)
		
		// random 1 số thực từ 2.20 đến 56.80
	    // :kết quả là số thập phân làm tròn 2 chữ số 
		
		 
		
		
		double rn5 = rd.nextDouble(2.20, 56.80);
	
		
		System.out.println("rn1 --> " + rn1 );
		System.out.println("rn2 --> " + rn2);
		System.out.println("rn3 --> " + rn3);
		System.out.println("rn4 --> " + rn4);
		
		
		//Cái này chỉ in ra để format chứ không dùng làm tròn để tính toán 
		System.out.printf("\n%.10f\n", rn5);
		
		System.out.println("--------------");
		System.out.println("rn5 --> " + Math.round(rn5));
		System.out.println("rn5 --> " + Math.floor(rn5)); // round down 
		System.out.println("rn5 --> " + Math.ceil(rn5)); // round up
		//ép từ float sang double thì ok
		// từ double sang float k ok
		
		
		// DecimalFormat --> format to String
		// BigDecimal
		// --> store big float number 
		// --> support rounding mode
		// --> support scaling
		
		// chuyển đổi float/double sang BigDecimal
		// design pattern: builder pattern
		BigDecimal bdRf3 = BigDecimal.valueOf(rn5)
				.multiply(BigDecimal.valueOf(rn2))
				.setScale(4, RoundingMode.HALF_UP);
		
		//mục đích: chuyển qua dùng BigDecimal cho tiện để sử dụng các thuộc tính của hắn,
		// thay vì sử dụng double hay float.
		System.out.println("bdRf3: " + bdRf3);
	}
}
