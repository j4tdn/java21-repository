package view.list;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import Bean.Item;
import functional.ItemCond;
import model.DataModel;
import static utils.CollectionUtils.*;

public class Ex03List_ObjectType {
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
		List<Item> items = DataModel.mockItem();
		
		Item itemToBeRemove = new Item(22, "CItem", bd("66"), 2, dt("22/08/2023 17:12:22"));
		
		System.out.println("It contains: " + items.contains(itemToBeRemove));
		
		System.out.println("items size before remove: " + items.size());
		
		items.remove(itemToBeRemove);
		
		System.out.println("items size after remove: " + items.size() + "\n");
		
		generate("1. Items", items);
		
//		for (Item item: items) {
//			if (item.getStoreId() == 1) {
//				items.remove(item);
//			}
//		}
		
//		Iterator<Item> iterator = items.iterator();
//		while(iterator.hasNext()) {
//			Item item = iterator.next();
//			if (item.getStoreId() == 1) {
//				iterator.remove();
//			}
//		}
		
		// removeItems(items, item -> item.getStoreId() == 1);
		items.removeIf(item -> item.getStoreId() == 1);
		generate("2. Items after removed(storedId = 1)", items);
		
		// removeItems(items, item -> item.getPrice().compareTo(bd("30")) > 0);
		items.removeIf(item -> item.getPrice().compareTo(bd("30")) > 0);
		generate("3. Items after removed(price > 30)", items);
		
		items.forEach(item -> System.out.println("Use forEach to printf: " + item));
	}
	
	public static void removeItems(List<Item> items, ItemCond ic) {
		Iterator<Item> iterator = items.iterator();
		while(iterator.hasNext()) {
			Item item = iterator.next();
			if (ic.test(item)) {
				iterator.remove();
			}
		}
	}
	
	public static LocalDateTime dt(String value) {
		return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}

	public static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
}
