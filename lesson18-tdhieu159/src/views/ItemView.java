package views;

import service.ItemService;
import service.ItemServiceImpl;
import utils.SqlUtils;

public class ItemView {

	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		SqlUtils.generate("Câu 2",itemService.get());
		
	}
}