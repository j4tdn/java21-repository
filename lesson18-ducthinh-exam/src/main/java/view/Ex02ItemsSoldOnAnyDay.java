package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;
import utils.DateUtils;

import static utils.IoUtils.*;

import java.time.LocalDate;

public class Ex02ItemsSoldOnAnyDay {
	
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	static  {
		itemGroupService = new ItemGroupServiceImpl();
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		generate("Cau 1: Liệt kê các loại hàng theo ngày tạo", 
				itemService.getItemByCreatedTime(DateUtils.toSqlDate(LocalDate.of(2024, 8, 20))));
	}
	
}
