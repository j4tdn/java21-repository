package utils;

import java.util.Arrays;

import bean.Item;
import common.SortType;

public class ArrayUtils {

	private ArrayUtils() {
	}
	
	public static void sort(int[] elements, SortType sortType) {
		Arrays.sort(elements);
		if (sortType == SortType.DESC) {
			reverse(elements);
		}
	}
	
	public static void reverse(int[] elements) {
		for (int i = 0; i < elements.length / 2; i++) {
			swap(elements, i, elements.length - i - 1);
		}
	}
	
	public static void generate(String prefix, Item... elements) {
		System.out.println(prefix + " --> " + Arrays.toString(elements) + "\n");
	}
	
	public static void generate(String prefix, String... elements) {
		System.out.println(prefix + " --> " + Arrays.toString(elements) + "\n");
	}
	
	public static void generate(String prefix, int... elements) {
		System.out.println(prefix + " --> " + Arrays.toString(elements) + "\n");
	}

	public static void copy(int[] origin, int[] target) {
		for (int i = 0; i < origin.length; i++) {
			target[i] = origin[i];
		}
	}
	
	public static void swap(int[] elements, int i, int j) {
		int temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
	
	public static void swap(String[] elements, int i, int j) {
		String temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
	
	public static void swap(Item[] elements, int i, int j) {
		Item temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
}