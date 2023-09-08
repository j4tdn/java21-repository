package view.io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Ex02BasicRandomDemo {

	public static void main(String[] args) {
		Random rd = new Random();
		
		// tạo 1 số nguyên ngẫu nhiên
		int rn1 = rd.nextInt(); // Integer.MIN --> Integer.Max
		
		// tạo 1 số nguyên ngẫu nhiên từ [0, n) --> inclusive 0, exclusive n
		int rn2 = rd.nextInt(20);
		
		//tạo 1 số nguyên ngẫu nhiên từ [a, b)
		int rn3 = rd.nextInt(4, 20); // JDK 17
		int rn4 = 4 + rd.nextInt(16); // a + next Int(b - a)
		
		System.out.println("rn1 --> " + rn1);
		System.out.println("rn2 --> " + rn2);
		System.out.println("rn3 --> " + rn3);
		System.out.println("rn4 --> " + rn4);
		
		// VD: random 1 số thực từ 2.20 đến 56.80
		//   : kết quả là số thập phân làm tròn 2 chữ số
		
		
//		double rn5 = rd.nextDouble(2.20, 56.80);
//		System.out.println("rn5 --> " + rn5);
//		System.out.format("lấy 2 số %.5f", rn5);
//		System.out.println(" " );
//
//		// làm tròn dùng Math.round nếu biết số đầu vào
//		
//		System.out.println("Số sau khi làm tròn: " + Math.round(rn5*100.0)/100.0);
//	
//		//Làm tròn số trong Java bằng DecimalFormat
//		DecimalFormat lt = new DecimalFormat("#.##");
//		System.out.println("Số "+rn5+" sau khi làm tròn: "+lt.format(rn5));

		System.out.println("\n=====\n");
		
		// tạo 1 số thực ngẫu nhiên trong phạm bi của float
		float rf1 = rd.nextFloat();
		
		//tạo 1 số thực ngẫu nhiên từ [0.0, n)
		float rf2 = rd.nextFloat(12.8f);
		
		//
		float rf3 = rd.nextFloat(2.2f, 56.8f);
		
		
		System.out.println("rf1 --> " + rf1);
		System.out.println("rf2 --> " + rf2);
		System.out.println("rf3 --> " + rf3);

		// round up 		--> Math.ceil
		// round down 		--> Math.float
		// commercial round --> Math.round
		
//		double rf3Rounded = Math.ceil(rf3*100f) / 100d;
//		
//		System.out.println("rf3Rounded --> " + rf3Rounded);
		
		// DecimalFormat --> format to String for presentation
		// BigDecimal
		// --> store big float number
		// --> support rounding mode
		// --> support scaling
		
		// chuyển đổi float/double sang BigDecimal
		// design pattern: builder pattern

		BigDecimal bdRf3 = BigDecimal.valueOf(rf3)
				.multiply(BigDecimal.valueOf(rf1))
				.setScale(4, RoundingMode.HALF_UP);

		System.out.println("rf3Rounded --> " + bdRf3);
	}

}
