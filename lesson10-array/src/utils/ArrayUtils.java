package utils;

import java.util.Arrays;

import bean.Item;
import common.SortType;

public class ArrayUtils {
	private ArrayUtils() {

	}

	public static void generate(String prefix, String... elements) {
		System.out.println(prefix + "-->" + Arrays.toString(elements) + "\n");
	}
	public static int[] copy(int[] origin,int[] target) {
		for(int i=0;i<origin.length;i++) {
			target[i]=origin[i];
		}
		return target;
	}
	
	public static void sort(int[] elements,SortType sorttype) {
		Arrays.sort(elements);
		if(sorttype == SortType.DESC) {
			reverse(elements);
		}
	}
	public static void reverse(int[] element) {
		for (int i = 0;i< element.length /2;i++) {
			swap(element,i,element.length-i-1);
		}
	}
	private static void swap(int[] elements, int i, int j) {
		int temp= elements[i];
		elements[i]= elements[j];
		elements[j] = temp;
	}
	public static void printItems(Item[] arr) {
		for (Item employee : arr) {
			System.out.print(employee + " ");
		}
		System.out.println();
	}
}
