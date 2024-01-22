package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex06ConstructorReference {
	
	public static void main(String[] args) {
		// Method reference : xuất hiện từ java 8
				/*
				 * 1.Implementation class 
				 * 2.Anounymous class 
				 * 3.Anounymous function 
				 * 4.Method Reference(static/non static)
				 * --> chỉ cần có lambda với danh sách tham số bất kì, body, return_type bất kì,
				 *     thì có thể chuyển qua method reference(static/non static)
				 * 5.Constructor Reference
				 * --> có lambda, danh sách tham số bất kì và body gọi đến hàm khởi tạo của
				 *     class nào return type chính là KDL của class đó
				 */
	}
	private static Map<Integer, String> mockVehicles(){
		return new HashMap<Integer, String>() {
			private static final long serialVersionUID = 1L;

			{
				put(92, "A Quảng Nam");
				put(43, "Z Đà Nẵng");
				put(75, "K Thừa Thiên Huế");
				put(null, "B Việt Nam");
				put(74, "F Quảng Trị");
				put(73, "C Quảng Bình");
				put(73, "C Quảng Bình");
				put(11, "Cao Bằng");
			}
		};
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> map, 
			Comparator<Entry<Integer, String>> comparator) {
		List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
		
		entries.sort(comparator);
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();

		for (Entry<Integer, String> entry: entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	

}
