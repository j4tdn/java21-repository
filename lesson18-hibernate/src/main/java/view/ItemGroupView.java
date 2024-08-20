package view;

import java.util.List;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.IoUtils;

public class ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		IoUtils.generate("Danh sách loại hàng là:",
						itemGroupService.getAll());
		
		IoUtils.generate("Danh sach loai hang + chi tiet mat hang", itemGroupService.countItemsByItemGroup());
	}

}
