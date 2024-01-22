package view.stream;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import static utils.CollectionUtils.generate;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

import bean.Dish;
import common.Category;
import model.DataModel;

public class Ex01SteamBasicDemo {
	public static <A> void main(String[] args) {
		List<Dish> menu = DataModel.mockDishes();
		
		//1.Get dishes which have calories > 400
		List<Dish> dishes = menu.stream().filter((Dish d )-> d.getCalories() > 400).collect(Collectors.toList());
		generate("1. Calories > 400 : ", dishes);
		
		
		//2.Get name of dish
		Set<String> nameDishes = menu.stream().map((Dish d) -> d.getName()).sorted().collect(Collectors.toCollection(LinkedHashSet::new));
		generate("2. Name of veggie Dish : ", nameDishes);
				
		//3.Get name of veggie dish
		String[] veggieDish = menu.stream()
		.filter(d -> d.getCategory() == Category.VEGGIE).map(Dish::getName)
		/*.toArray(new IntFunction<String[]>() {
			@Override
			public String[] apply(int length) {
				return new String[length];
			}
		});*/
		
		
		// .toArray(length -> new String[length]);
		.toArray(String[]::new);
		
		for( String s : veggieDish) {
			System.out.println("Veggie Dish : "+s +"\n");
		}
		
		//4.Sort a budget map
		final Map<Integer, String> vehicles = DataModel.mockVehicles();
		Map<Integer, String> sortedVehicles = vehicles.entrySet().stream()  //stream<Entry<K,V>>
		.sorted(comparing(Entry::getKey, reverseOrder()))
		.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1,v2)-> v2, LinkedHashMap::new));
		
		generate("3. Sorted Map", sortedVehicles);
}
}
