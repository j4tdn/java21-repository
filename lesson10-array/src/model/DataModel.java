package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import bean.Item;

public class DataModel {

	private DataModel() {
		
	}
	
	public static Item[] mockItems() {
		return new Item[]{
				new Item(11, "Item 11", bd("22"), 1, dt("16/12/2022 15:12:22")),
				new Item(13, null, bd("23"), 1, dt("23/05/2023 18:14:52")),
				new Item(12, "Item 13", bd("24"), 1, dt("30/07/2023 11:22:12"))
		};
	}
	
	public static Item[] mockItems_NullValues() {
		return new Item[]{
				new Item(11, "Item 11", bd("22"), 1, dt("16/12/2022 15:12:22")),
				null,
				new Item(12, "Item 12", bd("23"), 1, dt("23/05/2023 18:14:52")),
				null,
				new Item(13, "Item 13", bd("24"), 1, dt("30/07/2023 11:22:12"))
		};
	}
	
	private static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
	private static LocalDateTime dt(String value) {
		return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
}
