package view.list;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import bean.Item;
import functional.ItemCond;
import model.DataModel;

import static utils.CollectionUtils.*;

public class Ex03AList_ObjectType {
	
	public static void main(String[] args) {
		/*
		 Demo methods CRUD with customer object type
		 Ví dụ: Item, Employee
		 
		items.add(new Item(11, "Item 11", bd("22"), 1, dt("16/11/2023 15:12:22")));
		items.add(new Item(14, "ZItem 14", bd("77"), 1, dt("18/12/2023 16:12:22")));
		items.add(new Item(22, "AItem 22", bd("66"), 2, dt("22/08/2023 17:12:22")));
		items.add(new Item(21, "KItem 77", bd("18"), 2, dt("05/05/2023 18:12:22")));
		items.add(new Item(12, "Item 12", bd("99"), 1, dt("24/12/2023 12:12:22")));
		items.add(new Item(55, "Item 55", bd("55"), 5, dt("17/11/2023 11:12:22")));
		
		Khi list.remove(object) thì
		--> duyệt từng phần tử trong list
		    --> kiểm tra nếu có phần tử nào 'equals' với object  --> xóa
		    -->              ko có phần tử nào equals với object --> ko xóa
		    
		Nếu KDL của object chưa override hàm equals từ class Object --> equals sẽ so sánh theo địa chỉ
		
		Thường nếu KDL của mình tạo ra --> override lại hàm equals theo thuộc tính nào đó
		
		
		--> Hoạt động tương tự với hàm list.contains(object)
		*/
		
		// demo add
		List<Item> items = DataModel.mockItems();
		
		Item itemToBeRemoved = new Item(22, "AItem 22", bd("66"), 2, dt("22/08/2023 17:12:22"));
		
		System.out.println("Is contains: " + items.contains(itemToBeRemoved));
		
		System.out.println("items size before remove: " + items.size()); // 6
		
		items.remove(itemToBeRemoved);
		
		System.out.println("items size after remove: " + items.size() + "\n"); // 6 5 6
		
		generate("1. Items", items);
		
		
//		for (Item item: items) {
//			// items.remove(items.get(3));
//			if (item.getStoreId() ==  1) {
//				// System.out.println("item with store 1 --> " + item);
//				// ConcurrentModificationException
//				// Biến items[List] đang sử dụng(lock) bởi for thì ko được thao tác, xóa
//				// phần tử bên trong nó
//				items.remove(item);
//				System.out.println(">> removed <<");
//				generate("2. Items", items);
//			}
//		}
		
		// Xóa những mặt hàng có storeId = 1
		// removeItemsByStoreId(items);
		// removeItems(items, item -> item.getStoreId() == 1);
		items.removeIf(item -> item.getStoreId() == 1);
		generate("2. Items after removed(storeId = 1)", items);
		
		// Xóa những mặt hàng có price > 30
		
		// removeItemsBySalesPrice(items);
		removeItems(items, item -> item.getPrice().compareTo(bd("20")) < 0);
		items.removeIf(item -> item.getPrice().compareTo(bd("20")) < 0);
		generate("2. Items after removed(price < 20)", items);
		
		// Arrays.sort(Object[] objects)
		// Arrays.sort(T[] elements, Comparator<T> comparator)
		
		// Collections.sort(List<T> list)
		// Collections.sort(List<T> list, Comparator<T> comparator)
		
		// items.sort(Comparator<T> comparator)
	}
	
	private static void removeItems(List<Item> items, ItemCond ic) {
		Iterator<Item> iterator = items.iterator();
		while(iterator.hasNext()) {
			if (ic.test(iterator.next())) {
				iterator.remove();
			}
		}
	}
	
	// item.getStoreId() == 1
	// item.getPrice().compareTo(bd("30")) > 0
	
	// boolean test(Item item)
	
	private static void removeItemsByStoreId(List<Item> items) {
		Iterator<Item> iterator = items.iterator();
		while(iterator.hasNext()) {
			Item item = iterator.next();
			if (item.getStoreId() == 1) {
				iterator.remove();
			}
		}
	}
	
	private static void removeItemsBySalesPrice(List<Item> items) {
		Iterator<Item> iterator = items.iterator();
		while(iterator.hasNext()) {
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
		return LocalDateTime.parse(value, 
				DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
	
}
