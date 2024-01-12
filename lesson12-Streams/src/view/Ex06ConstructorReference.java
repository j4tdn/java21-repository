package view;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex06ConstructorReference {

	
	/*
	 1. Implementation class
	 2. Anonymus class
	 3. Anonymus function
	 4. Method/Cóntructor reference
	    4.1 Method Reference(static/non-static)
	    --> Chỉ cần có lambda vs danh sách tham số, body, return_type bất kỳ
	    --> Đều có thể chuyển sang method reference(static, non-static)
	    Cách gị: TenClass::tenHam
	    
	    
	    4.2 Constructor Reference
	    --> Có lambda, danh sách tham số bất kỳ và body gọi đến hàm khởi tạo của 1 class nào đó
	    --> return_type chính là KDL của class đó.
	    Cách gọi: TenHam::new
	 */
	
	public static void main(String[] args) {
		
	}
	
	private static Map<Integer, String> mockVehicles(){
		
		var vehicles = new HashMap<Integer, String>();
		
		vehicles.put(92, "A Quảng Nam");
		vehicles.put(43, "Z Đà Nẵng");
		vehicles.put(75, "K Thừa Thiên Huế");
		vehicles.put(null, "B Việt Nam");
		vehicles.put(74, "F Quảng Trị");
		vehicles.put(73, "C Quảng Bình");
		vehicles.put(73, "Z Quảng Bình");
		vehicles.put(11, "Cao Bằng");
		return vehicles;
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> map, 
		Comparator<Entry<Integer, String>> comparator ) {
		List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
		
		entries.sort(comparator);
		// có thể dùng bất kì lớp thực thi nà của Map: HashMap, TreeMap, LinkedHashMap
		Map<Integer, String> sortedMap = new LinkedHashMap<>();

		for (Entry<Integer, String> entry: entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
}
