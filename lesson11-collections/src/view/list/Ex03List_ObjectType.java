package view.list;

import static utils.CollectionUtils.generate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import bean.Item;
import funtional.ItemCond;
import model.DataModel;

public class Ex03List_ObjectType {
	public static void main(String[] args) {
		/*
		 * demo crud with customer
		 * 
		 * 
		 * 
		 * Khi list.remove(Object) thì --> duyệt từng phần tử trong list --> kiểm tra
		 * nếu có phần tưt nào 'equal' với object --> xóa --> k có phần tử nào quals với
		 * object --> kh xóa
		 * 
		 * Nếu KDL của object chưa override hàm equals từ class object --> equals sẽ so
		 * sánh theo object Thường
		 * 
		 */

		List<Item> items = DataModel.mockItems();

		Item itemToBeRemoved = new Item(11, "Item 11", bd("22"), 1, dt("16/11/2023 15:12:22"));

		System.out.println();

		System.out.println("items size before" + items.size());

		items.remove(itemToBeRemoved);

		System.out.println("items size after" + items.size());
		generate("Item", items);

		// Xoá những mặt hàng có storeId =
//		for (Item item: items) {
//			if (item.getStoredId() == 1) {
//				//items.remove(item);
//				System.out.println(item);
//				
//			}
//		}
		removeItems(items, item -> item.getPrice().compareTo(bd("20")) < 0);
		items.removeIf(item -> item.getPrice().compareTo(bd("20")) < 0);
		generate("items after", items);

		

	}

	public static void removeItems(List<Item> items, ItemCond ic) {
		Iterator<Item> iterator = items.iterator();
		while (iterator.hasNext()) {
			Item item = iterator.next();
			if (item.getStoredId() == 1) {
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
