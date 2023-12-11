package view;

import java.math.BigDecimal;
import java.util.Arrays;
import static java.util.Comparator.*;

import beam.Item;

public class Ex03 {

	public static void main(String[] args) {
		Item[] items = mockData();
		System.out.println(Arrays.toString(mockData()));
		
		Arrays.sort(items, comparing(Item::getPrice));
		
		generate("sort by price[asc]", items);
		System.out.println("Select highest price of store: \n" + items[items.length-1]);
		
		
	}
	
	public static Item[] mockData() {
		return new Item[] {
			new Item(1, "A", bd("25"), 101),
			new Item(2, "B", bd("90"), 102),
			new Item(3, "C", bd("88"), 102),
			new Item(4, "D", bd("40"), 101),
			new Item(5, "E", bd("60"), 102),
			new Item(6, "F", bd("18"), 101),
		};
	}
	
	public static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
	
	public static void generate(String prefix, Item... elements) {
		System.out.println(prefix + " --> " + Arrays.toString(elements) + "\n");
	}
}
