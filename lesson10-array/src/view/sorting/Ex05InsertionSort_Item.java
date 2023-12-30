package view.sorting;

import bean.Item;
import functional.Compare_Item;
import static utils.ArrayUtils.*;
import model.DataModel;

public class Ex05InsertionSort_Item {
	public static void main(String[] args) {
		/*	 
		 Ideal Thuật toán insertion Sort:
		 
		 */
		Item[]  items = DataModel.mockItems();
		sort(items, (i1,i2) -> {;
		return i1.getStoreId().compareTo(i2.getStoreId());
		});
		generate("Sort Item by Id(ASC)", items);
		
	}
	private static void sort(Item[] items, Compare_Item compare) {
		for(int i = 1; i < items.length; i++) {
			for(int j = 0; j < i; j++) {
				if(compare.compare(items[j], items[i]) > 0) {
					swap(items, j, i);
				}
			}
		}
		
	}
}
