package view.sorting;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import bean.Item;
import functional.Compare_Item;

import static utils.ArrayUtils.*;

public class Ex03BubbleSort_Item {
	
	public static void main(String[] args) {
		Item[] items = {
			new Item(11, "Item 11", bd("22"), 1, dt("16/11/2023 15:12:22")),
			new Item(14, "ZItem 14", bd("77"), 1, dt("18/12/2023 16:12:22")),
			new Item(22, "AItem 22", bd("66"), 2, dt("22/08/2023 17:12:22")),
			new Item(21, "KItem 21", bd("18"), 2, dt("05/05/2023 18:12:22")),
			new Item(12, "Item 12", bd("99"), 1, dt("24/12/2023 12:12:22")),
			new Item(55, "Item 55", bd("55"), 5, dt("17/11/2023 11:12:22")),
		};
		
		sort(items, (i1, i2) -> {
			Integer id1 = i1.getId();
			Integer id2 = i2.getId();
			if (id1 > id2) {
				return 1;
			}
			return -1;
		});
		
		generate("1. Items(sort by id[asc])", items);
		
		sort(items, (i1, i2) -> {
			String name1 = i1.getName();
			String name2 = i2.getName();
			if (name1.compareTo(name2) < 0) {
				return 1; // hoán vị
			}
			return -1;
		});
		generate("2. Items(sort by name[desc])", items);
		
		
		sort(items, (i1, i2) -> {
			Integer store1 = i1.getStoreId();
			Integer store2 = i2.getStoreId();
			
			// compare by store id --> asc
			int storeIdCompare = store1.compareTo(store2);
			if (storeIdCompare != 0) {
				return storeIdCompare;
			}
			
			// compare by price id --> desc
			BigDecimal price1 = i1.getPrice();
			BigDecimal price2 = i2.getPrice();
			
			return price2.compareTo(price1);
			
		});
		generate("3. Items(sort by store[asc], price[desc])", items);
		
	}
	
	private static void sort(Item[] items, Compare_Item compareItem) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				if (compareItem.compare(items[j], items[j+1]) > 0) {
					swap(items, j, j+1);
				}
			}
		}
	}
	
	private static LocalDateTime dt(String value) {
		return LocalDateTime.parse(value, 
				DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
	
 	private static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
	
}
