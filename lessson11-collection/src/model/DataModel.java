package model;

import static utils.CollectionUtils.dt;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Item;

public class DataModel {
	
	private DataModel() {
	}
	
	public static List<Item> mockItems() {
		List<Item> items = new ArrayList<>();
		
				items.add(new Item(11, "Item 11", bd("22"), 1, dt("16/11/2023 15:12:22")));
				items.add(new Item(14, "Item 14", bd("77"), 2, dt("18/12/2023 16:12:22")));
				items.add(new Item(22, "Item 22", bd("66"), 1, dt("22/08/2023 17:12:22")));
				items.add(new Item(21, "Item 21", bd("18"), 1, dt("05/05/2023 18:12:22")));
				items.add(new Item(12, "Item 12", bd("99"), 1, dt("24/12/2023 12:12:22")));
				items.add(new Item(55, "Item 55", bd("55"), 1, dt("17/11/2023 11:12:22")));
		return items;
	}
	
	public static Item[] mockItems_NullValues() {
		return new Item[] {
				null,
				new Item(11, "Item 11", bd("22"), 1, dt("16/11/2023 15:12:22")),
				new Item(14, "Item 14", bd("77"), 2, dt("18/12/2023 16:12:22")),
				null,
				null,
				new Item(22, "Item 22", bd("66"), 1, dt("22/08/2023 17:12:22")),
				new Item(21, "Item 21", bd("18"), 1, dt("05/05/2023 18:12:22")),
				new Item(12, "Item 12", bd("99"), 1, dt("24/12/2023 12:12:22")),
				new Item(55, "Item 55", bd("55"), 1, dt("17/11/2023 11:12:22"))
		};
		
	}
	
	public static BigDecimal bd(String number) {
		return new BigDecimal(number);
	}
	
	public static void generate(String prefix, Item...elements) {
		System.out.println(prefix + " --> " + Arrays.toString(elements) + "\n");
	}
}
