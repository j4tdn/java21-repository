package utils;

import java.util.Arrays;

import Bean.Item;

public class ArrayUtils {
	
	private ArrayUtils() {
	}

	public static void generate(String prefix, int... elements) {
		System.out.println(prefix + "-->" + Arrays.toString(elements) + "\n");
	}
	
	public static void generate(String prefix, String... elements) {
		System.out.println(prefix + "-->" + Arrays.toString(elements) + "\n");
	}
	
	public static void generate(String prefix, Item... elements) {
		System.out.println(prefix + "-->\n" + Arrays.toString(elements) + "\n");
	}
	
}
