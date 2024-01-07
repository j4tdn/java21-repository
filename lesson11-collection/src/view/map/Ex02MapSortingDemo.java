package view.map;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import static utils.CollectionUtils.generate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public class Ex02MapSortingDemo {
	/*
	 * List<T> --> null,
	 * 			T1(1,a,z),
	 * 			T2(2,b,k(
	 * 			null
	 * 			-->nullFirst, nullLast ok
	 */
	
	
	
	public static void main(String[] args) {
		
		//chuyển hàm printf qua Hàm utils Coleection;
		var vehicles = new HashMap<Integer, String>();
		   
		vehicles.put(92, "A Quảng Nam");
	    vehicles.put(43, "Z Đà Nẵng");
	    vehicles.put(75, " K Huế");
	    vehicles.put(null, "B Việt Nam");
	    vehicles.put(74, "F Quảng Trị");
	    vehicles.put(73, "C Quảng Bình");
	    
	    vehicles.put(271, null);
	    vehicles.put(285	, null);
	    
	 // Map<K, V> --> Từng phần tử của nó --> Entry<K, V>
		
	 		generate("1. Vehicels -->", vehicles);
	 		
	 		generate("2. Vehicels (sorted by value descending) -->", 
	 				 sort(vehicles, comparing(e -> e.getValue(), reverseOrder())));
	 		
	 		vehicles.put(147, null);
	 		vehicles.put(258, null);
	 		
	 		// ok --> code hơi dài
	 		/*generate("3. Vehicles (sorted by value ascending, null first) -->", 
	 				 sort(vehicles, new Comparator<>() {
	 					 @Override
	 					public int compare(Entry<Integer, String> e1, Entry<Integer, String> e2) {
	 						 String v1 = e1.getValue();
	 						 String v2 = e2.getValue();
	 						 if (v1 == null) {
	 							 return -1;
	 						 }
	 						 if (v2 == null) {
	 							 return 1;
	 						 }
	 						 return v1.compareTo(v2);
	 					}
	 				})); */
	 		// ko hỗ trợ khi nulls first, last theo thuộc tính của elements
	 		// generate(
	 		// 		"3. Vehicels (sorted by value ascending, null first) -->", 
	 		//		sort(vehicles, nullsFirst(comparing(e -> e.getValue()))));
	 		
	 		
	 		// Idea of sort, call sort --> swap elements --> return void
	 		
	 		// Sort by value descending
	 		
	 	}
	private static  Map<Integer, String> sort (Map<Integer, String> map, 
			Comparator<Entry<Integer, String>> comparator) {
		//1. Convert map -> set (not Suport sort) -> list
		// Chuyển đổi Map ( không hổ trợ sort ) -> SET (không hỗ trợ hàm sort) ->List
		List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
		
		//2. List<Entry<K,V> --> Sắp xếp các ENTRY trong list theo yêu cầu?
		entries.sort(comparing(e -> e.getValue(), reverseOrder()));
		
		//3. Tạo 1 máp mới, đưa các phần tử list đã sắp xếp qua map mới đó
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		
		//4. Trả về map mới đó(đã sắp xếp theo yêu cầu)
		for (Entry<Integer, String> entry: entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
}
