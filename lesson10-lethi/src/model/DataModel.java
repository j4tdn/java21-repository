package model;

import java.math.BigDecimal;

import bean.Item;

public class DataModel {
	
	private DataModel() {
	}

	public static Item[] mockItems() {
		return new Item[] {
			new Item( 1, "A", bd("25"), 101),
	        new Item(-2, "B", bd("90"), 102),
	        new Item( 3, "C", bd("88"), 102),
	        new Item(-4, "D", bd("40"), 101),
	        new Item( 5, "E", bd("60"), 102),
	        new Item( 6, "F", bd("18"), 101),
		};
	}
	
	private static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
	
}
