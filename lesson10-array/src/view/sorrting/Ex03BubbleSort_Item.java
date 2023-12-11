package view.sorrting;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import bean.Item;
import functional.Compare_Item;

public class Ex03BubbleSort_Item {
	public static void main(String[] args) {
			
		Item[] items = {
				new Item(11, "AItem 11", bd("22") , 1, dt("16/11/2023 15:12:22")),
				new Item(14, null, bd("21") , 1, dt("18/11/2023 16:12:22")),
				new Item(12, "CItem 12", bd("27") , 2, dt("03/11/2023 17:12:22")),
				new Item(13, "ZItem 13", bd("24") , 2, dt("22/11/2023 18:12:22")),
				new Item(16, "BItem 16", bd("23") , 1, dt("24/11/2023 11:12:22")),
				new Item(15, "FItem 15", bd("25") , 2, dt("17/11/2023 12:12:22"))
		};
		// Sort items by id - ascending
		sort(items, (i1,i2) ->{
			Integer id1 = i1.getId();
			Integer id2 = i2.getId();
			if(id1 > id2) return 1;
			return -1;
		});
		printItem(items);
		
		// Sort items by name - descending
		sort(items, (i1,i2) ->{
			
			String name1 = i1.getName();
			String name2 = i2.getName();
			if(name1 == null) return -1;
			if(name2 == null) return 1;
			if(name1.compareTo(name2)<0) return 1;
			return -1;
		});
		printItem(items);
		
		// Sort items store - ascending
		
		sort(items, (i1,i2) ->{
			Integer store1 = i1.getStoreId();
			Integer store2 = i2.getStoreId();
			if(store1.compareTo(store2)!=0) return store1.compareTo(store2);
			BigDecimal price1 = i1.getPrice();
			BigDecimal price2 = i2.getPrice();
			return price1.compareTo(price2);
		});
		printItem(items);
	}
	
	private static void sort(Item[] items , Compare_Item compareItem) {
		for(int i=0;i<items.length;i++) {
			for(int j=0;j<items.length-1-i;j++) {
				if(compareItem.compare(items[j], items[j+1])>0) {
					swap(items,j,j+1);
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
	
	private static void swap(Item[] elements, int i, int j) {
		Item temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}

	public static void printItem(Item[] arr) {
		for (Item employee : arr) {
			System.out.println(employee + " ");
		}
		System.out.println();
	}
}
