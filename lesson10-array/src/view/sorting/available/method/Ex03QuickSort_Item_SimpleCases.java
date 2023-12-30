 package view.sorting.available.method;
import static utils.ArraysUtils.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.function.Function;

import beam.Item;
import model.DataModel;
import static java.util.Comparator.*;
public class Ex03QuickSort_Item_SimpleCases {

	/*
	 Với những trường hợp đơn giản như
	 + sắp xếp tăng dần giảm dần theo 1 hoặc nhiều thuộc tính
	 + null first, last cho elements
	 --> Áp dụng sort có sẵn ngắn gọn hơn như bên dưới
	 --> Arrays.sort(elements, Comparator.comparing(...))
	 
	 Với những trường hợp
	 + sắp xếp điều kiện if else phức tạp theo logic
	 + null first, last cho thuộc tính cảu elemnets
	 -->  Arrays.sort(elements, (t1, t2) -> ...)
	 */
	
	public static void main(String[] args) {
		Item[] items = DataModel.mockItem();
		
		Arrays.sort(items, (c1, c2) -> c1.getPrice().compareTo(c2.getPrice()));
		
		//Function<T, R> function = (T t1) -> t1.getAttr(); --> lambda expression
		//Function<T, R> function = T::getAttr; --> method reference
		
		//Function<Item, BigDecimal> keyExtractor = item -> item.getPrice();
		//Function<Item, BigDecimal> keyExtractor = Item::getPrice;
	
		
		Arrays.sort(items, comparing(Item::getPrice));
		generate("1. Sort items by price", items);
		
		items = DataModel.mockItem_NullValues();
		
		Arrays.sort(items, 
				nullsFirst(comparing(Item::getStoreId) // storeId[asc]
						.thenComparing(Item::getPrice))// price[asc]
						//.thenComparing(Item::getCreateAt, reverseOrder())) // createdAt[desc]
				);
		generate("2. sort items by store, createdId[desc]", items);
	
		// sorting with Collator
	}
}
