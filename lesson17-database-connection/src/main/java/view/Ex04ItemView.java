package view;

import service.ItemService;
import service.ItemServiceImpl;
import static utils.IoUtils.*;

public class Ex04ItemView {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		generate(
				"1F. Liệt kê các mặt hàng chứa thông tin [Loại hàng]",
				itemService.getAll());
	}
}
