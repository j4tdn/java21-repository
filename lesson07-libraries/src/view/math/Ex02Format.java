package view.math;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex02Format {
	public static void main(String[] args) {
		// Singleton pattern
		// Pattern cho việc khởi tạo đối tượng
		// class áp dụng singleton, chỉ cho phép tạo ra duy nhất 1 đối tượng cho class đó
		
		double value = 7123123112312321231.762d;
		
		System.out.println("double value --> " + value);
		
		// locale(language, country): vị trí, định vị của mỗi quốc gia, khu vực
		// default setting của Java: US
		
		System.out.println("default locale: " + Locale.getDefault());
		// NumberFormat: Sử dụng format có sẵn trong class --> ko thể biến đổi
		NumberFormat nf = NumberFormat.getInstance(new Locale("ja", "JP")); // singleton pattern
		String fmtValue = nf.format(value);
		
		System.out.println("fmtValue --> " + fmtValue);
		
		// Decimal Format --> format với định dạng, pattern truyền vào
		DecimalFormat df = new DecimalFormat("#,###.##");
		String dffmValue = df.format(value);
		
		System.out.println("dffmValue -->" + dffmValue);
		
		// --> Công thức, tính toán, làm tròn --> BigDecimal
		// 									  --> setScale(scale, roundingMode)
	}
}
