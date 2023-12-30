package view.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import static java.util.Comparator.*;

public class Ex01MapBasicDemo {

	public static void main(String[] args) {
		
		// var vehicle = new HashMap<>(); // K(Object), V(Object)
		
		//var vehicles = new HashMap<Integer, String>();
		
		/*
		 
		 HashMap: ko đảm bảo thứ tự đúng như lúc put vào
		 LinkedHashMap: đảm bảo duy trì đúng thứ tự các phần tử đưa vào
		 TreeMap: hỗ trự tự động sort theo K, yêu cầu K extends Comparable<?>
		 		: nếu K không phải là extends Comparable<?> thì nó báo lỗi lúc runtime, casting...
		 		: có thê sử dụng comparator để sort
		 		 
		 		 --> không hỗ trợ sort by value
		 		 
		 		 --> muốn sort by value --> tự code hàm sort (dùng loại map bất kỳ)
		 
		 
		 */
		
		// Sort By Key --> ASC | DESC by properties 
		
		// Map<Integer, String> vehicle = new TreeMap<>(); // K(Integer), V(String)  // Auto ASC
		
		
		//null last and descending by key
		
		/* Map<Integer, String> vehicle = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer k1, Integer k2) {
				//null last
				if(k1 == null) {
					return 1;
				}
				if(k2 == null) {
					return -1;
				}
				return k2.compareTo(k1);
			}
		}); */
		Map<Integer, String> vehicle = new TreeMap<>(nullsLast(comparing(k -> k, reverseOrder())));
		vehicle.put(92, "Quang Nam");
		vehicle.put(43, "Da Nang");
		vehicle.put(75, "Thua Thien Hue");
		vehicle.put(74, "Quang Tri");
		vehicle.put(73, "Quang Binh");
		
		vehicle.put(75, "T-T-Huế"); //override value if existing key
		vehicle.putIfAbsent(92, "Kwang Nôm"); //
		
		System.out.println("vehicles size: " + vehicle.size());
		
		String value = vehicle.get(73);
		System.out.println("Value by K = 73 --> " + value);
		System.out.println("Value by K = 88 --> " + vehicle.getOrDefault(88, "Not Found"));
		
		printf("1. Vehicles", vehicle);
	}
	
	private static void printf(String prefix, Map<Integer, String>  map) {
		System.out.println(prefix + " {");
		Set<Entry<Integer, String>> entries = map.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println("   " + entry.getKey() + "--> " + entry.getValue());
		}
		System.out.println("}\n");
	}
}