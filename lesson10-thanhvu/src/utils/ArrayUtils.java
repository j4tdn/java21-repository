package utils;

import java.util.Arrays;

public class ArrayUtils {
	
	private ArrayUtils() {

	}

	public static void generate(String prefix, int... arr) {
		System.out.println("\n" + prefix + " --> " + Arrays.toString(arr));
	}

	public static void generate(String prefix, String... arr) {
		System.out.println("\n" + prefix + " --> " + Arrays.toString(arr));
	}
}
