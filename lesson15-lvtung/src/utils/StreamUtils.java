package utils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamUtils {

	private StreamUtils() {
	}
	
	public static <E> List<E> toList(List<E> list, Predicate<E> predicate) {
		return list.stream().filter(predicate).toList();
	}
	
	public static <E, R> List<R> toList(List<E> list, Function<E, R> function, Predicate<R> predicate) {
		return list.stream()
				.map(function)
				.filter(predicate)
				.toList();
	}
	
	public static <E, K, V> Map<K, V> toMap(List<E> list, Function<E, K> keyMapper, Function<E, V> valueMapper) {
		return list.stream().collect(LinkedHashMap::new, (m, e) -> m.put(keyMapper.apply(e), valueMapper.apply(e)),
				LinkedHashMap::putAll);
	}
}
