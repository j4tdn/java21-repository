package view.sorting.avaiable.method;

import java.util.Arrays;

import bean.Item;
import model.DataModel;
import static java.util.Comparator.*;
import static utils.ArrayUtils.*;

public class Ex03QuickSort_Item_SimpleCases {
	
	/*
	 Với những trường hợp đơn giản như: 
	 + Sắp xếp tăng dần, giảm dần theo 1 hoặc nhiều thuộc tính 
	 + Null First, Null Last cho Element
	 
	 
	 Với những trường hợp 
	 + Với những trường hợp sắp xếp if else phức tạp theo logic
	 + Null First, Null Last cho thuộc tính của Element
	 */
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		// Arrays.sort(items, (c1, c2) -> c1.getPrice().compareTo.(c2.getPrice()));
		
		// Function<T, R> function = (T t1) -> c1.getAttribute(); --> lambda expression
		
		// Function<T, R> function = T::getAtribute;              --> method reference
		
		
		
		
		 // Arrays.sort(items, (i1, i2)->{
		//  return i1.getPrice().compareTo(i2.getPrice());
	   //   Cách viết trên có thể viết thay thế bằng cách sử dụng comparing như bên dưới
	  //});
		
	//      Arrays.sort(items, comparing(Item -> Item.getPrice())); hoặc viết ngắn gọn hơn nữa là: 
		
		Arrays.sort(items, comparing(Item::getPrice));
		generate("1.Sort Item by price[asc]", items);
		
		items = DataModel.mockItems_NullValues();
		
		Arrays.sort(items, nullsLast(comparing(Item::getStoreId).thenComparing(Item::getCreatedAt, reverseOrder())));
		generate("2.Sort Item by StoreID[asc], creatAt[desc]", items);
	}
}
