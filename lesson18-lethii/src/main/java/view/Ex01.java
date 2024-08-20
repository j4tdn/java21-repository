package view;

import service.ItemService;
import service.ItemServiceImpl;

import static utils.IoUtils.*;

public class Ex01 {

private static ItemService itemService;
	
	static  {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		generate(
				"Câu 1: Liệt kê các mặt hàng được bán trong ngày bất kì",
				itemService.getItemByCreateTime("2022, 03, 11")
		);
	}
	
}
