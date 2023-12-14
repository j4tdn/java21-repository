package homework;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Comparator. *;
import java.util.List;

public class Ex03MaxPriceOfEachStore {
	public static void main(String[] args) {
		Item[] items = {
				new Item(1, "A", bd(25), "101"),
				new Item(2, "B", bd(90), "102"),
				new Item(3, "C", bd(88), "102"),
				new Item(4, "D", bd(40), "101"),
				new Item(5, "E", bd(60), "102"),
				new Item(6, "F", bd(18), "101")
		};
		Arrays.sort(items, comparing(Item::getStoreId).thenComparing(Item::getSalePrice, reverseOrder()));
		ArrayUtils.generate("Array items after sort by storeId (asc)", items);
		findMostPriceEachStore(items);
	}
	public static BigDecimal bd(double value) {
		return new BigDecimal(value);
	}
	public static void findMostPriceEachStore(Item[] items) {
		List<Item> itemsList = new ArrayList<>();
		List<String> uniqueStore = new ArrayList<>();
		for(Item item:items) {
			String storeId = item.getStoreId();
			if(!uniqueStore.contains(storeId)) {
				uniqueStore.add(storeId);
				itemsList.add(item);
			}
		}
		for(Item item:itemsList) {
			System.out.println("The most sale price of each store" + item);
		}
	}
	
}
