package utils;

import java.math.BigDecimal;

public class NumberUtils {

	private NumberUtils() {
	}

	public static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
	
}
