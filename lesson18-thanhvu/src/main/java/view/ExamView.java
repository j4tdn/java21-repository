package view;

import service.ItemService;
import service.ItemServiceImpl;

import static utils.IoUtils.*;

import java.time.LocalDate;

public class ExamView {

	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		generate("1. Liệt kê các mặt hàng được bán trong ngày bất kì (10/04/2024)",
				itemService.getItemsBySalesDate(LocalDate.of(2024, 4, 10)));

		generate("2. Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng",
				itemService.getItemsInWarehouse());
		
		generate("3. Liệt kê tên top 3 mặt hàng được bán nhiều nhất trong năm 2024",
				itemService.getTop3ItemSaleByYear(2024));
		
		generate("4. Liệt kê danh sách các mặt hàng của mỗi loại hàng",
				itemService.getItemsOfItemGroup());
	}

}