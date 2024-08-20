package view;

import static utils.IoUtils.*;

import java.time.LocalDate;

import service.ItemService;
import service.ItemServiceImpl;

public class Ex04ItemView {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		
		generate(
				"1F. Liệt kê các mặt hàng chứa thông tin [loại hàng]", 
				itemService.getAll()
		);
		
		generate("1H. Liệt kê các mặt hàng được bán theo ngày bán", 
				itemService.getItemsBySalesDate(LocalDate.of(2024, 4, 18))
		);
	}
	
}
