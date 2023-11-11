package view.math;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex02Format {

	public static void main(String[] args) {
		
		double value = 34673856693453445.762d;
		
		System.out.println("double value --> " + value);
		
		System.out.println("default local: " + Locale.getDefault());
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN")); // format ra tiền tệ
		String fmtValue = nf.format(value);
		
		System.out.println("fmtValue -->" + fmtValue);
		
		value = 726.328;
		
		DecimalFormat df = new DecimalFormat("#,###.##");
		String dffmtValue = df.format(value);
		
		System.out.println("dffmtValue --> " + dffmtValue);
		
	}
}
