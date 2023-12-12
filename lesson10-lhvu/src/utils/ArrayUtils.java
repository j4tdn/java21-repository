package utils;

import java.util.Arrays;

import bean.Item;

public class ArrayUtils {
	public ArrayUtils() {
		// TODO Auto-generated constructor stub
	}
	public static void generate(String prefix, Item... elements) {
		System.out.println(prefix + " --> " + Arrays.toString(elements) + "\n \n");
	}
	public static void generate(String prefix, String... elements) {
		System.out	.println(prefix + " --> " + Arrays.toString(elements) + "\n");
	}
}
