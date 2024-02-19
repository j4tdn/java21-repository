package model;

import java.math.BigDecimal;
import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static utils.NumberUtils.*;

import bean.Item;
import bean.Store;

public class DataModel {
	
	private DataModel() {
	}
	
	public static List<Store> mockStoresOfRefItemA55() {
		var itemA55 = new Item(55, "Item A55");
		return List.of(
			new Store(itemA55, 1, "Store 1", bd(21.9), 2),
			new Store(itemA55, 2, "Store 2", bd(66.885), 1),
			new Store(itemA55, 3, "Store 3", bd(10.5), 1),
			new Store(itemA55, 4, "Store 4", bd(36.4), 1),
			new Store(itemA55, 5, "Store 5", bd(14), 1),
			new Store(itemA55, 6, "Store 6", bd(65.52), 1),
			new Store(itemA55, 7, "Store 7", bd(17.9), 1),
			new Store(itemA55, 8, "Store 8", bd(26.7), 2),
			new Store(itemA55, 9, "Store 9", bd(54.9), 2),
			new Store(itemA55, 10, "Store 10", bd(35), 2),
			new Store(itemA55, 11, "Store 11", bd(22.7), 3),
			new Store(itemA55, 12, "Store 12", bd(1), 3),
			new Store(itemA55, 13, "Store 13", bd(19.1), 3),
			new Store(itemA55, 14, "Store 14", bd(19.4), 3)
		);
	}
	
	public static List<Store> mockStoresOfRefItemA77() {
		var itemA77 = new Item(77, "Item A77");
		return List.of(
			new Store(itemA77, 1, "Store 1", bd(22.024), 2),
			new Store(itemA77, 2, "Store 2", bd(150.777), 1),
			new Store(itemA77, 3, "Store 3", bd(33.4), 1),
			new Store(itemA77, 4, "Store 4", bd(23.4), 1),
			new Store(itemA77, 5, "Store 5", bd(26.289), 1),
			new Store(itemA77, 6, "Store 6", bd(22.2), 1),
			new Store(itemA77, 7, "Store 7", bd(23.6), 2),
			new Store(itemA77, 8, "Store 8", bd(21.9), 2),
			new Store(itemA77, 9, "Store 9", bd(20.74), 2),
			new Store(itemA77, 10, "Store 10", bd(0), 2),
			new Store(itemA77, 11, "Store 11", bd(26.612), 3),
			new Store(itemA77, 12, "Store 12", bd(0), 3),
			new Store(itemA77, 13, "Store 13", bd(32.1), 3),
			new Store(itemA77, 14, "Store 14", bd(22.5), 3)
		);
	}
	
	public static Map<Integer, Integer> mockRefStores() {
		return Map.of(
			7, 3,
			10, 1
		);
	}
	
	public static Map<Integer, BigDecimal> mockRefWeights() {
		return Map.of(
			55, bd(2.5),
			77, bd(1.5)
		);
	}
	
	public static Map<Integer, BigDecimal> mockStoreTrendFactors() {
		final Map<Integer, BigDecimal> map = new LinkedHashMap<>();
		map.put(1, bd(1));
		map.put(2, bd(1.2));
		map.put(3, bd(1));
		map.put(4, bd(1));
		map.put(5, bd(1));
		map.put(6, bd(1));
		map.put(7, bd(1.5));
		map.put(8, bd(1));
		map.put(9, bd(1));
		map.put(10, bd(1));
		map.put(11, bd(0.9));
		map.put(12, bd(0.7));
		map.put(13, bd(1));
		map.put(14, bd(1));
		return map;
	}
	
}