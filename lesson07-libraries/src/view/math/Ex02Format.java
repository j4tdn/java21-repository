package view.math;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex02Format {

	public static void main(String[] args) {
		// singleton pattern
		// pattern cho việc khởi tạo đối tượng
		// class áp dụng singleton, chỉ cho phép tạo ra duy nhất 1 đối tượng cho class đó
		
		double value = 72929292929229292d; //7.2929292929229296E16
		
		System.out.println("double value --> " + value);
		
		// locale(language country): vị trí, định vị của mỗi quốc gia, khu vực
		// dafault setting của Java: US
		
		System.out.println("default locale: " + Locale.getDefault());
		
		// NumberFormat: Sử dụng format có sẵn trong class --> ko thể biến đổi
		//NumberFormat nf = NumberFormat.getInstance(new Locale("vn", "VN")); // format ra số
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN")); // format ra tiền tệ  
		String fmtValue = nf.format(value);
		
		System.out.println("fmtValue --> " + fmtValue);
		
		// Decimal Format --> format với định dạng, pattern truyền vào
		value = 726.2853d;
		DecimalFormat df = new DecimalFormat("#,###.##");
		String dffmValue = df.format(value);
		
		System.out.println("dffmValue -->" + dffmValue);
		
		// --> Công thức, tính toán, làm tròn --> BigDecimal
		//									  --> sétcale(scale, roundingMode)
	}
}
