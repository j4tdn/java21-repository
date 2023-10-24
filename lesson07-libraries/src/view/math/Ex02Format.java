package view.math;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex02Format {

	public static void main(String[] args) {
		// hàm bị gạch ngang --? deprecated method
		
		// singleton pattern
		// pattern cho việc khởi tạo đối tượng
		// class áp dụng singleton, chỉ cho phép tạo ra duy nhất 1 đối tượng cho class đó
		
		double value = 729292010220211d; //7.29292010220211E14
		
		System.out.println("double value --> " + value);
		
		// locale(language, contry): vị trí, định vị mỗi quốc gia, khu vực
		// default setting của Java: US
		
		System.out.println("default locale: " + Locale.getDefault());
		
		//NumberFormat: Sử dụng format có sẵn trong class --> ko thể biến đổi
		
//		NumberFormat nf = NumberFormat.getInstance(Locale.of("vi", "VN")); 
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("vi", "VN")); // format ra tiền tệ
		String fmtValue = nf.format(value);
		
		System.out.println("fmtValue --> " + fmtValue);
		
		// Decimal Format --> Format với định dạng, pattern truyền vào
		
		value = 726.2827d;
		DecimalFormat df = new DecimalFormat("#,###.##");
		String dffmValue = df.format(value);
		
		System.out.println("dffmValue --> " + dffmValue);
		
		// --> công thức, tính toán, làm tròn --> BigDecimal
		    //                                  --> setScale(scale, roundingMode)
	}
	
}
