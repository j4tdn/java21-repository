package view;

import java.util.Arrays;
import static java.util.Comparator.*;
import static java.util.Comparator.reverseOrder;

import Bean.Item;
import model.DataModel;

public class Ex03FindItemHighestSellingPrice {

	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();

		Item[] highestSalesPerStore = findHighestSalesPrice(items);

		for (Item item : highestSalesPerStore) {
			System.out.println("Store ID: " + item.getStoreId() + 
							   ", Name product: " + item.getName() + 
							   ", Sales Price: " + item.getSalesPrice());
		}
	}

	private static Item[] findHighestSalesPrice(Item[] items) {

		Arrays.sort(items, comparing(Item::getStoreId).thenComparing(Item::getSalesPrice, reverseOrder()));

		Item[] highestSalesPerStore = new Item[items.length];

		int count = 0;

		for (Item item : items) {
			if (count == 0 || item.getStoreId() != highestSalesPerStore[count - 1].getStoreId()) {
				// Nếu mặt hàng là đầu tiên của cửa hàng 
				highestSalesPerStore[count] = item;
				count++;
			}
		}

		return Arrays.copyOf(highestSalesPerStore, count);
	}
}
