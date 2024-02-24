package view.stream;

import static java.util.Comparator.reverseOrder;
import static utils.CollectionUtils.generate;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import bean.Dish;
import common.Category;
import model.DataMode;

public class Ex01StreamBasicDemo {
	
	public static void main(String[] args) {
		List<Dish> menu = DataMode.mockDishes();
		
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
		
		// Map<K, V> -> Set<Entry<K, V>> --> List<Entry<K, V>>   -> sort -> LinkedHashMap<K, V>
		
		
		// Map<K, V> -> Set<Entry<K, V>> --> Stream<Entry<K, V>> -> sort -> LinkedHashMap<K, V>
		
		// Stream<T> -> toList() -> List<T>
		
		// Stream<T> -> toMap(...) -> Map<K, V> 
		
		// Entry.comparingByKey = comparing(Entry::getKey)
		
		// Collectors.toMap(Entry::getKey, Entry::getValue)
		// nếu key trước sau trùng nhau --> lỗi
		// mặc định trả về hashmap
		
		// Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2)
		// --> key chuyển sang có thể trùng nhau, chọn value trước/sau
		
		// Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new)
		// --> key chuyển sang có thể trùng nhau, chọn value trước/sau
		// --> xác định kiểu Map lúc runtime
		
		// 4. Sort a budget map by key [null first, descending]
		final Map<Integer, String> vehicles = DataMode.mockVehicles();
		
		Map<Integer, String> sortedMap = vehicles.entrySet().stream() // Stream<Entry<K, V>>
			.sorted(Entry.comparingByKey(reverseOrder())) // Stream<Entry<K, V>>
			.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new));
			
		generate("3. Sorted Map", sortedMap);
	}
	
}