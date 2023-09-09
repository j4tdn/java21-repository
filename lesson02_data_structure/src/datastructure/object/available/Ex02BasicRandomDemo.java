package datastructure.object.available;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02BasicRandomDemo {
	public static void main(String[] args) {
		Random rd = new Random();
		float rf1 = rd.nextFloat();
		
		float rf2 = rd.nextFloat(12.8f);
		
		float rf3 = rd.nextFloat(1f, 55.8f);
		
		System.out.println(rf1);
		System.out.println(rf2);
		System.out.println(rf3);

		
		// Decmal Format --> format to String for presentation
		// BigDecimal
		// --> Store big float number 
		// --> Support rounding mode
		// --> Support scaling
		
		
		//chuyển đổi float/double sang BigDecimal
		//design pattern: builder pattern
		BigDecimal bdRf3 = BigDecimal.valueOf(rf3)
				.setScale(4, RoundingMode.HALF_UP);
	}
	
	
}
