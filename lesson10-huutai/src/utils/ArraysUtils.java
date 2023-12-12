package utils;

import java.util.Arrays;

public class ArraysUtils {
	
	private ArraysUtils() {
	}
	
	public static void generate(String prefix, String...elements) {
		System.out.print(prefix + " -> " + Arrays.toString(elements) + "\n");
	}
	
	public static void generate(String prefix, int...elements) {
		System.out.print(prefix + " -> " + Arrays.toString(elements) + "\n");
	}
}
