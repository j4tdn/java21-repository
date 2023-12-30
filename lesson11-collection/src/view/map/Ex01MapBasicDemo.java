package view.map;

import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsFirst;
import static java.util.Comparator.nullsLast;
import static java.util.Comparator.reverseOrder;
import static utils.CollectionUtils.generate;

import java.util.Map;
import java.util.TreeMap;

public class Ex01MapBasicDemo {

	public static void main(String[] args) {

		// var vehicles = new HashMap<>(); K(Object), V(Object)
		
		// var vehicles = new HashMap<Integer, String>(); K(Object), V(Object)
		
		// Map<Integer, String> vehicles = new HashMap<>(); 

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
		
		// Map<K, V> --> mỗi phan từ la 1 entryck, v> -- > k là ko đc phép trùng nhau
		// các entry chắc chẩn là khác nhau
		
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
		
		Map<Integer, String> vehicles = new TreeMap<>(nullsLast(comparing(k -> k, reverseOrder())));

		vehicles.put(92, "Quảng Nam");
		vehicles.put(43, "Đà Nẵng");
		vehicles.put(75, "Thừa Thiên Huế");
		vehicles.put(null, "Việt Nam");
		vehicles.put(74, "Quảng Trị");
		vehicles.put(73, "Quảng Bình");

		System.out.println("vehicles size: " + vehicles.size());
		generate("1. Vehicles", vehicles);
		
		String value = vehicles.get(73);
		System.out.println("Value by K=73 -- > " + value); // 0(1)
		System.out.println("Value by K=88 -- > " + vehicles.getOrDefault(88, "Not Found"));
	}



}
