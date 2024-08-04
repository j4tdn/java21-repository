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
		generate("Câu 1: Liệt kê tất cả các loại hàng --> ", itemGroupService.getAll());
	}
}
