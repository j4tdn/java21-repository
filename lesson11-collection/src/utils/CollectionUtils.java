package utils;

import java.util.Collection;

import bean.Item;

public class CollectionUtils {
	
	private CollectionUtils() {	
	}
	
	public static void generate(String prefix, Collection<Item> collection) {
		System.out.println(prefix + " --> ");
		for (Item item: collection) {
			System.out.println("+ " + item);
		}
		System.out.println();
	}
	
}
