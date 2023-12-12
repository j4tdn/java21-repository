package view.sorting;

import bean.Item;
import functional.Compare_Item;
import model.DataModel;
import utils.ArrayUtils;

public class Ex05InsertionSort_Item {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems_NullValues();
		// asc follow id
		sort(items, (i1, i2)->{
			// null first
			if(i1 == null) {
				return -1;
			}
			if(i2 == null) {
				return 1;
			}
			if(i1.getStoreId().compareTo(i2.getStoreId())>0) {
				return 1;
			}
			return -1;
		});
		ArrayUtils.generate("1. Sort items by store[asc]", items);
	}
	private static void sort(Item[] items, Compare_Item compareItem) {
		for(int i=1; i < items.length; i++) {
			for(int j = 0; j < i; j++) {
				if(compareItem.compare(items[j], items[i])>0) {
					ArrayUtils.swap(items, i, j);
				}
			}
		}
	}
}
