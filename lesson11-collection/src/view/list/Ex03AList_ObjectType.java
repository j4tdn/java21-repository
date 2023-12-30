package view.list;

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
		 * Demo CRUD methods with customer object type VD: Item, Employee
		 * 
		 * items.add(new Item(11, "Item 11", bd("22"), 1, dt("16/11/2023 15:12:22")));
		 * items.add(new Item(14, "ZItem 14", bd("77"), 1, dt("18/12/2023 16:12:22")));
		 * items.add(new Item(22, "AItem 22", bd("66"), 2, dt("22/08/2023 17:12:22")));
		 * items.add(new Item(21, "KItem 77", bd("18"), 2, dt("05/05/2023 18:12:22")));
		 * items.add(new Item(12, "Item 12", bd("99"), 1, dt("24/12/2023 12:12:22")));
		 * items.add(new Item(55, "Item 55", bd("55"), 5, dt("17/11/2023 11:12:22")));
		 * 
		 * // Khi list.remove(object) thì: --> duyệt từng phần tử trong list --> kiểm
		 * tra nếu có phần tử nào 'equals' với object --> xóa --> ko có phần tử nào
		 * 'equals' với object --> không xóa
		 * 
		 * Nếu KDL của object chưa override hàm equals từ class Object --> equals sẽ so
		 * sánh theo địa chỉ
		 * 
		 * Thường nếu KDL của mình tạo ra --> override lại hàm equals theo thuộc tính
		 * nào đó. <Best practice>
		 * 
		 * --> hoạt động tương tự với hàm list.contains(object)
		 */

		List<Item> items = DataModel.mockItems();
		Item itemToBeRemoved = new Item(22, "AItem 22", bd("66"), 2, dt("22/08/2023 17:12:22"));

		System.out.println("Does contain itemToBeRemoved: " + items.contains(itemToBeRemoved));

		System.out.println("items size before remove: " + items.size()); // 6

		items.remove(itemToBeRemoved);

		System.out.println("items size after remove: " + items.size()); // 5

		generate("1. Items", items);
		// items.forEach(item -> System.out.println(item)); --> in nhanh một list
		
		// Xóa những mặt hàng có storeId = 1
//		for (Item item : items) { // <-- error here
//			items.remove(items.get(3));
//			if (item.getStoreId() == 1) {
//				// System.out.println("Item with storeId = 1: " + item);
//				// ConcurrentModificationException
//				// Biến items[List] đang sử dụng(lock) bởi for loop thì ko được thao tác, xóa
//				// phần tử bên trong nó
//				items.remove(item);
//				System.out.println(">> Removed");
//				generate("2. Items", items);
//			}
//		}

		// Xóa những mặt hàng có storeId = 1
		// removeItemByStoreId(items);
		// removeItem(items, item -> item.getStoreId() == 1);
		items.removeIf(item -> item.getStoreId() == 1);
		generate("2. Items after remove which storeID = 1 ", items);

		// Xóa những mặt hàng có price > 30
		// removeItem(items, item -> item.getPrice().compareTo(bd("30")) > 0);
		items.removeIf(item -> item.getPrice().compareTo(bd("30")) > 0);
		generate("3. Items after remove which price > 30 ", items);

		// Xóa những mặt hàng có price < 20
		removeItem(items, item -> item.getPrice().compareTo(bd("20")) < 0);
		generate("4. Items after remove which price < 20 ", items);

	}
	
	
	private static void removeItem(List<Item> items, ItemCond ic) {
		Iterator<Item> iterator = items.iterator(); // Convert Item sang kiểu Iterator
		while (iterator.hasNext()) {
			Item item = iterator.next();
			if (ic.test(item)) {
				iterator.remove();
			}
		}
	}

	// item.getStoreId() == 1
	// item.getPrice().compareTo(bd("30")) > 0
	
	// --> boolean test(Item item)
	
	private static void removeItemByStoreId(List<Item> items) {
		Iterator<Item> iterator = items.iterator(); // Convert Item sang kiểu Iterator
		while (iterator.hasNext()) {
			Item item = iterator.next();
			if (item.getStoreId() == 1) {
				iterator.remove();
			}
		}
	}

	private static void removeItemBySalesPrice(List<Item> items) {
		Iterator<Item> iterator = items.iterator(); // Convert Item sang kiểu Iterator
		while (iterator.hasNext()) {
			Item item = iterator.next();
			if (item.getPrice().compareTo(bd("30")) > 0) {
				iterator.remove();
			}
		}
	}

	public static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}

	public static LocalDateTime dt(String value) {
		return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
}
