package generic.wildcard;

import java.util.List;

public class Ex01WildCardBasicDemo {

	public static void main(String[] args) {

		List<Integer> ints = List.of(1, 2, 3, 4, 5);
		List<Long> longs = List.of(11L, 22L, 33L, 44L, 55L);
		List<Double> doubles = List.of(1.1d, 2.2d, 3.3d, 4.4d, 5.5d);
		List<String> strings = List.of("a", "b", "c", "d", "e");
		List<Object> objects = List.of("a", 1, 2d, 7L);

	}

}
