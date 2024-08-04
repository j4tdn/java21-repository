package view;

import java.util.Arrays;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.IoUtils;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		itemGroupService.mergeP(new ItemGroup(16, "Loại hàng 167"));
		
		IoUtils.generate(
				"1A. Liệt kê các loại hàng trong hệ thống", 
				itemGroupService.getAll()
		);
		
		IoUtils.generate(
				"1B. Liệt kê các loại hàng theo mã loại(MaLH = 4)", 
				Arrays.asList(itemGroupService.get(4))
		);
		
		
	}
	
}