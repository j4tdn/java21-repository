package view;

import persistence.entities.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;
import static utils.IoUtils.*;

public class Ex03ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		generate("Câu 2: Hiển thị số lượng mặt hàng của mỗi loại hàng", itemGroupService.getItemGroupDetails());
	}
	
}
