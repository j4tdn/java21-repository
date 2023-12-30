package generic.wildcard;

import java.util.List;

public class Ex01WildCardBasicDemo {
	
	public static void main(String[] args) {
		List<Integer> ints = List.of( 1, 2, 3, 4, 5 );
		List<Long> longs = List.of( 11L, 22L, 33L, 44L, 55L );
		List<Double> doubles = List.of( 1.1d, 2.2d, 3.3d, 4.4d, 5.5d );
		List<String> strings = List.of( "a", "b", "c", "d", "e" );
		List<Object> objects = List.of("a", 1, 2d, 7L);
		
		generate("1. Ints", ints);
		generate("2. longs", longs);
		generate("3. doubles", doubles);
		generate("4. strings", strings);
		generate("5. objects", objects);
	}
	
    // Cho phép truyền vào 1 list of elements (kiểu dữ liệu bất kì, đối tượng)
	// List<?> = List<T>
	// generic type T --> extends
	// generic wildcard: ? --> extends, super 
	// extends X --> X hoặc con của X
	// super X --> X hoặc cha của X
	public static <T extends Number> void generate(String prefix, List<?> collection) {
		System.out.println(prefix + " --> ");
		for (Object item: collection) {
			System.out.println("+ " + item);
		}
		System.out.println();
	}
}
