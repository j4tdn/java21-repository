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
		/*
		 * 1. Implementation class 2. Anonymous class 3. Anonymous function(lamda) 4.
		 * Method/Constructor Reference 4.1 Method Reference(static/non-static) --> Chỉ
		 * cần có lamda với danh sách tham số, body, return_type bất kỳ --> đều có thể
		 * chuyển sang method reference(static/non-static)
		 * 
		 * 
		 * 4.2 Constructor Reference --> Có lamda, danh sách tham số bất kỳ và body gọi
		 * đến hàm khởi tạo của một class nào đó --> và return type chính là KDL của
		 * class đó Cách gọi: TenClass:new
		 */
	}

	private static Map<Integer, String> mockVehicles() {

		return new HashMap<Integer, String>() {

			private static final long serialVersionUID = 1L;
			{
				put(92, "Quang Nam");
				put(43, "Da Nang");
				put(75, "Thua Thien Hue");
				put(null, "Việt Nam");
				put(74, "Quang Tri");
				put(73, "Quang Binh");
			}
		};
	}

	private static Map<Integer, String> sort(Map<Integer, String> map, Comparator<Entry<Integer, String>> comparator) {

		List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());

		entries.sort(comparator);

		Map<Integer, String> sortedMap = new LinkedHashMap<>();

		for (Entry<Integer, String> entry : entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
}
