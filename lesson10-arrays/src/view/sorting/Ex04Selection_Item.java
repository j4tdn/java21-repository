package view.sorting;

import bean.Item;
import functional.Compare_Item;
import model.DataModel;
import utils.ArrayUtils;

import static utils.ArrayUtils.*;

public class Ex04Selection_Item {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();

		// tăng dần theo id
		sort(items, (i1, i2) -> {
			return i1.getId().compareTo(i2.getId());
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
