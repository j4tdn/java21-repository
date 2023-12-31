package view.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import static java.util.Comparator.*;
import static utils.CollectionUtils. *;

public class Ex02MapSortingDemo {
	/*
	 
	 List<T> --> null,
	 			 T1(1, a, z),
	 			 T2(1, a, z),
	 			 null
	 			 --> nullsFirst, nullsLast ok
	 			 
	 List<T> --> null,
	 			 T1(null, a, z),
	 			 T2(1, a, z),
	 			 null
	 			 --> nullsFirst, nullsLast  			 
	 */
	public static void main(String[] args) {
		var vehicles = new HashMap<Integer, String>();
		
		vehicles.put(92, "Quảng Nam");
		vehicles.put(43, "Quảng Nam");
		vehicles.put(75, "Thừa Thiên Huế");
		vehicles.put(74, "Quảng Trị");
		vehicles.put(73, "Quảng Bình");
		vehicles.put(null, "Việt Nam");
		vehicles.put(75, "T-T-Huế");
		generate("1. Vehicles --> ", sort(vehicles, comparing(e -> e.getValue(), reverseOrder())));
		generate("2. Vehicles (sorted by value descending) --> ", 
				sort(vehicles, comparing(e -> e.getValue(), reverseOrder())));
		vehicles.put(147, null);
		vehicles.put(258, null);
		generate("3. Vehicles (sorted by value ascending, null first)  --> ", 
				sort(vehicles, new Comparator<>() {
					
					@Override
					public int compare(Entry<Integer, String> e1, Entry<Integer, String> e2) {
						String v1 = e1.getValue();
						String v2 = e2.getValue();
						if(v1 == null) {
							return -1;
						}
						if(v2 == null) {
							return 1;
						}
						return v1.compareTo(v2);
					}
				}));	
		
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> map, 
			Comparator<Entry<Integer, String>> comparator) {
		// 1. Convert map -> set(not support sort) -> list
		List<Entry<Integer, String>> elements = new ArrayList<>(map.entrySet());
		
		// 2. List<Entry<K, V> --> sort entries in list by ??? requirement
		// VD: Sắp xếp các ENTRY trong list theo value descending
		elements.sort(comparator);
		
		// 3. Tạo 1 map mới, đưa các phần tử từ list đã sắp xếp qua map mới đó
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		// 4. Trả về map mới đó(đã sắp xếp theo yêu cầu)
		for(Entry<Integer, String> element:elements) {
			sortedMap.put(element.getKey(), element.getValue());
		}
		return sortedMap;
		
	}
}
