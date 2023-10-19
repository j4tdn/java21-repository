package view.math;

import java.math.BigDecimal;
import java.math.MathContext;
//import static util


public class Ex01Math {

	public static void main(String[] args) {
		
		float test = 2.324f;
		System.out.println("bigdecimal test01" +BigDecimal.valueOf(test));
		System.out.println("bigdecimal test02" + new BigDecimal(String.valueOf(test)));
		System.out.println("bigdecimal test03" +BigDecimal.valueOf(test));
		
		//Phân trang: Paging - Pagination
		//click vào 1 Menu- Mặt hàng --> Item
		
		//--> Tổng số Item --> TotalItem = 20
		// 		Cấu hình số mặt hàng trên 1 trang --> ItemsPerPage = 4
		
		// Số page --> 20/4 --> TotalPages = 5
		//			   22/4 --> TotalPages = 5.5 --> roundup = 6 pages
		// Page 1: item 1-5
		// Page 2: item 6-10
		// Page 3: item 11-15
		// Page 4: item 16-20
		// Page 5: item 21-22
		
		int totalItems = 23;
		int  itemsPerPage = 4;   // 5,25 5.75
		
		float  totalPages =(float) Math.ceil((float)(totalItems/itemsPerPage));  // 5,75 -> 5 lấy phần nguyên
		
		System.out.println("Totalpages:" + totalPages );
		
		float val = 10f/3;  // 3.3333333 --> mặc đình 7 chữ số
		float fv = 17f/7;   // 2.4285715 --> cần nhiều hơn 7 chữ số ->>......
		System.out.println("value: " + val);
		System.out.println("fv: " + fv);
		
		// Xem lại cách import class NumberUtils phút 9:03
		
	//BigDecimal bdValue = db(17).divide(bd(7));
		//MathContext.DECIMAL32 -- Số chữ số hàng thập phân 7 chữ số
		// Dùng hàm này khi mình muốn chia lấy kết quả có nhiều chữ số thập phân có thể
		// không quan tâm  chính xác làm tròn bao nhiêu số
		// và chế độ làm tròn (HALF_UP, DOWN) như thế nào
		
	
		
		
		
		
		// Số --> Làm tròn --> Kết quả vẫn là số --> dùng số để tính toán --> BigDecimal Math
		
		// Số --> Định dạng --> Trả về String hiển thị ra console với những format khác nhau 
		// --> Numberformat --> BigDecimal Format
		
	}
}
