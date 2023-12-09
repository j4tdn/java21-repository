package view.sorting;

import beam.Item;
import model.DataModel;
import static utils.ArraysUtils.*;
import utils.Compare_Item;

public class Ex05InsertionSort_Item {

	public static void main(String[] args) {
		Item[] items = DataModel.mockItem();
		
		// sort acsending for id
		sort(items, (i1,i2) -> {
			return i1.getStoreId().compareTo(i2.getStoreId());
		});
		
		generate("1. Sort items by storeID[asc]", items);
		
	}
	
	private static void sort(Item[] items, Compare_Item compareItem) {
		for(int i = 1; i < items.length; i++) {
			for(int j = 0; j < i; j++) {
				// item[j]: phan tu dung truoc
				// item[i]: phan tu dung sau
				if(compareItem.compare(items[j], items[i]) > 0) {
					swap(items, j, i);
				}
			}
		}
	}
}
