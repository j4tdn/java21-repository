package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class App {
	
	private static ItemService itemService;
	private static ItemGroupService itemGroupService;
	
	static {
		itemService = new ItemServiceImpl();
		itemGroupService= new ItemGroupServiceImpl();
		
	}
	
	public static void main(String[] args) {
		System.out.println("Câu 1: Liệt kê các mặt hàng được bán trong ngày bất kỳ. Với ngày bán là tham số\r\n"
				+ "truyền vào.\r\n"
				+ "Kết quả trả về được sắp xếp theo CREATED_TIME desc, ID asc");
		itemService.getItemSoldByDate("2024-04-10").forEach(System.out::println);
		
		System.out.println("\n====================================\n");
		
		System.out.println("Câu 2: Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng, biết rằng hàng\r\n"
				+ "tồn kho là số mặt hàng còn lại trong hệ thống");
		itemGroupService.getAmountByItemGroup().forEach(System.out::println);
		
		System.out.println("\n====================================\n");
		
		System.out.println("Câu 3: Liệt kê top 3 mặt hàng được bán nhiều nhất của năm bất kỳ. Với năm là\r\n"
				+ "tham số truyền vào.\r\n"
				+ "Nếu có nhiều hơn 3 mặt hàng có số lượng lớn nhất bằng nhau, chọn mặt\r\n"
				+ "hàng có mã mặt hàng lớn hơn");
		itemService.getItemSaleTopThreeByYear(2024).forEach(System.out::println);
	}
}
