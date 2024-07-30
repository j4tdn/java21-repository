package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import static utils.IoUtils.*;

import java.util.Arrays;
import java.util.List;

import persistence.ItemGroup;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
//		itemGroupService.mergeP(new ItemGroup(null, "Loại hàng 12"));
		
//		var newGroups = List.of(ItemGroup.of("Loại hàng 13"), ItemGroup.of("Loại hàng 14"), ItemGroup.of("Loại hàng 15"));
//		
//		newGroups.forEach(g -> System.out.println(g));
//		itemGroupService.save(newGroups);
		
		itemGroupService.updateNGroups();
		
		generate(
				"1A. Liệt kê các loại hàng trong hệ thống",
				itemGroupService.getAllWithItems()
		);
		
		generate(
				"1B. Liệt kê các loại hàng theo mã loại (MaLH = 4)",
				Arrays.asList(itemGroupService.get(4))
		);
		
		generate(
				"1E. Liệt kê các loại hàng theo tên loại (TenLH = ****)", 
				Arrays.asList(itemGroupService.get("Áo"))
		);
	}
}
