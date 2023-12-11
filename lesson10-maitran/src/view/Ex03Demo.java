package view;

import java.util.Arrays;

import bean.Item;
import model.DataModel;

public class Ex03Demo {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();

		Item itemWithMaxPrice = Arrays.stream(items).max((i1, i2) -> i1.getSalesPrice().compareTo(i2.getSalesPrice()))
				.get();

		System.out.println("\nHighest price item: \n" + itemWithMaxPrice);
	}
}
