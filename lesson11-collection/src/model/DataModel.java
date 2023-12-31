package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class DataModel {

	private DataModel() {
		
	}
	
	public static List<Item> mockItems() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(11, "Item 11", bd("22"), 1, dt("16/12/2022 15:12:22")));
		items.add(new Item(13, null, bd("23"), 2, dt("23/05/2023 18:14:52")));
		items.add(new Item(14, "Item 13", bd("28"), 1, dt("30/07/2023 11:22:12")));
		items.add(new Item(15, "Item 13", bd("27"), 3, dt("30/07/2023 11:22:12")));
		items.add(new Item(16, "Item 13", bd("332"), 2, dt("28/07/2023 11:22:12")));
		return items;
	}
	
	
	
	private static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
	private static LocalDateTime dt(String value) {
		return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
	
}
