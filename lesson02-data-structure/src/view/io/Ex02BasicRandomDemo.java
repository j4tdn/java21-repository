package view.io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02BasicRandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		int rn1 = rd.nextInt(20);
		
		int rn2 = 4 + rd.nextInt(16);
		
		// JDK 17
		// int rn2 = rd.nextInt(4, 20);
		System.out.println(rn1);
		System.out.println(rn2);
		
		// VD: random 1 số thực từ 2.20 --> 56.80
		// 	: kết quả trả về 1 số thực làm tròn 2 chữ số
		
		float rf1 = rd.nextFloat();
		
		float rf2 = rd.nextFloat();
		
		BigDecimal bdRf3 = BigDecimal.valueOf(rf1)
				.multiply(BigDecimal.valueOf(rf2))
				.setScale(2, RoundingMode.HALF_UP);
		
		System.out.println(bdRf3);
	}
}
