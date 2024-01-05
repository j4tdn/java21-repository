package view.map;
import static java.util.Comparator.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01MapBasicDemo {

	public static void main(String[] args) {
		
		// var vehicles = new HashMap<>(); // K(Object), V(Object)
		
		// var vehicles = new HashMap<Integer, String>();
		
		/*
		 
		 Map: put(K,V)
		 --> ngoài việc lưu trữ giá trị của K,V vào memory, còn hashing giá trị của K theo hàm
		 hashcode(công thức, trả về 1 dãy số) và lưu hashing giá trị này vào memory
		 --> khi tìm kiếm 1 phần tử theo K, hashing key ra hashing value --> tìm theo hashing 
		 value --> hỗ trợ tìm kiếm luôn luôn là 0(1) khi search theo K
		 
		 HashMap	  : ko đảm bảo thứ tự đúng như lúc put vào
		 LinkedHashMap: đảm bảo duy trì đúng thứ tự các phần tử đưa vào
		 TreeMap	  : hỗ trự tự động sort theo K, yêu cầu K extends Comparable<?>
		 		      : nếu K không phải là extends Comparable<?> thì nó báo lỗi lúc runtime, casting...
		 		      : có thê sử dụng comparator để sort
		 		
		 		--> ko hỗ trợ sort by value
		 		
		 		--> muốn sort by value --> tự code hàm sort(dùng loại map bất kỳ) --> sort by key, value ...
		 		
		 
		 */
		
		//Map<Integer, String> vehicles = new LinkedHashMap<>();
		
		//Map<Integer, String> vehicles = new HashMap<>(); // K(Integer), V(String)
		
		// Sort By Key --> ASC | DESC by properties, NULL first/last
		
		//Map<Integer, String> vehicles = new TreeMap<>(); // auto ASC
		
		// null last and descending by key
		
		//Map<Integer, String> vehicles = new TreeMap<>();
		//Map<Integer, String> vehicles = new TreeMap<>(Comparator.reverseOrder());
		
		//Map<Integer, String> vehicles = new HashMap<>();
		
		// null last and descending by key
		// khai báo sort trước, put sau
		
		
		/*
		Map<Integer, String> vehicles = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer k1, Integer k2) {
				// null last
				if(k1 == null) {
					return 1;
				}
				if(k2 == null) {
					return -1;
				}
				return k2.compareTo(k1);
			}
		});  */
		
		// khai báo sort trước, put sau
		Map<Integer, String> vehicles = new TreeMap<>(nullsFirst(comparing(k -> k, reverseOrder())));
		
		vehicles.put(92, "Quang Nam");
		vehicles.put(43, "Da Nang");
		vehicles.put(75, "Thua Thien Hue");
		vehicles.put(null, "Viet Nam");
		
		vehicles.put(74, "Quang Tri");
		vehicles.put(73, "Quang Binh");
		
		vehicles.put(75, "T-T-Huế"); //override value if existing key
		vehicles.putIfAbsent(92, "Kwang Nôm"); // put new entry if key is not existed
		
 		String value = vehicles.get(73);
		System.out.println("Value by K = 73 --> " + value); // O(1)
		System.out.println("Value by K = 88 --> " + vehicles.getOrDefault(88, "Not Found"));
		
		System.out.println("vehicles size: " + vehicles.size());
		
		printf("1. Vehicles", vehicles);
	}
	
	// Map<K,V> --> mỗi phần tử là 1 entry<k, v> --> k là ko được phép trùng nhau
	// các entry chắc chắn là khác nhau
	private static void printf(String prefix, Map<Integer, String>  map) {
		System.out.println(prefix + " {");
		
		Set<Entry<Integer, String>> entries = map.entrySet();
		
		for(Entry<Integer, String> entry: entries) {
			System.out.println("   " + entry.getKey() + "--> " + entry.getValue());
		}
		System.out.println("}\n");
	}
}
