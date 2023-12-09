package view.sorting.available.method;

import static utils.ArrayUtils.generate;

import java.util.Arrays;
import java.util.Comparator;

import Bean.Item;
import model.DataModel;

public class Ex02QuickSort_Item {
	
	public static void main(String[] args) {
		
		Item[] items = DataModel.mockItem();
		
		// sort array of objects[Integer, Item....]
		
		/*
		 * Cách 1: Arrays.sort(Object[] a); 
		 * + Lúc compile a là mảng kiểu Object 
		 * -> lúc runtime có thể nhận vào bất kỳ KDL đối tương nào 
		 * + Để biết được mảng a sắp xếp tăng dần, giảm dần theo thuộc 
		 * Ví dụ: Item[] -> tăng dần id, giảm dần thêm name 
		 * 		  String -> tăng, giảm dần 
		 * Lúc runtime, kiểm tra KDL của mảng a truyền vào[Object] có phải là
		 * KDL con của interface Comparable <? > hay không 
		 * + 
		 * 
		 * Cách 2: Arrays.sort(T[] a, Comparator <? super T> c); 
		 */
		
		Arrays.sort(items);
		
		generate("1. Sort item by price[asc]", items);
		
		Arrays.sort(items, new Comparator<Item>() {
			@Override
			public int compare(Item i1, Item i2) {
				return i1.getPrice().compareTo(i2.getPrice());
			}
		});
		
		generate("2. Sort item by price[asc]", items);
		
		items = DataModel.mockItem_NullValues();
		
		Arrays.sort(items, (i1, i2) -> {
			// null last
			if (i1 == null) {
				return 1;
			}
			if (i2 == null) {
				return -1;
			}
			Integer store1 = i1.getStoreId();
			Integer store2 = i2.getStoreId();
			
			// compare by store id --> asc
			int storeIdCompare = store1.compareTo(store2);
			
			if (storeIdCompare != 0) {
				return storeIdCompare;
			}
			
			return i2.getCreatedAt().compareTo(i1.getCreatedAt());
		});
		
		generate("3. Sort item by storeId[asc], createAt[desc], null last", items);
	}
}
