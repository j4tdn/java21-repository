package utils;


import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import bean.Item;
public class CollectionUtils {
	private CollectionUtils() {
		
	}
	
	public static <E> void generate(String prefix, Collection<E> collection) {
		System.out.println(prefix + " --> ");
		for(E item: collection) {
			System.out.println("+" + item);
		}
	}
	
	
	public static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix + " {");
		Set<Entry<K, V>> entries = map.entrySet();
		for(java.util.Map.Entry<K, V> entry: entries) {
			System.out.println("   " + entry.getKey() + " --> " + entry.getValue());
		}
		System.out.println("}\n");
	}
}
