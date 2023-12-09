package view.sorting.available.method;

import bean.Item;
import model.DataModel;

import static utils.ArrayUtils.*;

import static java.util.Comparator.*;

import java.util.Arrays;

public class Ex03QuickSort_Item_SimpleCases {

	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		Arrays.sort(items,, comparing(Item::getPrice));
		generate("1. Sort items by price[asc]", items);
		
		items = DataModel.mockItems_NullValues();
		Arrays.sort(items,
				nullsLast(comparing(Item::getStoreId))
				.thenComparing(Item::getPrice)
				);
		
		generate("2. Sort items by storeId[asc], createAt[desc]", items);
	}
	
}
