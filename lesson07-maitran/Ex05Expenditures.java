package view;

import static utils.CollectionUtils.generate;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import model.DataModel;

public class Ex05Expenditures {

	public static void main(String[] args) {
		var data = DataModel.mockData();

		generate("1. Price greater than 500", filter(data, BigDecimal.valueOf(500)));

		generate("2. Sorted by key", sortByKey(data));

		generate("3. Sorted by value", sortByValue(data));
	}

	private static Map<String, BigDecimal> filter(Map<String, BigDecimal> data, BigDecimal price) {
		return data.entrySet().stream().filter(entry -> entry.getValue().compareTo(price) > 0)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}

	private static Map<String, BigDecimal> sortByKey(Map<String, BigDecimal> data) {
		return data.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));
	}

	private static Map<String, BigDecimal> sortByValue(Map<String, BigDecimal> data) {
		return data.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));
	}
	

}