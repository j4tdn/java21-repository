package view.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import static java.util.Comparator.*;
public class Ex01MapBasicDemo {

	public static void main(String[] args) {
		
		//var vehicles = new HashMap<>(); // K(Object) V( Object)
		
	    //var vehicles = new HashMap<Integer, String>();
		
		// Map: put (K, V)
		//--> ngoài việc lưu trữ giá trị của K, V vào memory, còn hasing giá trị của K theo hàm
		//Hashcode ( Công thức, trả về 1 dãy số), và lưu trữ value --> hỗ trợ tìm kiếm luôn là 0(1) khi search theo K
		
		//Hash Map: k đảm bảo thứ tự như lúc put vào
		//LinkeHashMap: Đảm bảo duy trì đúng thứ tự các phần tử đưa vào
		//TreeMap: hỗ trợ "tự động" sort theo K, yêu cầu < K extends Comparable<?>
			// : nếu K không phải là extends Comparable<?> thì nó sẽ lỗi lúc runtime, casting...
			// : có thể sử dụng comparator để sort
			// --> không hổ trợ sort by value
			// --> muốn sort phải tự code hàm sort ( dùng loại map bất kỳ) --> sort by key, value ...
		
		
		
		// Sort By Key: --> ASC | DESC by properties
		//Map<Integer, String> vehicles = new TreeMap<>(); //Auto ASC
	   // Map<Integer, String> vehicles = new HashMap<>();  // K(Integer) V(String)
	   
		//Null last and descending by key
		// Khai báo sort trước, put sau
		/*Map<Integer, String> vehicles = new TreeMap<>(new Comparator<>() {
	    	public int compare(Integer  o1, Integer o2) {
	    		//null last
	    		if (o1 == null) {
	    			return 1;
	    		}
	    		if (o2 == null) {
	    			return -1;
	    		}
	    		return o2.compareTo(o1);
	    	}
	    }); */
		
		// dùng hàm sort có sẵn sort theo Key K
		Map<Integer, String> vehicles = new TreeMap<>(nullsFirst(comparing(k -> k, reverseOrder())));
	   
		vehicles.put(92, "Quảng Nam");
	    vehicles.put(43, "Đà Nẵng");
	    vehicles.put(75, "Huế");
	    vehicles.put(null, "Việt Nam");
	    vehicles.put(74, "Quảng Trị");
	    vehicles.put(73, "Quảng Bình");
	    vehicles.put(73, "Bình Quảng"); //Key trùng 73 nên size vẫn tính 5 ghi đè  cái Quảng Bình
	    vehicles.put(75, "T-T- Huế"); // orveride value if existing key
	    vehicles.putIfAbsent(92, "Kwuang Nôm"); // put new key entry if key is not existed
	    System.out.println("vehicles size: " + vehicles.size());
	    
	    String value = vehicles.get(73);
	    System.out.println("Value by k = 73 -->: " + value); // 0(1)
	    System.out.println("Value by k = 88 -->: " +vehicles.getOrDefault(88, "Not Found"));
	}
		//Map <K,V> --> mỗi phần tử là 1 entry <K, V> --> K là không được phép trùng nhau
		//các entry chắc chắn là khác nhau
	
	
	private static void printf(String prefix, Map<Integer, String> map) {
		System.out.println(prefix + " {");
		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry: entries) {
			System.out.println("    " + entry.getKey() + " --> " + entry.getValue());
		}
		System.out.println("}\n");
	}

}
