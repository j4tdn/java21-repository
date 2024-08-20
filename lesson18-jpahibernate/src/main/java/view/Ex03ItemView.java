package view;

import persistence.entities.ItemGroup;
import service.ItemService;
import service.ItemServiceImpl;
import utils.IoUtils;

public class Ex03ItemView {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		var items = itemService.getAll();
		IoUtils.generate("Câu 2A: Liệt kê các mặt hàng", items);
		
		// 2A: MatHang
		// 2B: MatHang, LoaiHang
		
		System.out.println("====================");
		
		// lazy
		ItemGroup item4 = items.get(4).getGroup();
	}
	
}
