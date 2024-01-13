package view.stream;

import static utils.CollectionUtils.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

import bean.Dish;
import common.Category;
import model.DataModel;

public class Ex01StreamBasicDemo {
	
	public static void main(String[] args) {
		List<Dish> menu = DataModel.mockDishes();
		
		// .collect(Collectors.toList());
		// toList() --> JAVA 16
		
		// 1. Get dishes which have calories > 400
		List<Dish> dishes = menu.stream() // Stream<Dish>
			.filter(d -> d.getCalories() > 400) // Stream<Dish>
			.collect(Collectors.toList()); // List<Dish>
		
		generate("1. Get dishes which have calories > 400", dishes);
		
		// 2. Get name of dishes
		Set<String> dishNameList = menu.stream() // Stream<Dish>
			.map(d -> d.getName()) // Stream<String>
			// .sorted()
			.collect(Collectors.toCollection(TreeSet::new));
		generate("2. Get name of dishes", dishNameList);
		
		// 3. Get name of veggie dish
		String[] veggieDishes = menu.stream()
			.filter(d -> d.getCategory() == Category.VEGGIE)
			.map(Dish::getName) // Stream<String>
			/*.toArray(new IntFunction<String[]>() {
				public String[] apply(int length) {
					return new String[length];
				};
			});*/
			// .toArray(length -> new String[length]);
			.toArray(String[]::new);
		
		for (String dish: veggieDishes) {
			System.out.println("veggie dish -> " + dish);
		}
		
		
		// 4. Sort a budget map
		// TODO
		
	}
	
}
