package view.map;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;
import bean.Store;

public class Ex03MapIdeaOfOverlappingkeys {
	public static void main(String[] args) {
		//map bao gồm các phần tử --> hỗ trợ tìm kiếm các mặt hàng được bán trong cửa hàng nhanh hơn
		// k--> store
		// v-> items mà store đó đang bán
		
		// store1 --> item
		
		Map<Store, List<Item>> storeItemMap = new HashMap<>();
		storeItemMap.put(new Store(1, "Store1"), 
				List.of(new Item(11, "Item 11", bd(11), 1, LocalDateTime.now()),
						new Item(11, "Item 12", bd(12), 1, LocalDateTime.now())));
		
		storeItemMap.put(new Store(2, "Store2"), 
				List.of(new Item(21, "Item 11", bd(11), 1, LocalDateTime.now()),
						new Item(22, "Item 21", bd(12), 1, LocalDateTime.now()),
						new Item(23, "Item 23", bd(12), 1, LocalDateTime.now())));
		
		storeItemMap.put(new Store(3, "Store3"), 
				List.of(new Item(31, "Item 31", bd(11), 1, LocalDateTime.now()),
						new Item(32, "Item 32", bd(12), 1, LocalDateTime.now()),
						new Item(33, "Item 33", bd(12), 1, LocalDateTime.now()),
						new Item(34, "Item 61", bd(12), 1, LocalDateTime.now())));
		
		storeItemMap.put(new Store(4, "Store4"), 
				List.of(new Item(41, "Item 41", bd(11), 1, LocalDateTime.now())));
		
		System.out.println("store items map: size = " + storeItemMap.size());
		
		
	}
	
	private static void printf(Map<Store, List<Item>> storeItemMap) {
		storeItemMap.forEach((store, items)->{
			var storeId = store.getId();
			var itemIds = new ArrayList<Integer>();
			for (var item: items) {
				
			}
		});;
	}
	
	public static BigDecimal bd(Number number) {
		if (number == null) {
			return null;
		}
		return new BigDecimal(number.toString());
	}
}
