package view.sorting;
import static utils.ArrayUtils.generate;

import bean.Item;
import functional.Compare_Item;
import model.DataModel;

public class Ex05InsertionSort_Item {
	

	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		sort(items, (i1, i2) -> {
			return i1.getStoreId().compareTo(i2.getStoreId());
		});
		generate("1. Sort items by store[desc]", items);
	}

	private static void sort(Item[] items, Compare_Item compareItem) {
		for (int i = 1; i < items.length; i++) {
			Item temp = items[i]; // round
			int j = i - 1;
			// shift right
			while(j >= 0 && compareItem.compare(items[j], items[i]) > 0) {
				items[j+1] = items[j];
				j--;
			}
			items[j+1] = temp;
		}
	}
}
