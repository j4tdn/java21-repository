package view.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Comparator.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import static utils.CollectionUtils.*;
import static java.util.Comparator.*;

public class Ex02MapSortingDemo {
	public static void main(String[] args) {
		var vehicles = new HashMap<Integer, String>();
		
		vehicles.put(92, "Quảng Nam");
		vehicles.put(43, "ĐN");
		vehicles.put(75, "Huế");
		vehicles.put(null, "Quảng trị");
		vehicles.put(73, "Quảng Bình");
		
		generate("1. Vehicles", vehicles);
		
		generate("2. Vehicles (stored by value descending) --> ", sort(vehicles, comparing(e->e.getValue(), reverseOrder())));
		
		vehicles.put(156, null);
		
		generate("3. Vehicles asc nullfirst", sort(vehicles, nullsFirst(comparing(e -> e.getValue()))));
		
		// nếu thuộc tính String null
		
//		generate("3.", sort(vehicles, new Comparator<>() {
//			
//			@Override
//			public int compare(Entry<Integer, String> e1, Entry<Integer, String> e2) {
//				String v1 = e1.getValue();
//				String v2 = e2.getValue();
//				if (v1 == null) {
//					return -1;
//				}
//				if (v2 == null) {
//					return 1;
//				}
//				return v1.compareTo(v2);
//			}
//		}));
		
	}
	
	private static Map<Integer, String> sort(Map<Integer, String>map, 
						Comparator<Entry<Integer, String>> comparator) {
		// 1. Chuyển đổi map(k hỗ trợ hàm sort) -> set(k hỗ trợ hàm sort) -> list
		List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
		
		
		entries.sort(comparing(e -> e.getValue(), reverseOrder()));
		
		Map<Integer, String> sortedMap = new HashMap<>();
		
		for (Entry<Integer, String> entry: entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
}
