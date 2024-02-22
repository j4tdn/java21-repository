package view.stream;

import static java.util.Comparator. *;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale.Category;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

import bean.Dish;
import common.Kind;
import model.Datamodel;
import static utils.StreamUtils. *;

public class Ex01StreamBasicDemo {
	public static void main(String[] args) {
		List<Dish> dishes = Datamodel.getDishes();
		generate("1. List dish Names have calories > 250", dishes.stream()
				.filter(d -> d.getCalories()>250)
				.map(Dish::getName)
				.sorted()
				.collect(Collectors.toList()));
		
//		dishes.stream()
//			.filter(d -> d.getKind() == Kind.MEAT)
//			.map(Dish::getName)
//			.toArray(new IntFunction<String[]>() {
//				public String[] apply(int length) {
//					return new String[length];
//				};
//			});
//			.toArray(Integer[]::new);
		// sort budget map by key [null first, descending]
		final Map<Integer, String> vehicles = Datamodel.mockVehicles();
		Map<Integer, String> sortedMap = vehicles.entrySet().stream()
		.sorted(comparing(Entry::getKey, reverseOrder()))
		.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new));// stream<Entry<K, V>>
		
		// map --> Set --> List --> sort --> LinkedHashMap<K, V>
		
		generate("3. Sorted Map", sortedMap);
		
	}
}
