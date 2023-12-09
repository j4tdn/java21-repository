package view.sorting;

import static utils.ArrayUtils.generate;
import static utils.ArrayUtils.swap;

import bean.Item;
import functional.Compare_Item;
import model.DataModel;

public class Ex05InsertionSort_Item {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		sort(items, (i1, i2) -> {
			return i1.getStoreId().compareTo(i2.getStoreId());
		});
		generate("1. Sort items by id [asc] ", items);
		
	}
	
	private static void sort(Item[] items, Compare_Item compare_Item) {
		for(int i = 1; i < items.length; i++) {
			for(int j = 0; j < i; j++) {
				if(compare_Item.compare(items[j], items[i]) > 0) {
					swap(items, j, i);
				}
			}
		}
	
	}
}
