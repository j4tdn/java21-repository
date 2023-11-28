package utils;

import java.util.Arrays;

import bean.Item;

public class ArrayUtils {

	private ArrayUtils() {
	}
	
	public static void generate(String prefix, int...elements) {
		System.out.println(prefix + " -> " + Arrays.toString(elements));
	}
	
	public static void generate(String prefix, String...elements) {
		System.out.println(prefix + " -> " + Arrays.toString(elements));
	}
	
	public static void generate(String prefix, Item...elements) {
		System.out.println(prefix + " -> " + Arrays.toString(elements));
	}
	
	public static void swap(int[] elements, int a, int b) {
		int temp = elements[a];
		elements[a] = elements[b];
		elements[b] = temp;
	}
	
	public static void swap(String[] elements, int a, int b) {
		String temp = elements[a];
		elements[a] = elements[b];
		elements[b] = temp;
	}
	
	public static void swap(Item[] items, int a, int b) {
		Item temp = items[a];
		items[a] = items[b];
		items[b] = temp;
	}
}
