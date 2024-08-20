package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

import static utils.IoUtils.*;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static  {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		var groups = itemGroupService.getAll();
		generate("Câu 1: Liệt kê tất cả các loại hàng", itemGroupService.getAll());
		
		var group = groups.get(0);
		var items = group.getItems();
		generate("lazy", items);
		
		// test 
		System.out.println("===========");
		itemGroupService.getItemGroupDetails();
		generate("Câu 2: Liệt kê các loại hàng theo mã loại", itemGroupService.get(523));
		
		generate("Câu 3: Liệt kê các loại hàng theo tên loại", itemGroupService.get("Mũ 256"));
	}
	
}
