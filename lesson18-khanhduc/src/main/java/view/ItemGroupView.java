package view;

import static utils.IoUtils.generate;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		generate("2. Số lượng mặt hàng đang tồn kho của mỗi loại hàng là: ", 
					itemGroupService.getItemGroupInventory());
		
	}
}