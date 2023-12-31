package utils;

import java.util.Arrays;

import bean.Item;
import common.SortType;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	public static void generate(String prefix, int[] elements) {	
		System.out.println(prefix+"-->" + Arrays.toString(elements) + "\n");
		
	}
	public static void generate(String prefix, String... elements) {	
		System.out.println(prefix+"-->" + Arrays.toString(elements) +"\n");
		
	}
	public static void generate(String prefix, Item[] elements) {	
		System.out.println(prefix);
		for(Item item:elements) {
			System.out.println(item);
		}
		
	}
	public static void sort(int[] elements, SortType sortType) {
		Arrays.sort(elements);
		if(sortType == SortType.DESC) {
			reverse(elements);
		}
	}
	public static void reverse(int[] elements) {
		for(int i = 0; i < elements.length / 2; i++) {
			swap(elements, i, elements.length-i-1);
		}
	}
	public static void swap(Item[] items, int a, int b) {
		Item temp = items[a];
		items[a] = items[b];
		items[b] = temp;
	}
	public static void swap(int[] items, int a, int b) {
		int temp = items[a];
		items[a] = items[b];
		items[b] = temp;
	}
}