package view;

import static java.util.Comparator.comparing;
import static model.DataModel.mockSpending;
import static utils.CollectionUtils.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex05 {
	public static void main(String[] args) {
		var spending = mockSpending();

		generate("2. ", sort(spending, comparing(e -> e.getKey())));
		generate("3. ", sort(spending, comparing(e -> e.getValue())));

	}

	private static Map<String, BigDecimal> sort(Map<String, BigDecimal> map,
			Comparator<Entry<String, BigDecimal>> comparator) {
		List<Entry<String, BigDecimal>> entries = new ArrayList<>(map.entrySet());

		entries.sort(comparator);

		Map<String, BigDecimal> sortedMap = new LinkedHashMap<>();

		for (Entry<String, BigDecimal> entry : entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

//	public static void find(String prefix, Map<String, BigDecimal> spending) {
//		System.out.println(prefix + " {");
//		Set<Entry<String, BigDecimal>> entries = spending.entrySet();
//		for (Entry<String, BigDecimal> entry: entries) {
//			if (entry.getValue() == 500000) {
//				
//			}
//			
//			System.out.println("    " + entry.getKey() + " --> " + entry.getValue());
//		}
//		System.out.println("}\n");
//	}
}
