package view.sorting.available.method;

import bean.Item;
import model.DataModel;
import static utils.ArrayUtils.*;

import java.util.Arrays;

public class Ex03QuickSort_Item_SimpleCases {
	
	/*
	 Với những trường hợp đơn giản như
	 + Sắp xếp tăng dần, giảm dần theo 1 hoặc nhiều thuộct tính
	 + null first, last cho elements
	 --> Áp dụng sort có sẵn ngắn gọn 
	 */
	

	public static void main(String[] args) {
		
		Item[] items = DataModel.mockItems();
		
		Arrays.sort(items, (i1, i2) -> {
			return i1.getPrice().compareTo(i2.getPrice());
		});
		
		
		generate("1. Sort items by price[asc]", items);
	}
	
}
