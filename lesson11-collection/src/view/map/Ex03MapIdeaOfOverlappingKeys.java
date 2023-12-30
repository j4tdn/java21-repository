package view.map;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Bean.Item;
import Bean.Store;

public class Ex03MapIdeaOfOverlappingKeys {

	public static void main(String[] args) {
		
		Map<Store, List<Item>> storeItemsMap = new HashMap<>();
		storeItemsMap.put(new Store(1, "store 1"), 
						  List.of(new Item(11, "Item 11", bd(11), 1, LocalDateTime.now()),
								  new Item(11, "Item 11", bd(11), 1, LocalDateTime.now())));
		
		storeItemsMap.put(
				new Store(2, "Store 2"),
				List.of(new Item(21, "Item 21", bd(21), 2, LocalDateTime.now()),
				new Item(22, "Item 22", bd(22), 2, LocalDateTime.now()),
				new Item(23, "Item 23", bd(23), 2, LocalDateTime.now())));
		
		storeItemsMap.put(
				new Store(3, "Store 3"), 
				List.of(new Item(31, "Item 31", bd(31), 3, LocalDateTime.now()),
				new Item(32, "Item 32", bd(32), 3, LocalDateTime.now()),
				new Item(33, "Item 33", bd(33), 3, LocalDateTime.now()),
				new Item(34, "Item 34", bd(34), 3, LocalDateTime.now())));
		
		storeItemsMap. put (
				new Store(4, "Store 4"),
				List.of(new Item(41, "Item 41", bd(41), 4, LocalDateTime.now())));
		
		storeItemsMap.put(
				new Store(3, "Store 3"),
				List.of(new Item(91, "Item 91", bd(91), 3, LocalDateTime.now()),
				new Item(92, "Item 92", bd(92), 3, LocalDateTime.now())));
		
		System.out.println("store items map size = "  + storeItemsMap.size() + "\n");
		
		printf(storeItemsMap);
	}
	
	private static void printf(Map<Store, List<Item>> storeItemMap) {
		storeItemMap.forEach((store, items) -> {
			var storedId = store.getId();
			var itemIds = new ArrayList<Integer>();
			for(var item: items) {
				itemIds.add(item.getId());
			}
			System.out.println(storedId + " --> " + itemIds);
		});
	}
	

	private static BigDecimal bd(Number number) {
		if(number == null) {
			return null;
		}
		return new BigDecimal(number.toString());
	}
	
}
