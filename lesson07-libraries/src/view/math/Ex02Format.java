package view.math;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex02Format {
	public static void main(String[] args) {
		
		double value = 75464848976546765.414d;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("ja", "JP"));
		String fmtValue = nf.format(value);
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("ja", "JP")); //format tiền tệ
		String fmtValue2 = nf2.format(value);
		
		System.out.println("fmtValue --> " + fmtValue);
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		String dffmValue = df.format(value);
		
		System.out.println("dffmValue --> " + dffmValue);
		
	}
}
