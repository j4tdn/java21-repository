package view.math;

import java.math.BigDecimal;


public class Ex01Math {

	public static void main(String[] args) {
		
		float test = 2.324f;
		
		System.out.println("test --> " + test);
		
		System.out.println("bigdecimal test01 --> " + BigDecimal.valueOf(test));
		System.out.println("bigdecimal test02 --> " + new BigDecimal(String.valueOf(test))); // giữ nguyên khi đưa qua BigDecimal
		System.out.println("bigdecimal test03 --> " + new BigDecimal(test));
		// Phân trang: Paging - Pagination
		// Click vào Menu --> Mặt Hàng --> Item --> 20 items
		
		// --> Tổng số item --> TotalItems = 20
		// Cấu hình số mặt hàng trên 1 trang --> ItemsPerPage = 4
		
		// Số page --> 20/4 --> TotalPages = 5
		// 		   --> 22/4 --> TotalPages = 5.5 --> roundup = 6 pages
		// Page 1: Item 1-5
		// Page 2: Item 6-10
		// Page 3: Item 11-15
		// Page 4: Item 16-20
		// Page 5: Item 21-22
		
		int totalItems = 23;
		int itemPerPage = 4;
		
		int totalPages = (int)Math.ceil((float)totalItems/itemPerPage);
		
		System.out.println("totalPages --> " + totalPages);
		
		System.out.println("\n====\n");
		float val = 10f/3; //3.3333333 --> mặc định 7 chữ số, KH làm tròn 10 chữ số khi chia số thưc
		float fv = 17f/7;  //2.4285715 --> cần nhiều hơn 7 chữ số, 2.428571542857154285715
		
		System.out.println("Value --> " + val);
		System.out.println("Value --> " +fv);
		
		// BigDecimal bdValue = bd(17)divide()
		
		// MathContext.DECIMAL32 --> 7 digits
		// MathContext.DECIMAL64 --> 16 digits -->  thường dùng
		// MathContext.DECIMAL128 --> 34 digits
		//
		//
		
		//
		//
		//
		
		// khi nào mình quan tâm chính xác làm tròn bao nhiêu số
		// và chế độ làm tròn()

		BigDecimal bdValue = bd(17).divide(bd(7));
		System.out.println("bdValue --> ");
	}
}
