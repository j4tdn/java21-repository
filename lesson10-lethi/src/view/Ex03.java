package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import model.DataModel;

public class Ex03 {

	public static void main(String[] args) {
		
		Item[] items = DataModel.mockItems();
		
		Arrays.sort(items, Comparator.comparing(Item::getSalesPrice));
		
		Item maxPrice = items[items.length - 1];
		
		System.out.println("Highest price item: \n" + maxPrice);
		
	}
	
}
