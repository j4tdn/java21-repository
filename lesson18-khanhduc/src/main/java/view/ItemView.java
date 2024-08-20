package view;

import static utils.IoUtils.generate;

import java.time.LocalDate;

import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2024, 04, 10);
		
		generate("1. Mặt hàng có trong ngày "+date+ " là: ", 
				itemService.getAllItemToday(date));
		
//		generate("3. Top 3 mặt hàng bán nhiều nhất là:", 
//				itemService.getTop3SellingItemsByYear(2024));
//		
//		generate("4. Danh sách chi tiết các mặt hàng của mỗi loại hàng", 
//				itemService.getAllItemDetail());
	}
}