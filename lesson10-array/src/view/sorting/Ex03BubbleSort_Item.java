package view.sorting;

import static utils.ArrayUtils.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import bean.Item;
import functional.Compare_Item;

public class Ex03BubbleSort_Item {

	public static void main(String[] args) {
		Item[] items = {
			new Item(11, "item B11", bd("17"), 1, dt("28/11/2023 11:22:33")),
			new Item(14, "item Y14", bd("18"), 1, dt("18/01/2023 11:22:33")),
			new Item(21, "item V21", bd("13"), 2, dt("20/11/2023 14:22:33")),
			new Item(19, "item H19", bd("15"), 2, dt("02/10/2023 21:22:33")),
			new Item(1, "item A1", bd("16"), 1, dt("08/11/2023 08:22:33")),
			new Item(32, "item S32", bd("17"), 5, dt("21/11/2023 10:22:33"))			
		};
		
		// Sort items by id - ascending
		sort(items, (i1, i2) -> i1.getId() - i2.getId());
		generate("1. Items(sort by id[asc])", items);
		
		// Sort items by id - descending
		sort(items, (i1, i2) -> i2.getName().compareTo(i1.getName()));
		generate("2. Items(sort by name[desc])", items);
		
		// Sort items by storeId - ascending -> price - descending
		sort(items, (i1, i2) -> {
			Integer price1 = i1.getStoreId();
			Integer price2 = i2.getStoreId();
			
			if (price1.compareTo(price2) != 0)
				return price1.compareTo(price2);
			return i2.getPrice().compareTo(i1.getPrice());
		});
		generate("3. Items(sort by storeId[asc] -> price[desc])", items);
	}
	
	private static void sort(Item[] items, Compare_Item compareItem) {
		for (int i = 0; i < items.length; i++)
			for (int j = 0; j < items.length - i - 1; j++)
				if (compareItem.compare(items[j], items[j+1]) > 0)
					swap(items, j, j+1);
	}
	
	private static LocalDateTime dt(String value) {
		return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
	
	private static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
}
