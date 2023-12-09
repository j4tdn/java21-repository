package view.sorting.availabale.method;

import static utils.ArrayUtils.generate;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import model.DataModel;
import functional.Compare_Item;
public class Ex02QuickSort_Item {
	public static void main(String[] args) {

		Item[] items = DataModel.mockItems();

		Arrays.sort(items);

		generate("1. Sort items by price[asc]", items);
		Arrays.sort(items, new Comparator<Item>() {
			@Override
			public int compare(Item i1, Item i2) {
				return i1.getPrice().compareTo(i2.getPrice());
			}
		});
		generate("2. Sort items by price[asc]", items);
		/*
		Arrays.sort(items, (i1, i2) -> {
			Integer storeId1 = 
		}); */
		
		
		
		
	}
}
