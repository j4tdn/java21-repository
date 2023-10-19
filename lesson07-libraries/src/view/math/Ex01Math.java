package view.math;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static utils.NumberUtils.*;

public class Ex01Math {
	public static void main(String[] args) {
		// Phân trang: paging - pagination
		// Click vào Menu --> Mặt hàng --> Item --> 20 items
		
		// --> Tổng số item --> TotalItems = 20
		// --> Cấu hình số mặt hàng trên 1 trang --> ItemPerPage = 4
		
		// số page --> 20/4 --> TotalPages = 5
		//			   22/4 --> TotalPages = 5.5 --> roundup = 6 pages
		// Page 1: Item 1-5
		// Page 2: Item 6-10
		// Page 3: Item 11-15
		// Page 4: Item 16-20
		// Page 5: Item 21-22	
		
		int totalItems = 22;
		int itemsPerPage = 4;
		
		int totalPages = (int)Math.ceil((float)totalItems / itemsPerPage) ;
		
		System.out.println("totalPages --> " + totalPages);
		
		int val = 10/3; // 3.333333 --> mặc định 7 chữ số, KH làm tròn 10 chữ số khi chia số thực
		float fv = 17f/7; // 2.4285715 --> cần nhiều hơn 7 chữ số , 2.3414125123412421
		System.out.println("Total " + val);
		System.out.println("Total " + fv);
		// Khi mình muốn chia lấy kết quả nhiều số thập phân có thể
		// Không quan tâm chính xác bao nhiêu
		// BigDecimal bdValue = NumberUtils.bd(17).divide(NumberUtils.bd(7), MathContext.DECIMAL32);
		
		// Khi nào mình quan tâm chính xác làm tròn bao nhiêu số
		// Và chế độ làm tròn như thế nào
		BigDecimal bdValue = bd(17).divide(bd(7), 9, RoundingMode.HALF_UP);
		System.out.println("bdValue -->" + bdValue);
		
		// Số --> Làm tròn --> Kết quả vẫn là số --> dùng số để tính toán --> BigDecimal, Math
		
		// Số --> Làm tròn --> Trả về String hiển thị ra console với những format khác nhau , ... --> NumberFormat, DecimalFormat
		
	}
}
