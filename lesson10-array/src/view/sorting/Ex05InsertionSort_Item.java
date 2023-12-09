package view.sorting;

import Bean.Item;
import functional.Compare_Item;
import model.DataModel;

import static utils.ArrayUtils.*;

public class Ex05InsertionSort_Item {
	
	public static void main(String[] args) {
		Item[] items = DataModel.mockItem();
		
		// tăng dần theo id
		sort(items, (i1, i2) -> {
			return i1.getStoreId().compareTo(i2.getStoreId());
		});
		generate("1. Sort item by storeId[asc]", items);
	}
	
	private static void sort(Item[] items, Compare_Item compareItem) {
		for (int i = 1; i < items.length; i++) {
			for (int j = 0; j < i; j++) {
				if (compareItem.compare(items[j], items[i]) > 0) {
					swap(items, j, i);
				}
			}
		}
	}
}
