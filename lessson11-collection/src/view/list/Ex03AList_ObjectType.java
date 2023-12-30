package view.list;

import static utils.CollectionUtils.dt;

import java.util.Iterator;
import java.util.List;

import bean.Item;
import functional.ItemCond;
import model.DataModel;
import static utils.CollectionUtils.*;

public class Ex03AList_ObjectType {
	public static void main(String[] args) {
		/*
		 
		 Demo methods CRUD with customer object type
		 ví dụ: Item, Employee
		 
		 Khi list.remove(obj) thì
		 --> duyệt từng phần tử trong list
		 	--> kiểm tra nếu có phần tử nào 'equals' với obj --> xóa
		 	--> 			 ko có phần tử nào equals với obj --> k xóa
		 
		 Nếu KDL của obj chưa override hàm equals từ class Obj --> equals sẽ so sánh theo địa chỉ
		 
		 Thường nếu KDL của mình tạo --> override lại hàm equals theo thuộc tính nào đó
		 
		 --> Hoạt động tưng tự với hàm list.contains(obj)
		 */
		
		List<Item> items = DataModel.mockItems();
		
		System.out.println(items.size());
		
		Item itemToBeRemoved = new Item(22, "Item 22", bd("66"), 1, dt("22/08/2023 17:12:22"));
		
		items.remove(itemToBeRemoved);
		
		System.out.println(items.size());
		
		generate("1. Items", items);
		
		// xóa những mặt hàng có storeId = 1
//		for (Item item : items) {
//			if(item.getStoreId() == 2) {
//				items.remove(item);
//			}
//		}
		Iterator<Item> iterator = items.iterator();
		while(iterator.hasNext()) {
			Item item = iterator.next();
			if(item.getStoreId() == 1) {
				iterator.remove();
			}
		}
		
		generate("2. Item after removed", items);
		
		Iterator<Item> iterator1 = items.iterator();
		while(iterator.hasNext()) {
			Item item = iterator.next();
			if(item.getPrice().compareTo(bd("30")) > 0) {
				iterator.remove();
			}
		}
	}
	
	private static void removeItems(List<Item> items, ItemCond ic) {
		Iterator<Item> iterator = items.iterator();
		while(iterator.hasNext()) {
			Item item = iterator.next();
			if(ic.test(item)) {
				iterator.remove();
			}
		}
	}
}
