package view.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Comparator.*;
import bean.Dish;
import common.Category;
import model.DataModel;

import static utils.CollectionUtils.*;

public class Ex01StreamBasicDemo {

	public static void main(String[] args) {
		
		List<Dish> menu = DataModel.mockDishes();
		
		// 1. Get dishes which have calories > 400
		List<Dish> dishes = menu.stream() // stream<Dish>
				.filter(d -> d.getCalories() > 400) // stream<Dish>
				.collect(Collectors.toList()); // List<Dish>

		generate("1.Get dishes which have calories > 400 ", dishes);
		
		// 2. Get name of dishes 
		Set<String> dishNameList = menu.stream()
		    .map(d -> d.getName())
		    .collect(Collectors.toCollection(TreeSet::new));
		
		generate("2. Get name of dishes ", dishNameList);
		
		// 3. Get name of veggie dish
		String[] veggieDisheStrings = menu.stream() // stream<Dish>
				.filter(d -> d.getCategory() == Category.VEGGIE).map(Dish::getName)// stream<Dish>
//				.toArray(new IntFunction<String[]>() {
//					public String[] apply(int length) {
//						System.out.println("length -> " + length);
//						return new String[3];
//					};
//				});
//				.toArray(length -> new String[length]);
				.toArray(String[] :: new);

		for (String dish : veggieDisheStrings) {
			System.out.println("veggie dish --> " + dish);
		}
		
		// Stream<T>
		// Map<K,V> -> Set<Entry<K,V>> --> Stream<Entry<K,V>>
		
		// 4. Sorted a budget map by key(null first, desc)
//		final Map<Integer, String> vehicles = DataModel.mockVehicles();
//		Map<Integer, String> =  vehicles.entrySet().stream()
////		        .sorted(Comparator.comparing(Entry::getKey, re));
		
		
	}

}
