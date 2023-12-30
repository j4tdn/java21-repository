package generic.method;

import java.util.Arrays;

public class Ex01GenericMethod_ArrayParam {
	
	public static void main(String[] args) {
		Integer[] ints = { 1, 2, 3, 4, 5 };
		Long[] longs = { 11L, 22L, 33L, 44L, 55L };
		Double[] doubles = { 1.1D, 2.2D, 3.3D, 4.4D, 5.5D };
		String[] strings = { "a", "b", "c", "d", "e" };
		
		generateObject("1. Ints", ints);
		generateObject("2. Longs", longs);
		generateObject("3. Doubles", doubles);
		generateObject("4. Strings", strings);
		
		System.out.println("=========== With Generic ============");
		
		generate("1. Ints", ints);
		generate("2. Longs", longs);
		generate("3. Doubles", doubles);
		generate("4. Strings", strings);
	}
	
	public static void generateObject(String prefix, Object[] objects) {
		System.out.println(prefix + "-->" + Arrays.toString(objects) + "\n");
	}
	
	public static <E> void generate(String prefix, E[] elements) {
		System.out.println(prefix + "-->" + Arrays.toString(elements) + "\n");
	}
}
