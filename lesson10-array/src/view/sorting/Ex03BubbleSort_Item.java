package view.sorting;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static utils.ArrayUtils. *;
import bean.Item;
import functional.Compare_Item;

public class Ex03BubbleSort_Item {
	public static void main(String[] args) {
		Item[] items = {
				new Item(11, "Item 11", bd("22"), 1, dt("16/12/2022 15:12:22")),
				new Item(12, null, bd("23"), 1, dt("23/05/2023 18:14:52")),
				new Item(13, "Item 13", bd("24"), 1, dt("30/07/2023 11:22:12"))
		};
		// Sort items by id
		sort(items, (i1, i2)->{
			Integer id1 = i1.getId();
			Integer id2 = i2.getId();
			if(id1 > id2) {
				return 1;
			}
			return -1;
		});
		generate("1.Items(sort by id[asc]", items);
		sort(items, (i1, i2)->{
			String id1 = i1.getName();
			String id2 = i2.getName();
			// null first
			if(id1 == null) {
				return -1;
			}
			if(id2 == null) {
				return 1;
			}		
			if(id1.compareTo(id2)>0) {
				return 1;
			}
			return -1;
		});
		generate("1. Items(sort by name[asc]", items);
		sort(items, (i1, i2)->{
			String id1 = i1.getName();
			String id2 = i2.getName();
			// null first
			if(id1 == null) {
				return 1;
			}	
			if(id1.compareTo(id2)>0) {
				return 1;
			}
			return -1;
		});
		generate("2. Items(sort by name[desc]", items);
			
		
			
		
	}
	
	private static void sort(Item[] items, Compare_Item compareItem) {
		for(int i=0; i<items.length; i++) {
			for(int j=0; j<items.length-i-1; j++) {
				if(compareItem.compare(items[j], items[j+1])>0) {
					swap(items, j, j+1);
				}
			}
		}
	}
	private static LocalDateTime dt(String value) {
		return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
	
	private static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
	public static void swap(Item[] items, int a, int b) {
		Item temp = items[a];
		items[a] = items[b];
		items[b] = temp;
	}
}
