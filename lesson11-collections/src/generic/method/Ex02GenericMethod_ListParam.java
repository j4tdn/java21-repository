package generic.method;

import java.util.Collection;
import java.util.List;

import bean.Item;

public class Ex02GenericMethod_ListParam {
	public static void main(String[] args) {
		List<Integer> ints = List.of(1, 2, 3, 4, 5);
		List<Long> longs = List.of(11L, 22L, 33L, 44L, 55L);
		List<Double> doubles = List.of(1.1d, 2.2d, 3.3d, 4.4d, 55d);
		List<String> strings = List.of("a", "b", "c", "d");
		List<Object> objects = List.of("a", 2);

		generate("1. Ints", ints);
		generate("2. longs", longs);
		generate("3. doubles", doubles);
		generate("4. strings", strings);
		generate("5. object", objects);
		// list<objects>: KDL list tham số truyền vào object
		// list<Integer>: KDL list

	}
	
	//<T>: cho phép truyền bất kỳ KDL đối tượng vào
	//<T extends Number>: T cho phép truyền bất kỳ KDL number hoặc con của Number

	public static void generateObject(String prefix, List<Object> collection) {
		System.out.println(prefix + "-->");
		for (Object item : collection) {
			System.out.println(item);
		}
		System.out.println();
	}

	public static <T> void generate(String prefix, List<T> collection) {
		System.out.println(prefix + "-->");
		for (T item : collection) {
			System.out.println(item);
		}
		System.out.println();
	}
}
