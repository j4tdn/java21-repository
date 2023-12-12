package view;

import static java.util.Comparator.comparing;

import java.math.BigDecimal;
import java.util.Arrays;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = mockItems();
		findMaxSalesPriceByStoreId(items);
		System.out.println(Arrays.toString(findMaxSalesPriceByStoreId(items)));

	}

	public static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}

	public static Item[] mockItems() {
		return new Item[] { new Item(1, 'A', bd("25"), 101), new Item(2, 'B', bd("90"), 102),
				new Item(3, 'C', bd("88"), 102), new Item(4, 'D', bd("40"), 101), new Item(5, 'E', bd("60"), 102),
				new Item(6, 'F', bd("18"), 101), };
	}

	public static Item[] findMaxSalesPriceByStoreId(Item[] items) {
		Arrays.sort(items, comparing(Item::getStoreId).thenComparing(Item::getSalesPrices));
		Item[] result = new Item[items.length];
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			if (i < (items.length - 1)) {
				if (items[i].getStoreId() != items[i + 1].getStoreId()) {
					result[count] = items[i - 1];
					count++;
				}
			} else {
				result[count] = items[i];
			}
		}

		return Arrays.copyOfRange(result, 0, count + 1);
	}
}
