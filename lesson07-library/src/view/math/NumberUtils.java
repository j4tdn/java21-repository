package view.math;

import java.math.BigDecimal;

public class NumberUtils {
	
	private NumberUtils() {
		
	}
	public static BigDecimal db(double value) {
		
		//C1 -- new BigDecimal(String)
		//C2 -- BigDecimal.valueOf(double)
		return new BigDecimal(String.valueOf(value));
		
	}
}
