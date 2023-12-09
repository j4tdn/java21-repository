package view.sorting;

import bean.Item;
import functional.Compare_Item;
import model.DataModel;
import static utils.ArrayUtils.*;

public class Ex04_SelectionSort_Item {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		sort(items, (i1, i2) -> {
			return i1.getId().compareTo(i2.getId());
		});
		generate("1. Sort items by id [asc] ", items);
		
	}
	
	private static void sort(Item[] items, Compare_Item compare_Item) {
		for(int i  = items.length -  1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				//item j là phần tử đứng trước, item i là phần tử đứng sau
				
				if(compare_Item.compare(items[j], items[i]) > 0) {
					swap(items, j, i);
				}
			}
		}
	
	}
}
