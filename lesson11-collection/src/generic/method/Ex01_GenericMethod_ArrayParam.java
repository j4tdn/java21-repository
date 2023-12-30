package generic.method;

import java.util.Arrays;

public class Ex01_GenericMethod_ArrayParam {
	public static void main(String[] args) {
		Integer[] ints = { 1, 2, 3, 4, 5 };
		Long[] longs = { 11L, 22L, 33L, 44L, 55L };
		Double[] doubles = { 1.1d, 2.2d, 3.3d, 4.4d, 5.5d };
		String[] strings = { "a", "b", "c", "d", "e" };
		
		generate("1. Ints", ints);
		generate("2. Longs", longs);
		generate("3. Doubles", doubles);
		generate("4. Strings", strings);
	}
	
	public static void generateObject(String prefix, Object[] objects) {
		System.out.println(prefix + " --> " + Arrays.toString(objects) + "\n");
	}
	
	public static <Element> void generate(String prefix, Element[] elements) {
		System.out.println(prefix + " --> " + Arrays.toString(elements) + "\n");
	}
	
	
	
}
