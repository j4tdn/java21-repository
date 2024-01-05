package view.list;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Item;
import functional.ItemCond;
import model.Datamodel;
import static utils.CollectionUtils.*;

public class Ex03AList_ObectType {

	public static void main(String[] args) {
		
		/*
		 Khi list.remove(object) thig
		 --> Duyet tung phan tu torng list
		 	--> kiểm tra nếu có phần tử napf 'equal' với object --> xóa
		 	--> Kiểm tra nếu không có phần tử nào equal với object --> xóa
		 	
		 	Nếu KDL của object chưa orivved
		 	
		 	--> Hoạt động tương tự với hàm list.contains(object)
		 */
		//demo add
		List<Item> items = Datamodel.mockItems();
		Item itemToBeRemove = new Item(12, "CItem 12", bd("27") , 2, dt("03/11/2023 17:12:22"));
		
		System.out.println("Is contains: "+ items.contains(itemToBeRemove));
		
		System.out.println(items.size());
		items.remove(itemToBeRemove);
		System.out.println(items.size());
		generate("1. Item ", items);
		
		// Xóa nhưng mặt hàng có storeId =1
		

//		removeItem(items,item -> item.getStoreId()==1 );
		items.removeIf(item -> item.getStoreId()==1 );
		items.forEach(item -> System.out.println(item));
		generate("2. Item ", items);
	}
	private static void removeItem(List<Item> items , ItemCond ic) {
		Iterator<Item> iterator1 =  items.iterator();  //-1
		while(iterator1.hasNext()) {
			Item item = iterator1.next();
			if(ic.test(item)) {
				iterator1.remove();
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


