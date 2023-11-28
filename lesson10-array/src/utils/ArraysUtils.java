package utils;

import java.util.Arrays;

public class ArraysUtils {

	private ArraysUtils() {
	}

	public static void generate(String prefix, int... element) {
		System.out.println(prefix + "--> " + Arrays.toString(element) + "\n");
	}

	public static void copy(int[] origin, int[] target) {
		for (int i = 0; i < origin.length; i++) {
			target[i] = origin[i];
		}
	}
}
