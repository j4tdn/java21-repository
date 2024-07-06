package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import static utils.IoUtils.*;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		generate(
				"1A. Liệt kê các loại hàng trong hệ thống",
				itemGroupService.getAll()
		);
	}
}
