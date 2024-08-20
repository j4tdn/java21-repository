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
		// itemGroupService.mergeP(new ItemGroup(21 , "Loại hàng 21"));
		
//		var newGroups = List.of(ItemGroup.of("Loại Hàng 22"), ItemGroup.of("Loại Hàng 23"), ItemGroup.of("Loại Hàng 24"));
//		itemGroupService.save(newGroups);
		
		itemGroupService.updateNGroups();
		
		System.out.println("==================================");
		
		IoUtils.generate("1A. Liệt kê các loại hàng trong hệ thống", 
				itemGroupService.getAllWithItems());
		
		IoUtils.generate("1B. Liệt kê các loại hàng theo mã loại", 
				Arrays.asList(itemGroupService.get(4)));
		
		IoUtils.generate("1E. Liệt kê các loại hàng theo tên loại(TenLH = Áo)", 
				Arrays.asList(itemGroupService.get("Dép")));
		
		IoUtils.generate("2. Đếm số lượng của các mặt hàng của từng loại hàng", 
				itemGroupService.getItemGroupDetails());
	}
	
}
