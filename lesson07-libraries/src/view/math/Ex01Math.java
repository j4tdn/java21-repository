package view.math;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static utils.NumberUtils.*;

public class Ex01Math {
	public static void main(String[] args) {
		
		//Phân trang: Paging - Pagination
		//Click vào menu --> Mặt Hàng--> Item --> 20 items
		
		// --> Tổng số item --> TotalItems = 20
		// Cấu hình số item trên 1 trang --> ItemsPerPage = 4
		
		//số pag --> 20/4 --> TotalPages = 5
		//		 -- 22/4 --> TotalPages = 5.5 --> roundup = 6 pages
		
		int totalItems = 23;
		int itemsPages = 4;
		
		float totalPages = (int)Math.ceil((float)totalItems / itemsPages);
		System.out.println(totalPages);
		
		float val = 10f/3;
		float fv = 17f/7;
		
		System.out.println("value --> " + val);
		System.out.println("value --> " + fv);
		
		float fl = 2.324f;
		
		System.out.println("test1" + BigDecimal.valueOf(fl));
		System.out.println("test2" + new BigDecimal(String.valueOf(fl)));/// ưu tiên dùng cách này
		System.out.println("test3" + new BigDecimal(fl));
		
		BigDecimal bdValue = bd(17).divide(bd(7), MathContext.DECIMAL128);
		System.out.println("bdValue --> " + bdValue);
		
		//thường sẽ dùn halfup halfdown
		BigDecimal bdValue2 = bd(170).divide(bd(7), 10, RoundingMode.HALF_UP);
								
		System.out.println("bdValue2 --> " + bdValue2);
				
		
	}
	
}
