package view.stream;

import static utils.CollectionUtils.generate;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

import bean.Dish;
import common.Category;
import model.DataModel;

public class Ex01StreamBasicDemo {
	
	public static void main(String[] args) {
		
		List<Dish> menu = DataModel.mockDishes();
		
		// 1. Get dishes which have calories > 400
		List<Dish> dishes = menu.stream().filter(d -> d.getCalories() > 400).collect(Collectors.toList());
		
		generate("1. Get dishes which have calories > 400", dishes);
		
		// 2. Get name of dishes
		Set<String> dishNameList = menu.stream().map(Dish::getName).collect(Collectors.toCollection(LinkedHashSet::new));
		
		generate("1. Get name of dishes", dishNameList);
		
		// 3. Get name of veggie dish
		String[] veggieDishes = menu.stream()
				.filter(d -> d.getCategory() == Category.VEGGIE)
				.map(Dish::getName)
				/*.toArray(new IntFunction<String[]>() {

					@Override
					public String[] apply(int length) {
						return new String[length];
					}
					
				});*/
				/*.toArray(length -> new String[length]);*/
				.toArray(String[]::new);
		
		for (String dish : veggieDishes) {
			System.out.println("veggie dish -> " + dish);
		}
		
		// 4. Sorted a budget map
		
	}
}
