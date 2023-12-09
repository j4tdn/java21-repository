package view.sorting.available.method;
import static utils.ArrayUtils.*;

import java.util.Arrays;
import static java.util.Comparator.*;
import bean.Item;
import model.DataModel;

public class Ex03QuickSort_Item_SimpleCases {
	
	public static void main(String[] args) {
	
		Item[] items = DataModel.mockItems();
		
//		Arrays.sort(items, (i1, i2) -> {
//			return i1.getPrice().compareTo(i2.getPrice());
//		});
		
		
//		Arrays.sort(items, (c1, c2) -> c1.getPrice().compareTo(c2.getPrice()));
	
//		Function<T, R> function = (T t1) -> t1.getAttr(); --> lambda expression;
//		Function<T, R> function = T::getAttr;             --> method reference

//		Function<Item, BigDecimal> keyExtractor = item -> item.getPrice();
//		Function<Item, BigDecimal> keyExtractor = Item::getPrice;
		
		Arrays.sort(items, comparing(Item::getPrice));
		generate("1. Sort items by price[asc]", items);
		
		
		items = DataModel.mockItems_NullValues();
		
		Arrays.sort(items, nullsLast(comparing(Item::getStoreId)
//				.thenComparing(Item::getPrice)) //price[asc]
				.thenComparing(Item::getCreatedAt, reverseOrder())) //createdAt[desc]
				);
		generate("2. Sort items by storeId[asc], createdAt[desc]", items);
	}
}
