package utils;

import java.math.BigDecimal;

public class NumberUtils {
	
	private NumberUtils() {
	}
	
	public static BigDecimal bd(double val) {
		return BigDecimal.valueOf(val);
	}

}
