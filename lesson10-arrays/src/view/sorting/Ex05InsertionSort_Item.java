package view.sorting;

import static utils.ArrayUtils.generate;

import bean.Item;
import functional.Compare_Item;
import model.DataModel;
import utils.ArrayUtils;

public class Ex05InsertionSort_Item {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();

		
		sort(items, (i1, i2) -> {
			return i1.getStoredId().compareTo(i2.getStoredId());
		});
		generate("1. Sort items id[asc]", items);
	}

	private static void sort(Item[] items, Compare_Item compare_Item) {
		for (int i = items.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (compare_Item.compare(items[j], items[i]) > 0) {
					ArrayUtils.swap(items, j, i);
				}
			}
		}
	}
}
