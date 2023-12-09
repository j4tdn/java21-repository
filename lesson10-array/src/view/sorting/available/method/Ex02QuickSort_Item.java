package view.sorting.available.method;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import model.DataModel;
import static utils.ArrayUtils.*;

public class Ex02QuickSort_Item {

	public static void main(String[] args) {
//
		Item[] items = DataModel.mockItems();

		// sort array of objects[Integer, Double, Item ...]

		// Cách 1: Arrays.sort(Object[] a)
		/*
		 
		
		 
		 */
		Arrays.sort(items);

		generate("1. sort items by price [asc]", items);

		// cách 2: Arrays.sort(T[] a, Comparator<? super T> c);

		// T nếu nó có implements Conparable<?> thì nó vẫn ưu tiên Comparator

		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				return i1.getPrice().compareTo(i2.getPrice());
			}

		});
		generate("2. sort items by price [asc]", items);

		items = DataModel.mockItems_NullValues();

		Arrays.sort(items, (i1, i2) -> {
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

		generate("3. sort items by storedId[asc], createdAt[desc], null last", items);

	}

}
