package view.map;

import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import static java.util.Comparator.*;

public class Ex02MapSortingDemo {

	public static void main(String[] args) {

		var vehicle = new HashMap<Integer, String>();

		
		vehicle.put(92, "Quang Nam");
		vehicle.put(43, "Da Nang");
		vehicle.put(75, "Thua Thien Hue");
		vehicle.put(null, "Việt Nam");
		vehicle.put(74, "Quang Tri");
		vehicle.put(73, "Quang Binh");

		generate("1. Vehicles --> ", vehicle);

		generate("2. Vehicles (Sorted by value descending --> ",
				sort(vehicle, comparing(e -> e.getValue(), reverseOrder())));

		vehicle.put(147, null);
		vehicle.put(258, null);
		
		// okee nhưng code hơi dài
		 /* generate("3. Vehicles (Sorted by value ascending, null first --> ",
				sort(vehicle, new Comparator<Map.Entry<Integer,String>>() {
					
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
		 * 
		 * } }));
		 */

		
		// ko hỗ trợ khi nulls first, last theo thuộc tính của elements
		// generate("3. Vehicles (sorted by value ascending, null first) -->",
		//		sort(vehicle, nullsFirst(comparing(e -> e.getValue()))));

		
		
		
		// Sort by value descending

	}

	private static Map<Integer, String> sort(Map<Integer, String> map, Comparator<Entry<Integer, String>> comparator) {
		// 1. Chuyển đổi map -> set( mà set không support hàm sort) -> list

		List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());

		// 2. List<Entry<K, V> --> sắp xếp các ENTRY trong list theo yêu cầu nào đó?
		// VD: sắp xếp các ENTRY trong list theo value descending

		entries.sort(comparator);

		// 3. tạo 1 map mới, đưa các phần tử từ list đã sắp xếp qua map mới đó
		Map<Integer, String> sortedMap = new LinkedHashMap<>();

		// 4. Trả về map mới đó (đã sắp xếp theo yêu cầu)
		for (Entry<Integer, String> entry : entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
}
