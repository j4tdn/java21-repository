package model;

import bean.Item;

public class DataModel {

	private DataModel() {
	}
	
	public static Item[] mockItems_NullValues() {
		Item[] items = {
				new Item(11, "Item 11", bd("22"), 1, dt("16/11/2023 15:12:22")),
				new Item(14, "ZItem 14", bd("77"), 1, dt("18/12/2023 16:12:22")),
				new Item(22, "AItem 22", bd("66"), 2, dt("22/08/2023 17:12:22")),
				new Item(21, "KItem 21", bd("18"), 2, dt("05/05/2023 18:12:22")),
				new Item(12, "Item 12", bd("99"), 1, dt("24/12/2023 12:12:22")),
				new Item(55, "Item 55", bd("55"), 5, dt("17/11/2023 11:12:22")),
			};
	}
	
	public static Item[] mockItems() {
		Item[] items = {
				null,
				new Item(11, "Item 11", bd("22"), 1, dt("16/11/2023 15:12:22")),
				new Item(14, "ZItem 14", bd("77"), 1, dt("18/12/2023 16:12:22")),
				new Item(22, "AItem 22", bd("66"), 2, dt("22/08/2023 17:12:22")),
				null,
				new Item(21, "KItem 21", bd("18"), 2, dt("05/05/2023 18:12:22")),
				new Item(12, "Item 12", bd("99"), 1, dt("24/12/2023 12:12:22")),
				null,
				new Item(55, "Item 55", bd("55"), 5, dt("17/11/2023 11:12:22")),
			};
	}
}
