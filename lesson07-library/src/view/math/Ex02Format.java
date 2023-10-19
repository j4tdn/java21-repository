package view.math;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex02Format {
	public static void main(String[] args) {
		//single pattern
		// pattern cho việc khởi tạo đối tượng
		//class áp dụng singleton, chỉ cho phép tạo ra 1 đối tượng cho class đó
		//NumberFormat: Sử dụng format có sẵn trong class --> Không thể biến đổi
		double value = 8743857235424.2823d;  //8.743857235424E12
		
		System.out.println("Double value:" + value);
		
		//local: vị trí, định vị của mỗi quốc gia, khu vực
		// defaul setting của JAVA: US
		NumberFormat nf = NumberFormat.getInstance(new Locale("vi", "VN")); // single pattern
		String fmValue = nf.format(value);
		System.out.println("fmValue: " +fmValue);
		
	
		System.out.println(" default locate: " + Locale.getDefault());
		
		//Demimal Format --> format với định dạng, pattern truyền vào
		value = 726.2827d;
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		String dffmValue = df.format(value);
		System.out.println("dffmValue --> " +dffmValue);
		
		//--> Công thức, tính toán, làm tròn --> Dùng BigDecimal
									//       --> setScale(scale, roundingMode)
													
		
		
		
	}
}
