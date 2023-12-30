package map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import static java.util.Comparator.*;

public class Ex01MapBasicDemo {
	public static void main(String[] args) {
		// var vehicles = new HashMap<>(); // K(Object), V(Object)
		
		// var vehicles = new HashMap<Integer, String>();
		
		// Map<Integer, String> vehicles = new HashMap<>(); // K(Integer), V(String)
		
		/*
		 Map: put(K, V) 
		 --> ngoài việc lưu trữ giá trị của K, V vào memory, còn hashing giá trị của K theo hàm
		 hashcode(công thức, trả về 1 dãy số) và lưu hashing value này vào memory
		 --> khi tìm kiếm 1 phần tử theo K, hashing key ra hashing value --> tìm theo hashing
		 value --> hỗ trợ tìm kiếm luôn luôn là O(1) khi search theo K
		  
		
		 HashMap: ko đảm bảo thứ tự đúng như lúc put vào
		 LinkedHashMap: đảm bảo duy trì đúng thứ tự các phần tử đưa vào
		 TreeMap: hỗ trợ 'tự động' sort theo K, yêu cầu <K extends Comparable<?>
		        : nếu K ko phải là extends Comparable<?> thì nó sẽ báo lỗi lúc runtime, casting ...
		        : có thể sử dụng comparator để sort
		        
		        --> k hỗ trợ sort by value
		        
		        --> tự code hàm sort(dùng loại map bất kỳ) --> sort by key, value ...
		 
		 */
		
		// Map<Integer, String> vehicles = new HashMap<>(); // K(Integer), V(String)
		
		// Sort By Key --> ASC | DESC by properties, NULL first/last
		
		// Map<Integer, String> vehicles = new TreeMap<>(); // auto ASC
		
		// null last and descending by key
		// khai báo sort trước, put sau
		/* Map<Integer, String> vehicles = new TreeMap<>(new Comparator<>() {
			@Override
			public int compare(Integer k1, Integer k2) {
				// null last
				if (k1 == null) {
					return 1;
				}
				if (k2 == null) {
					return -1;
				}
				return k2.compareTo(k1);
			}
		}); */
		Map<Integer, String> vehicles = new TreeMap<>(nullsFirst(comparing(k -> k, reverseOrder())));
		
		vehicles.put(92, "Quảng Nam");
		vehicles.put(43, "Đà Nẵng");
		vehicles.put(75, "Thừa Thiên Huế");
		vehicles.put(null, "Việt Nam");
		vehicles.put(74, "Quảng Trị");
		vehicles.put(73, "Quảng Bình");
		
		vehicles.put(75, "T - T - Huế"); // override value if existing key
		vehicles.putIfAbsent(92, "Kwuảng Nôm"); // put new entry if key is not existed 
		
		String value = vehicles.get(73);
		System.out.println("Value by K=73 --> " + value); // O(1)
		System.out.println("Value by K=88 --> " + vehicles.getOrDefault(88, "Not Found"));
		
		
		
		printf("1. Vehicles", vehicles);
	}
	
	// Map<K, V> --> mỗi phần từ là 1 entry<k, v> --> k là ko đc phép trùng nhau
	// các entry chắc chắn là khác nhau
	private static void printf(String prefix, Map<Integer, String> map) {
		System.out.println(prefix + " {");
		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry: entries) {
			System.out.println("    " + entry.getKey() + " --> " + entry.getValue());
		}
		System.out.println("}\n");
	}
	
}
