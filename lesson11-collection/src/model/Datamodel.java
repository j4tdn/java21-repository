package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class Datamodel {
  
	private Datamodel() {
		
	}
	public static Item[] MockItems_NullValues(){
		return new Item[] {
				new Item(11, "AItem 11", bd("22") , 1, dt("16/11/2023 15:12:22")),
				new Item(14, null, bd("21") , 1, dt("18/11/2023 16:12:22")),
				new Item(12, "CItem 12", bd("27") , 2, dt("03/11/2023 17:12:22")),
				new Item(12, "ZItem 1ê", bd("24") , 2, dt("22/11/2023 18:12:22")),
				new Item(16, "BItem 16", bd("23") , 1, dt("24/11/2023 11:12:22")),
				new Item(15, "FItem 15", bd("25") , 2, dt("17/11/2023 12:12:22"))
		};
	}
	
	
	public static List<Item> mockItems(){
		List<Item> item = new ArrayList<>();

		item.add(new Item(11, "AItem 11", bd("22") , 1, dt("16/11/2023 15:12:22")));
		item.add(new Item(14, "DIeam 14", bd("21") , 1, dt("18/11/2023 16:12:22")));
		item.add(new Item(12, "CItem 12", bd("27") , 2, dt("03/11/2023 17:12:22")));
		item.add( new Item(13, "ZItem 13", bd("24") , 2, dt("22/11/2023 18:12:22")));
		item.add(new Item(16, "BItem 16", bd("23") , 1, dt("24/11/2023 11:12:22")));
		item.add(	new Item(15, "FItem 15", bd("25") , 2, dt("17/11/2023 12:12:22")));
		
		return item;
}

	
	private static BigDecimal bd(String value) {
		return new BigDecimal(value);
		}
	private static LocalDateTime dt(String value) {
		return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
}
