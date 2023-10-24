package view.math;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static utils.NumberUtils.*;
// nghĩa là import tất cả các phương thức và thuộc tính trong numberUtils
// import những thuộc tính và hàm static trong numberUtils

public class Ex01Math {

	public static void main(String[] args) {

		float test = 2.324f;

		System.out.println("bigdecimal test01 --> " + BigDecimal.valueOf(test));
		System.out.println("bigdecimal test02 --> " + new BigDecimal(String.valueOf(test)));
		System.out.println("bigdecimal test03 --> " + new BigDecimal(test));

		// Phân trang: Paging - Pagination

		// click vào Menu --> Mặt hàng --> Item --> 20 items

		// --> Tổng số item --> TotalItems = 20
		// Cấu hình số mặt hàng trên 1 trang --> ItemsPerPage = 4

		// số page --> 20/4 --> TotalPages = 5
		// --> 22/4 --> TotalPages = 5.5 --> roundup = 6 pages

		// Page 1: Item 1-5
		// Page 2: Item 6-10
		// Page 3: Item 11-15
		// Page 4: Item 16-20
		// Page 5: Item 21-22

		int totalItems = 23;
		int itemsPerPage = 4; // 5,25 5,75

		int totalPages = (int) Math.ceil((float) totalItems / itemsPerPage);
		System.out.println("totalPages --> " + totalPages);
		System.out.println("\n=================\n");

		float val = 10f / 3; // 3.3333333 --> mặc định 7 chữ số, Khách hàng làm tròn 10 chữ số
		float fv = 17f / 7; // 2.4285715 --> cần nhiều hơn 7 chữ số,

		System.out.println("value --> " + val);
		System.out.println("fv --> " + fv);

//		BigDecimal bdValue = bd(17).divide(bd(7));// Non-terminating decimal expansion; no exact representable decimal result.

		// Dùng hàm này khi mình muốn chia lấy kết quả nhiều số thập phân có thể
		// ko quna tâm chính xác bao nhiêu, ko quan tâm rounding mode
		BigDecimal bdValue = bd(170).divide(bd(7), MathContext.DECIMAL64);
		System.out.println("bdValue --> " + bdValue);
		
		// khi nào quna tâm chính xác làm tròn bao nhiêu số
		// và chế độ làm tròn(HALF_UP, UP, DOWN) như thế nào

		bdValue = bd(170).divide(bd(7), 10, RoundingMode.HALF_UP);

		System.out.println("bdValue --> " + bdValue);

		
		// Số --> Làm tròn --> Kết quả vẫn là số --> dùng số để tính toand --> BigDecimal, Math
		
		// Số --> Làm tròn --> Trả về String hiển thị ra console với những format khác nhau , , - --> NumberFormat, DecimalFormat
	}
}
