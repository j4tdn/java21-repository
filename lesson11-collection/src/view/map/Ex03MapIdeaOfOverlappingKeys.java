package view.map;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import bean.Item;
import bean.Store;
import utils.CollectionUtils;

public class Ex03MapIdeaOfOverlappingKeys {
	public static void main(String[] args) {
		// map gồm tập các phần tử --> hỗ trợ tìm kiếm các mặt hàng được bán trong cửa hàng nhanh hơn
		// k -> store
		// v -> items mà store đó đang bán
		
		// store1 --> item11, item12
		// store2 --> item21, item22, item23
		// store3 --> item31, item32, item33, item34
		// store4 --> item41
		Map<Store, List<Item>> storeItemsMap = new HashMap<>();
		storeItemsMap.put(
						new Store(1, "store 1"), 
						List.of(new Item(11, "Item11", bd(11), 1, LocalDateTime.now()),
								new Item(12, "Item12", bd(12), 1, LocalDateTime.now())));
		
		storeItemsMap.put(
				new Store(2, "store 2"), 
				List.of(new Item(21, "Item21", bd(11), 2, LocalDateTime.now()),
						new Item(22, "Item22", bd(12), 2, LocalDateTime.now()),
						new Item(23, "Item23", bd(12), 2, LocalDateTime.now())));
		
		storeItemsMap.put(
				new Store(3, "store 3"), 
				List.of(new Item(31, "Item31", bd(11), 3, LocalDateTime.now()),
						new Item(32, "Item32", bd(12), 3, LocalDateTime.now()),
						new Item(33, "Item33", bd(12), 3, LocalDateTime.now()),
						new Item(34, "Item34", bd(12), 3, LocalDateTime.now())));
		
		storeItemsMap.put(
				new Store(4, "store 4"), 
				List.of(new Item(41, "Item11", bd(11), 4, LocalDateTime.now())
						));
		// Khi put 1 entry mới vào map --> put(k, v)
		// Kiểm tra
		// 1. hashcode của key có trùng với hashcode của key nào bên trong map chưa
		// 2. Kiểm tra key có equal với keys nào trong map chưa
		
		// Nếu vừa trùng cả hashcode vừa equals --> báo key này đã tồn tại
		// Ngược lại --> chưa trùng
		
		// hashcode(Object)  --> mặc định = System.identityHashCode(object) --> địa chỉ ở HEAP của đối tượng
		// equals(Object) --> mặc định so sánh địa chỉ của 2 đối tượng dùng toán tử ==
		
		// hashingcode --> công thức để hashing giá trị của thuộc tính --> trả về int(dãy số)
		
		// hashing(abcdef) int = int hashing(ecbdfe)
		
		// equals
		
		// sau khi đã override --> 2 đối tượng mà equals thì phải có hashcode giống nhau
		storeItemsMap.put(
				new Store(3, "store 3"), 
				List.of(new Item(91, "Item31", bd(11), 3, LocalDateTime.now()),
						new Item(92, "Item32", bd(12), 3, LocalDateTime.now())
						));
		
		printf(storeItemsMap);
//		CollectionUtils.generate("1. StoreItemsMap", storeItemsMap);
		
		System.out.println("store items map: size = " + storeItemsMap.size());
	}
	
	private static void printf(Map<Store, List<Item>> storeItemsMap) {
		storeItemsMap.forEach((store, items) -> {
			var storeId = store.getId();
			var itemsId = new ArrayList<Integer>();
			for(var item : items) {
				itemsId.add(item.getId());
			}
			System.out.println(storeId + " --> " + itemsId);
		});
	}
	
	private static BigDecimal bd(Number number) {
		if(number == null) {
			return null;
		}
		return new BigDecimal(number.toString());
	}
}
