package utils;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

import bean.Apple;

import java.util.Set;


public class StreamUtils {
	private StreamUtils() {
		
	}
	public static <T> List<T> filter(List<T> elements, Predicate<T> predicate){
		var result = new ArrayList<T>();
		for(T element : elements) {
			if(predicate.test(element)) {
				result.add(element);
			}
		}
		return result;
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

