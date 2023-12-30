package utils;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import bean.Item;

public class CollectionUtils {
	private CollectionUtils() {
		
	}
	
	public static void generate(String prefix, Collection<Item> collection) {
		System.out.println(prefix  + "-->");
		for (Item item : collection) {
			System.out.println(item);
		}
		System.out.println();
	}
	
	public static void generateString(String prefix, Collection<String> collection) {
		System.out.println(prefix  + "-->");
		for (String item : collection) {
			System.out.println(item);
		}
		System.out.println();
	}
	public static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix + "{");
		Set<Entry<K, V>> entries = map.entrySet();
		for (Entry<K, V> entry:entries) {
			System.out.println(" " + entry.getKey() + "-->" + entry.getValue());
		}
		System.out.println("}");
	}
	
	
}
