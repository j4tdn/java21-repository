package view.list;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import static utils.CollectionUtils. *;

import bean.Item;
import functional.ItemCondition;
import model.DataModel;

public class Ex03List_ObjectType {
	public static void main(String[] args) {
		/*
		 Demo methods CRUD with customer object type
		 Ví dụ: Item, Employee
		 
		 khi list.remove(object) thì -->
		 	-->Duyệt từng phẩn tử trng list
		 		--> Kiểm tra nếu có phần tử nào 'equals' với object --> xóa
		 		--> 			 ko có phẩn tử nào equals với object --> không xóa
		 		
		 Nếu kiểu dữ liệu của object chưa override hàm equals từ class Object --> equals sẽ so sánh theo địa chỉ
		 	
		 	Thường nếu KDL của mình tạo ra --> override lại hàm equals theo thuộc tính nào đó
		 */
		
		
		 
		// Demo add
		List<Item> items = DataModel.mockItems();
		Item itemToBeRemoved = new Item(13, null, bd("23"), 1, dt("23/05/2023 18:14:52"));
		
		System.out.println("items size before remove: " + items.size());
		
		items.remove(itemToBeRemoved);
		
		System.out.println("items size after remove: " + items.size()); 
		
		generate("1. Items", items);
		
		// Xóa những mặt hàng có storeId = 1
//		for(int i=0; i < items.size(); i++) {
//			if(items.get(i).getStoreId().equals(1)) {
//				items.remove(items.get(i));
//			}
//		}
		items.removeIf(item->item.getStoreId()==1);
		generate("2. Items after remove(storeId = 1)", items);
		items.removeIf(item->item.getPrice().compareTo(bd("30"))>0);
		generate("2. Items after remove(saleprice > 30)", items);
		items.forEach(null);
	}
	
	private static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
	private static LocalDateTime dt(String value) {
		return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
	public static void removeItems(List<Item> items, ItemCondition test ) {
		Iterator<Item> iterator = items.iterator();
		while(iterator.hasNext()) {
			Item item = iterator.next();
			if(test.test(item)) {
				iterator.remove();
			}
		}
	}
}
