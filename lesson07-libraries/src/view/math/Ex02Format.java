package view.math;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ex02Format {

	public static void main(String[] args) {
		// singleton pattern
		// pattern cho việc khởi tạo đối tượng
		// class áp dụng singleton, chỉ cho phép tạo ra duy nhất 1 đối tượng cho class đó
		
		double value = 729292010646521d;
		
		System.out.println("double value --> " + value);
		
		// locale: vị trí, định vị của mỗi quốc gia, khu vực
		// default setting của Java: en_US
		
		// NumberFormat: sử dụng format có sẵn trong class --> ko thể biến đổi
		NumberFormat nf = NumberFormat.getInstance();
		String fmtValue = nf.format(value);
		
		System.out.println("fmtValue --> " + fmtValue);
		
		// Decimal Format --> format với định dạng, pattern truyền vào
		
		value = 726.2827d;
		DecimalFormat df = new DecimalFormat("#,###.##");
		String dffmValue = df.format(value);
		
		System.out.println("dffmValue --> " + dffmValue);
		
		// --> Công thức, tính toán, làm tròn --> BigDecimal
		//									  --> setScale(scale, roundingMode)
	}
	
}
