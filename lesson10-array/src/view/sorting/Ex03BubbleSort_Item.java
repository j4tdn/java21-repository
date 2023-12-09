package view.sorting;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import beam.Item;
import model.DataModel;
import utils.Compare_Item;
import static utils.ArraysUtils.*;

public class Ex03BubbleSort_Item {

	public static void main(String[] args) {
		
//		Item[] items = {
//				null,
//				new Item(11, "Item 11", bd("22"), 1, dt("16/11/2023 15:12:22")),
//				new Item(14, "Item 14", bd("77"), 1, dt("18/12/2023 16:12:22")),
//				new Item(22, "Item 33", bd("66"), 2, dt("22/08/2023 17:12:22")),
//				new Item(21, "Item 21", bd("18"), 2, dt("05/05/2023 18:12:22")),
//				new Item(12, null, bd("99"), 1, dt("24/12/2023 12:12:22")),
//				new Item(55, "Item 55", bd("55"), 5, dt("17/11/2023 11:12:22")),
//			};
		
		Item[] items = DataModel.mockItem_NullValues();
		
		// Sort items by id - ascending
		sort(items, (i1,i2) -> {
			
			if(i1 == null) {
				return -1;
			}
			if(i2 == null) {
				return 1;
			}
			
			Integer id1 = i1.getId();
			Integer id2 = i2.getId();
			return id1.compareTo(id2);
		});
		
		generate("1. Sort items by id - ascending: \n", items);
		
		// Sort items by name - name
		sort(items, (i1,i2) -> {
			
			// null first
			if(i1 == null) {
				return -1;
			}
			if(i2 == null) {
				return 1;
			}
			
			//null last for name
			if(i1.getName() == null) {
				return 1;
			}
			if(i2.getName() == null) {
				return -1;
			}
			
			
			return i1.getName().compareTo(i2.getName());
		});
		
		generate("2. Sort items by name - ascending: \n", items);
		
		// Sort items by firt storeid and last price
		sort(items, (i1, i2) -> {
			
			if(i1 == null) {
				return -1;
			}
			if(i2 == null) {
				return 1;
			}
			
			// compare by store
			int storeIdCompare = i1.getStoreId().compareTo(i2.getStoreId());
			if(storeIdCompare!= 0) {
				return storeIdCompare;
			}
			return i1.getPrice().compareTo(i2.getPrice());
		});
		
		generate("3.", items);
		
	}
	
	private static LocalDateTime dt(String value) {
		return LocalDateTime.parse(	value, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
	
	private static void sort(Item[] items, Compare_Item compareItem) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length-i-1; j++) {
				if(compareItem.compare(items[j], items[j+1]) > 0) {
					swap(items, j, j+1);
				}
			}
		}
	}
	
	private static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
}
