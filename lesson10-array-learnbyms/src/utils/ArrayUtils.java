package utils;

import java.util.Arrays;

public class ArrayUtils {
	public static void generate(String prefix, int... elements) {
		System.out.println(prefix + " --> " + Arrays.toString(elements) + "\n");
	}
}
