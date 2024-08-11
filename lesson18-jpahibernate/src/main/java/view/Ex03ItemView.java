package view;

import service.ItemService;
import service.ItemServiceImpl;

import static utils.IoUtils.*;

public class Ex03ItemView {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		var items = itemService.getAll();
		generate("Câu 2A: Liệt kê các mặt hàng", items);
		
		// 2A: MatHang
		// 2B: MatHang, LoaiHang
		
		System.out.println("\n=======================\n");
		
		// lazy load
		var item = items.get(4);
		var group = item.getGroup();
		System.out.println("group --> " + group);
	}
	
}
