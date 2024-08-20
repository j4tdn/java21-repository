package view;

import service.ItemService;
import service.ItemServiceImpl;
import static utils.IoUtils.*;

import java.time.LocalDate;

public class Ex1 {

	private static final ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		generate("1.", itemService.getItemByCreatedTime(LocalDate.of(2024, 4, 18)));
	}
	
}
