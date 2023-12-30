package map;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import bean.Item;
import bean.Store;
public class Ex03MapIdeaOfOverlappingKeys {
	
	public static void main(String[] args) {
		// map gồm tập các phần tử --> hỗ trợ tìm kiếm các mặt hàng được bán trong cửa hàng nhanh hơn
		// k -> store
		// v -> items mà store đó đang bán
		
		// store1 --> item11, item12
		// store2 --> item21, item22, item23
		// store3 --> item31, item32, item33, item34
		// store4 --> item41
		
		Map<Store, List<Item>> storeItemsMap = new LinkedHashMap<>();
		
		// ----------------------------------------
		
		storeItemsMap.put(
				new Store(1, "Store 1"), 
				List.of(new Item(11, "Item 11", bd(11), 1, LocalDateTime.now()),
						new Item(12, "Item 12", bd(12), 1, LocalDateTime.now())));
		
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
		
		storeItemsMap.put(
				new Store(4, "Store 4"), 
				List.of(new Item(41, "Item 41", bd(41), 4, LocalDateTime.now())));
		
		// ----------------------------------------
		
		// khi put 1 entry mới vào map --> map.put(key, value)
		
		// kiểm tra
		// 1. hashcode của key có trùng với hashcode của keys nào bên trong map chưa
		// 2. key có equals với keys nào trong map chưa
		
		// nếu vừa trùng cả hashcode vừa equals --> báo key này đã trùng, tồn tại
		// ngược lại --> chưa trùng
		
		// hashcode(Object) --> mặc định = System.identityHashCode(object) --> địa chỉ ở HEAP của đối tượng
		// equals(Object) --> mặc định so sánh địa chỉ của 2 đối tượng dùng toán tử ==
		
		// hash = k.hashcode() --> hashcode mặc định là địa chỉ
		// if (p.hash == hash &&((k = p.key) == key || (key != null && key.equals(k))))
		
		// hashcode --> công thức để hashing giá trị của thuộc tính --> trả về int(dãy số)
		
		// hashing(abcdef) int = int hashing(ecbdfe)
		
		// equals
		
		// sau khi đã override --> 2 đối tượng mà equals thì phải có hashcode giống nhau
		
		storeItemsMap.put(
				new Store(3, "Store 3"),
				List.of(new Item(91, "Item 91", bd(91), 3, LocalDateTime.now()),
						new Item(92, "Item 92", bd(92), 3, LocalDateTime.now())));
		
		
		System.out.println("store items map: size = " + storeItemsMap.size() + "\n");
		
		printf(storeItemsMap);
	}
	
	private static void printf(Map<Store, List<Item>> storeItemsMap) {
		storeItemsMap.forEach((store, items) -> {
			var storeId = store.getId();
			var itemIds = new ArrayList<Integer>();
			for (var item: items) {
				itemIds.add(item.getId());
			}
			System.out.println(storeId + " --> " + itemIds);
		});
	}
	
	private static BigDecimal bd(Number number) {
		if (number == null) {
			return null;
		}
		return new BigDecimal(number.toString());
	}
}
