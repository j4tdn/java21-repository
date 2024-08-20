package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import static utils.IoUtils.*;

public class Ex02 {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		generate("2. Thống kê", itemGroupService.countAmountOfItems());
	}

}
