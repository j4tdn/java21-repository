package view.math;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static utils.NumberUtils.*;

public class Ex01Math {

	public static void main(String[] args) {
		
		float test = 15.34f;
		
		System.out.println("test = " + test);
		
		System.out.println("bigdecimal test01: " + BigDecimal.valueOf(test));
		System.out.println("bigdecimal test02: " + new BigDecimal(String.valueOf(test)));	// giữ nguyên giá trị khi convert
		System.out.println("bigdecimal test03: " + new BigDecimal(test));
		
		// Phân trang: Paging - Pagination
		
		int totalItems = 23;
		int itemsPerPage = 4;
		
		int totalPages = (int)Math.ceil((float)totalItems/itemsPerPage);
		System.out.println("totalPages = " + totalPages);
		
		System.out.println("==============================================");
		
		float val = 10f/3; // 3.3333333 --> mặc định 7 chữ số 
		float fv = 17f/7;  // 2.4285715 --> KH cần nhiều hơn 7 chữ số 2.428571428571429
		
		System.out.println("val = " + val);
		System.out.println("fv = " + fv);
		
		// BigDecimal bdValue = bd(17).divide(bd(7)); // Non-terminating decimal expansion; no exact representable decimal result
		
		// MathContext.DECIMAL32 --> 7 digits
		// MathContext.DECIMAL64 --> 16 digits	--> thường dùng
		// MathContext.DECIMAL128 --> 34 digits
		
		// dùng hàm này khi mình muốn chia lấy kết quả nhiều số thập phân có thể
		// ko quan tâm chính xác bao nhiêu, ko quan tâm rounding mode
		BigDecimal bdValue = bd(170).divide(bd(7), MathContext.DECIMAL128);
		System.out.println("bdValue = " + bdValue);
		
		// khi nào mình quan tâm làm tròn chính xác bao nhiêu số
		// và chế độ làm tròn(HALF_UP, UP, DOWN) như thế nào
		bdValue = bd(170).divide(bd(7), 9, RoundingMode.HALF_UP);
		System.out.println("bdValue = " + bdValue);
		
		
	}
}
