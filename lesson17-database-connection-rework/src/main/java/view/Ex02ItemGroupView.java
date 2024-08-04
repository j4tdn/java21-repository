package view;

import java.util.Arrays;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.IoUtils;

public class Ex02ItemGroupView {
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		IoUtils.generate("1A. Itemgroup", itemGroupService.getAll());
		
		IoUtils.generate(
				"1A. Liệt kê các loại hàng trong hệ thống", 
				itemGroupService.getAllWithItems()
		);
		
		IoUtils.generate("1B. Liệt kê các loại hàng theo mã loại (MaLH = 4)",
				Arrays.asList(itemGroupService.get(4))
		);
	}
}
