package view.map;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import bean.Item;
import bean.Store;

public class Ex03MapIdeaOfOverLappingKeys {
	public static void main(String[] args) {
		// lưu map gồm tập hợp các phần tử --> hỗ trợ tìm kiếm các mặt hàng được bán
		// trong cửa hàng nhanh hơn

		// k -> store
		// v -> items mà store đó đang bán

		// store1 --> item11, item12
		// store1 --> item21, item22, item23
		// store1 --> item31, item32, item33, item34
		// store1 --> item41

		Map<Store, List<Item>> storeItemsMap = new LinkedHashMap<>();

		// ---------------------------------------------------------------
		storeItemsMap.put(new Store(1, "Store 1"), List.of(new Item(11, "Item 11", bd(11), 1, LocalDateTime.now()),
				new Item(11, "Item 11", bd(11), 1, LocalDateTime.now())));

		storeItemsMap.put(new Store(2, "Store 2"),
				List.of(new Item(21, "Item 21", bd(11), 2, LocalDateTime.now()),
						new Item(22, "Item 22", bd(11), 2, LocalDateTime.now()),
						new Item(23, "Item 23", bd(11), 2, LocalDateTime.now())));

		storeItemsMap.put(new Store(3, "Store 3"),
				List.of(new Item(31, "Item 31", bd(11), 3, LocalDateTime.now()),
						new Item(32, "Item 32", bd(11), 3, LocalDateTime.now()),
						new Item(33, "Item 33", bd(11), 3, LocalDateTime.now()),
						new Item(34, "Item 34", bd(11), 3, LocalDateTime.now())));

		storeItemsMap.put(new Store(4, "Store 4"), List.of(new Item(44, "Item 44", bd(11), 4, LocalDateTime.now())));

		// ---------------------------------------------------------------

		// Khi put 1 entry mới vào map --> map.put(k, v)
		// kiểm tra
		// 1. hashcode của key có trùng với hashcode của keys nào bên trong map chưa
		// 2. kiểm tra key này có equals với keys nào trong map chưa
		
		// nếu vừa trùng cả hashcode vừa equals --> báo key này đã trùng, tồn tại
		// ngược lại --> chưa trùng
		
		// hashcode(Object) --? mặc định = System.identityHashCode(object) --> địa chỉ ở HEAP của đối tượng
		// equals(Object) --> mặc định so sánh địa chỉ của 2 đối tượng dùng toán tử == 
		
		
 		// điều kiện để kiểm tra
		// hash = k.hashcode() --> hashcode mặc định là địa chỉ
		// if(p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
		
		// hashcode --> công thức để hashing giá trị của thuộc tính --> trả về int(dãy số)
		
		
		storeItemsMap.put(new Store(3, "Store 3"), 
				List.of(new Item(91, "Item 31", bd(91), 3, LocalDateTime.now()),
				        new Item(92, "Item 34", bd(92), 3, LocalDateTime.now())));
 
		System.out.println("Store items map: size = " + storeItemsMap.size() + "\n");

		prinf(storeItemsMap);

	}

	private static void prinf(Map<Store, List<Item>> storeItemsMap) {
		storeItemsMap.forEach((store, items) -> {
			var storeId = store.getId();
			var itemIds = new ArrayList<Integer>();
			for (var item : items) {
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

