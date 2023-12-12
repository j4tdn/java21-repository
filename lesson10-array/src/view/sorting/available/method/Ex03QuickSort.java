package view.sorting.available.method;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import model.DataModel;
import utils.ArrayUtils;

import static java.util.Comparator. *;
public class Ex03QuickSort {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems_NullValues();
		// Function<Item, BigDecimal> keyExtractor = item -> item.getPrice();
		// Function<Item, BigDecimal> keystractor = Item::getPrice;
		// Function<T, R> function = t1 -> t1.getAttr(); --> lambda expression
		// Function<T, R> function = T::t1.getAttr();
		Arrays.sort(items, nullsLast(comparing(Item::getPrice)));
		ArrayUtils.generate("1. Sort by price [asc]", items);
		
		Arrays.sort(items, nullsFirst(comparing(Item::getStoreId).thenComparing(Item::getCreatedAt, reverseOrder())));
		ArrayUtils.generate("2. Sort by storeId [asc], createdAt[desc]", items);
		
	}
}
