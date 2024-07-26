package view;

import java.util.Arrays;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.IoUtils;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		// itemGroupService.mergeP(new ItemGroup(16, "Loại hàng 167"));
		
		// var newGroups = List.of(ItemGroup.of("Loại hàng 18"), ItemGroup.of("Loại hàng 19"), ItemGroup.of("Loại hàng 20"));
		// itemGroupService.save(newGroups);
		
		IoUtils.generate(
				"1A. Liệt kê các loại hàng trong hệ thống", 
				itemGroupService.getAllWithItems()
		);
		
		IoUtils.generate(
				"1B. Liệt kê các loại hàng theo mã loại(MaLH = 4)", 
				Arrays.asList(itemGroupService.get(4))
		);
		
		IoUtils.generate(
				"1E. Liệt kê các loại hàng theo tên loại(TenLH = ***)", 
				Arrays.asList(itemGroupService.get("Dép"))
		);
		
		IoUtils.generate(
				"2. Đếm số lượng các mặt hàng của từng loại hàng",
				itemGroupService.getItemGroupDetails()
		);
		
		
	}
	
}
