package generic.wildcard;

import java.util.List;

public class Ex01WildCardDemoBasic {
	
	public static void main(String[] args) {
		List<Integer> ints = List.of(1, 2, 3, 4, 5);
		List<Long> longs = List.of(11L, 22L, 33L, 44L, 55L);
		List<Double> doubles = List.of(1.1D, 2.2D, 3.3D, 4.4D, 5.5D);
		List<String> strings = List.of("a", "b", "c", "d", "e");
		List<Object> objects = List.of("a", 1, 11L, 1.1D);
		
		generate("1. Ints", ints);
//		generate("2. Longs", longs);
//		generate("3. Doubles", doubles);
//		generate("4. Strings", strings);
		generate("5. Objects", objects);
	}
	
	// Cho phép truyền vào 1 list of elements(kiểu dữ liệu bất kỳ, đối tượng)
	// List<?> = List<T> (trong trường hợp này)
	// generic type: 	 T --> extends
	// generic wildcard: ? --> extends, super
	// extends X --> X hoặc là con của X VD: X là Number, cho phép Number hoặc con của Number
	// super X --> X hoặc là cha của X   VD: X là Integer, cho phép Integer hoặc cha của Integer
	
	public static void generate(String prefix, List<? super Integer> collection) {
		System.out.println(prefix + " --> ");
		for (Object item : collection) {
			System.out.println("+ " + item);
		}
		System.out.println();
	}
}
