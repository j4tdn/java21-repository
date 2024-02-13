package view.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import bean.Dish;
import common.Category;
import model.DataModel;
import utils.CollectionUtils;

public class Ex01StreamBasicDemo {

	public static void main(String[] args) {
		List<Dish> menu = DataModel.mockDishes();
		
		// .collect(Collectors.toList()
		// toList() --> java 16
		
		// 1. get dishes which have calories > 400
		 List<Dish> dishs = menu.stream() // Stream<Dish> 
			.filter(d -> d.getCalories() > 400) // Stream<Dish>
			.collect(Collectors.toList());
		 
		 CollectionUtils.generate("1. get dishes which have calories > 400", dishs);
		// 2. get name of dishes
		Set<String> dishNameList = menu.stream() // Stream<Dish>
			.map(d -> d.getName()) // Stream<String>
			.sorted()
			.collect(Collectors.toCollection(TreeSet::new));
		 CollectionUtils.generate("2. get name of dishes", dishNameList);

		// 3. get name of veggie dish
		String[] veggieDishes = menu.stream() // Stream<Dish> 
			.filter(d -> d.getCategory() == Category.VEGGIE) // Stream<Dish>
			.map(Dish::getName)
			/*.toArray(new IntFunction<String[]>() {
				public String[] apply(int length) {
					return new String[length];
				};
			});*/
			//.toArray(length -> new String[lenth])
			.toArray(String[]::new);
		 for(String dish:veggieDishes) {
			 System.out.println("veggie dish -> " + dish);
		 }
		 
		 // stream<T>
		 // Map<K,V> -> set<Entry<K,V>> --> List<Entry<K, V>> -> sort -> LinkedHashMap<K, V>
		 
		 // Map<K, V> -> set<Entry<K, V>> --> Stream<Entry<K, V>> -> sort -> LinkedHashMap<K, V>
		 
		 // Stream<T> -> toList() -> List<T>

		 // Stream<T> -> toMap(...) -> Map(K, V)
		 
		 // Entry.comparingByKey = comparing(Entry::getKey)

		 // Colectors.toMap(Entry::getKey, Entry::getValue)
		 // nếu key trước sau trùng nhau --> lỗi
		 // mặc định trả về hashmap
		 
		 // Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2)
		 // --> key chuyển sang có thể trùng nhau, chọn value trước/sau
		 
		 // Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v2, LinkedHashMap::new)
		 // --> key chuyển sang có thể trùng nhau, chọn value trước/sau
		 // --> xác định kiểu Map lúc runtime
		 
		// 4. sort a budget map by key [null first, descending]
		final Map<Integer, String> vehicles = DataModel.mockVehicles();
		Map<Integer, String> sortedMap = vehicles.entrySet().stream() // Stream<Entry<K,V>>
				.sorted(Entry.comparingByKey(Collections.reverseOrder()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2)-> v2, LinkedHashMap::new));
		
		System.out.println(sortedMap.getClass());
		
		CollectionUtils.generate("3. Sorted Map ", sortedMap );
	}
}
