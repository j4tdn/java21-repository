package view.sorting.available.method;

import bean.Item;
import model.DataModel;
import static utils.ArrayUtils.*;

import java.util.Arrays;

import static java.util.Comparator.*;

public class Ex03QuickSort_Item_SimpleCases {
	/*
	 Với những trường hợp đơn giản như
	  + sắp xếp tăng dần giảm dần theo 1 hoặc nhiều thuộc tính
	  + null first, last cho elements
	  --> Áp dựng sort có sẵn ngắn gọn hơn như bên dưới
	 
	 Với những trường hợp
	  + sắp xếp điều kiện if else phức tạp theo logic
	  + null first, last cho thuôc tính của elements
	  --> Arrays.sort(elements, (t1,t2) -> {...});
	 */
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
//		Arrays.sort(items, (i1, i2) -> {
//			return i1.getPrice().compareTo(i2.getPrice());
//		});
		
		Arrays.sort(items, comparing(Item::getPrice));
		generate("1. Sort items by price[asc]", items);
		
		items = DataModel.mockItems_NullValues();
		
		Arrays.sort(items, nullsLast(comparing(Item::getStoreId)   // [asc]
				.thenComparing(Item::getPrice, reverseOrder())));  // [desc]
		
		generate("2. Sort items by storeId[asc], price[desc]", items);
	}
}
