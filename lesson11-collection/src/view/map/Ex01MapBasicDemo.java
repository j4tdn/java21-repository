package view.map;

import  static java.util.Comparator. *;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01MapBasicDemo {
	public static void main(String[] args) {
		/*
		 HashMap: ko đảm bảo thứ tự đúng như lúc put vào
		 LinkedHashMap: đảm bảo duy trì đứng thứ tự các phần tử đưa vào
		 TreeMap: Hỗ trợ 'tự động' sort theo K, yêu cầu <K extends Comparabale<?>
		 		: Nếu K không phải là extends Comparable<?> thì nó sẽ báo lỗi lúc runtime, casting ...
		 		: Có thể sử dụng compatator để sort
		 		
		 		--> Ko hỗ trợ sort by value
		 		
		 		--> muốn sort by value ( dùng loại map bất kì) --> sort by key,value
		 		
		 		--> k hỗ trợ sort by value
		 		
		 		--> muốn sort by value --> tự code hàm sort(dùng loại map bất kì)
		 		
		 Sort By Key --> ASC | DESC by properties, Null first/last
		 
		 null last and descending by key
		 khai báo sort trước, put sau
		 
		 Map: put<K,V>
		 --> Ngoài việc lưu trữ giá trị của K, V vào memory, còn hashing giá trị của key theo hàm 
		 hashcode(công thức, trả về 1 dãy số) và lưu hashing value này vào memory
		 --> Khi tìm kiếm 1 phần tử theo K, hashing key ra hashing key ra hashing value --> tìm theo hashing
		 value --> hỗ trợ tìm kiếm luôn luôn là O(1) khi search K
		 
		 */
		
		// null last and descending by key
//		var vehicles = new TreeMap<Integer, String>(new Comparator<>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// null last
//				if(o1 == null) {
//					return 1;
//				}
//				if(o2 == null) {
//					return -1;
//				}
//				return o2.compareTo(o1);
//				
//			}
//			
//		});		
		var vehicles = new TreeMap<Integer, String>(nullsFirst(comparing(k -> k, reverseOrder())));
		
		vehicles.put(92, "Quảng Nam");
		vehicles.put(43, "Quảng Nam");
		vehicles.put(75, "Thừa Thiên Huế");
		vehicles.put(74, "Quảng Trị");
		vehicles.put(73, "Quảng Bình");
		vehicles.put(null, "Việt Nam");
		vehicles.put(75, "T-T-Huế");
		
		vehicles.putIfAbsent(73, "Quảng Nôm");
		printf("1. Vehicles", vehicles);
		
	}
	// Map<K, V> --> Mỗi phần thử là 1 entry<k, v> --> k là không được phép trùng nhau
	// Các entry chắc chắn là khác nhau
	private static void printf(String prefix, Map<Integer, String> map) {
		System.out.println(prefix + " {");
		Set<Entry<Integer, String>> entries =  map.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
		System.out.println("}\n");
	}
}
