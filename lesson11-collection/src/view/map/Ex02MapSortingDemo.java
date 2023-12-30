package view.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import static utils.CollectionUtils.*;
import static java.util.Comparator.*;
public class Ex02MapSortingDemo {

	public static void main(String[] args) {
		
	var vehicles = new HashMap<Integer, String>();

	vehicles.put(92, "Quang Nam");
	vehicles.put(43, "Da Nang");
	vehicles.put(75, "Thua Thien Hue");
	vehicles.put(74, "Quang Tri");
	vehicles.put(73, "Quang Binh");
	vehicles.put(11, "Cao Bang");
	
	
	generate("1. Vehicles", vehicles);

	
	generate("2. Vehicles (sorted by value descending) -->", 
			sort(vehicles, comparing(e -> e.getValue(), reverseOrder())));

	vehicles.put(null, "Viet Nam");
	vehicles.put(258, null);

	generate("3. Vehicles (sorted by value ascending) -->", 
			sort(vehicles, nullsFirst(comparing(e -> e.getValue()))));

	
	// Idea of sort, call sort --> swap elements --> return void

	// Sort by value ascending

	}
	
	private static Map<Integer, String> sort(Map<Integer, String> map, Comparator<Entry<Integer, String>> comparator) {
		// 1. Chuyển đổi MAP(ko hỗ trợ hàm sort) -> SET(ko hỗ trợ hàm sort) -> LIST
		List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
		
		// 2. List<Entry<K, V>> --> sắp xếp các ENTRY trong list theo yêu cầu ?
		// VD: sắp xếp các ENTRY trong list theo value descending
		entries.sort(comparator);
		
		// 3. Tạo 1 map mới, đưa các phần tử từ list đã sắp xếp qua map mới đó
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		
		// 4. Trả về map mới đó(đã sắp xếp theo yêu cầu)
		for(Entry<Integer, String> entry: entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
}
