package view.io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02BasicRandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		
		// tạo 1 số ngẫu nhiên
		int rn1 = rd.nextInt(); // Integer.MIN -> Integer.MAX
		
		// tạo 1 số nguyên ngẫu nhiên từ [0, n] --> inclusive 0, exclusive n
		int rn2 = rd.nextInt(20);
		
		// tạo 1 số nguyên từ [a, b)		
		int rn3 = rd.nextInt(4, 20); // jdk 17
		
		int rn4 = 4 + rd.nextInt(16);
		
		System.out.println("rn1 -->" + rn1);
		System.out.println("rn2 -->" + rn2);
		System.out.println("rn3 -->" + rn3);
		System.out.println("rn4 -->" + rn4);
		
		//VD: random 1 số thực từ 2.20 đến 56.80
		// Kết quả là số thập phân làm tròn 2 chữ số
		
		// taọ 1 số thực ngẫu nhiên trong phạm vi float	
		float rf1 = rd.nextFloat();
		
		// tạo 1 số thực ngẫu nhiên của float [0, n)
		//float rf2 = rd.nextFloat(rn4, rf1);
		
		//BigDecimal
		// --> store big float number
		// --> support rouding mode
		// --> support scaling
		
		float rf3 = rd.nextFloat(2.20f, 56.80f);
		
		BigDecimal bdrf3 = BigDecimal.valueOf(rf3)
				.multiply(BigDecimal.valueOf(rf1))
				.setScale(4, RoundingMode.HALF_UP);
		
		System.out.println("bdrf3 -->" + bdrf3);
		
	}
}
