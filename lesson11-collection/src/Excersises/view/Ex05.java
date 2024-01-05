package Excersises.view;

import static Excersises.model.DataModel.mockDailySpending;
import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import static Excersises.util.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Ex05 {

	public static void main(String[] args) {
		Map<String, Integer> dailySpending = mockDailySpending();
		
		generate("1. sort by price > 10000", filter(dailySpending, 10000));
				
		generate("3. sort by key[ascending]", sort(dailySpending, comparing(e -> e.getKey())));
		
		generate("2. sort by value[descending]", sort(dailySpending, comparing(e -> e.getValue(), reverseOrder())));
		
	}
	
	private static Map<String, Integer> sort(Map<String, Integer> map, Comparator<Entry<String, Integer>> comparator) {
		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		
		entries.sort(comparator);
		
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		
		for(Entry<String, Integer> entry: entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	
	private static Map<String, Integer> filter(Map<String, Integer> map, Integer price){
		var result = new HashMap<String, Integer>();
		
		Set<Entry<String, Integer>> entries = map.entrySet();
		
		for(Entry<String, Integer> entry: entries) {
			if(entry.getValue() > price) {
				result.put(entry.getKey(), entry.getValue());
			}
		}
		
		return result;
	}
}
