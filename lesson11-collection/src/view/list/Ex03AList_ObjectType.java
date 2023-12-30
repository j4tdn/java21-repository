package view.list;

import java.awt.Image;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import bean.Item;
import functional.ItemCond;
import model.DataModel;
import static utils.CollectionUtils.*;

public class Ex03AList_ObjectType {

	public static void main(String[] args) {
		/*
		 * Demo methods CRUD with custome object type Ví dụ: Item, Employee
		 * 
		 * 
		 * items.add(new Item(11, "Item 11", bd("22"), 1, dt("16/11/2023 15:12:22")));
		 * items.add(new Item(14, "ZItem 14", bd("77"), 1, dt("18/12/2023 16:12:22")));
		 * items.add(new Item(22, "AItem 22", bd("66"), 2, dt("22/08/2023 17:12:22")));
		 * items.add(new Item(21, "KItem 21", bd("18"), 2, dt("05/05/2023 18:12:22")));
		 * items.add(new Item(12, "Item 12", bd("99"), 1, dt("24/12/2023 12:12:22")));
		 * items.add(new Item(55, "Item 55", bd("55"), 5, dt("17/11/2023 11:12:22")));
		 * 
		 * Khi list.remove(object) thì : --> duyệt từng phần tử trong list --> Kiếm tra
		 * nếu có phần tử nào 'equals' với object --> xóa --> ko có phần tử nào equals
		 * với object --> ko xóa
		 * 
		 * Nếu KDL của object chưa override hàm equals từ class object --> equals sẽ so
		 * sánh theo địa chỉ
		 * 
		 * Thường nếu KDL của mình tạo ra --> override lại hàm equals theo thuộc tính
		 * nào đó
		 * 
		 * 
		 * --> Hoạt động tương tự với hàm list.contains(object)
		 * 
		 */

		List<Item> items = DataModel.mockItems();

		Item itemTobeRemoved = new Item(22, "AItem 22", bd("66"), 2, dt("22/08/2023 17:12:22"));

		System.out.println("Is contains: " + items.contains(itemTobeRemoved));

		System.out.println("Item size before remove: " + items.size());

		items.remove(itemTobeRemoved);

		System.out.println("Item size after remove: " + items.size() + "\n");

		generate("1. Items", items);

//		for(Item item: items) {
//			if(item.getStoreId() == 1) {
//				System.out.println("Item with store 1 --> " + item);
//				// Biến items[List] đang sử dụng (lock) bởi for thì không được thao tác, xóa
//				// phần tử bên trong nó
//				items.remove(item);
//				System.out.println(">> removed <<");
//				generate("2. Items", items);
//			}
//		}

		// Xóa những mặt hàng có storeId = 1
        //	removeItemsByStoreId(items);
		
//		removeItems(items, (item) ->  { 
//			return item.getStoreId() == 1;
//		});
		
		//nếu lamda có 1 dòng như trên thì bỏ return 
		removeItems(items, item -> item.getStoreId() == 1 );
		generate("2. Items after removed", items);

		// Xóa những mặt hàng có price > 30
//		removeItemsBySalesPrice(items);
		removeItems(items, item -> item.getPrice().compareTo(bd("30")) > 0);
		generate("2. Items after removed (price > 30)", items);

	}

	private static void removeItemsByStoreId(List<Item> items) {
		Iterator<Item> iterator = items.iterator();
		while (iterator.hasNext()) {
			Item item = iterator.next();
			if (item.getStoreId() == 1) {
				iterator.remove();
			}
		}
	}

	private static void removeItemsBySalesPrice(List<Item> items) {
		Iterator<Item> iterator = items.iterator();
		while (iterator.hasNext()) {
			Item item = iterator.next();
			if (item.getPrice().compareTo(bd("30")) > 0) {
				iterator.remove();
			}
		}

	}
	
	//boolean test(Item item);
	
	private static void removeItems(List<Item> items, ItemCond ic) {
		Iterator<Item> iterator = items.iterator();
		while (iterator.hasNext()) {
			Item item = iterator.next();
			if(ic.test(item)) {
				iterator.remove();
			}
			
			
		}

	}

	private static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}

	private static LocalDateTime dt(String value) {
		return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
}
