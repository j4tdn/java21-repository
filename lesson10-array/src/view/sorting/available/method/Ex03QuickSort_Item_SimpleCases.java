package view.sorting.available.method;

import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsFirst;
import static java.util.Comparator.reverseOrder;
import static utils.ArrayUtils.generate;

import java.util.Arrays;

import Bean.Item;
import model.DataModel;

public class Ex03QuickSort_Item_SimpleCases {

	public static void main(String[] args) {

		Item[] items = DataModel.mockItem();

		Arrays.sort(items, comparing(Item::getPrice) );

		generate("1. Sort item by price[asc]", items);
		
		items = DataModel.mockItem_NullValues();
		
		Arrays.sort(items, 
				nullsFirst(comparing(Item::getStoreId)
				.thenComparing(Item::getPrice, reverseOrder())));
		
		generate("2. Sort item by storeId[asc], createdAt[desc]", items);
		
		Arrays.sort(items, 
				nullsFirst(comparing(Item::getStoreId)
				.thenComparing(Item::getPrice, reverseOrder())
				.thenComparing(Item::getPrice)));
		
		generate("3. Sort item by storeId[asc], createdAt[desc]", items);
	}
}
