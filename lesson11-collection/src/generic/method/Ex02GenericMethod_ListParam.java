package generic.method;

import java.util.List;

public class Ex02GenericMethod_ListParam {

	public static void main(String[] args) {
		List<Integer> ints = List.of(1, 2, 3, 4, 5);
		List<Long> longs = List.of(11L, 22L, 33L, 44L, 55L);
		List<Double> doubles = List.of(1.1D, 2.2D, 3.3D, 4.4D, 5.5D);
		List<String> strings = List.of("a", "b", "c", "d", "e");
		List<Object> objects = List.of("a", 1, 11L, 1.1D);
		
//		generateObject("1. Ints", ints);
//		generateObject("2. Longs", longs);
//		generateObject("3. Doubles", doubles);
//		generateObject("4. Strings", strings);
		generateObject("5. Objects", objects);


		System.out.println("=========== With Generic Type ============");

		generate("1. Ints", ints);
		generate("2. Longs", longs);
		generate("3. Doubles", doubles);
//		generate("4. Strings", strings);
//		generate("5. Objects", objects);

	}

	// List<Object> --> KDL List -- > tham số truyền vào Object
	// List<Integer> --> KDL List -- > tham số truyền vào Integer
	// --> List<Object> và List<Integer> đều là KDL List với tham số truyền vào khác nhau
	// --> chúng ko phải cha con

	// List<Object> có thể là cha của ArrayList<Object> và LinkedList<Object>

	public static void generateObject(String prefix, List<Object> collection) {
		System.out.println(prefix + " --> ");
		for (Object item : collection) {
			System.out.println("+ " + item);
		}
		System.out.println();
	}
	
	// <T> cho phép truyền bất kỳ KDL đối tượng nào vào
	// <T extends Number>: T cho phép truyền vào KDL đối tượng là Number hoặc con của Number
	//                   : giới hạn trên
	public static <T extends Number> void generate(String prefix, List<T> collection) {
		System.out.println(prefix + " --> ");
		for (T item : collection) {
			System.out.println("+ " + item);
		}
		System.out.println();
	}
}
