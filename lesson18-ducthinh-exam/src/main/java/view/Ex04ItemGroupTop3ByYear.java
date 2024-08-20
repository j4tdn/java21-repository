package view;
import static utils.IoUtils.*;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
public class Ex04ItemGroupTop3ByYear {
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		
		
		generate("Câu 3: Liệt kê các 3 mặt hàng có số lượng bán cao nhất", itemGroupService.getItemGroupTop3ByYear(2024));
	}
}
