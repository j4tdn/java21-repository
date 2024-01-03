package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;

import bean.Apple;

public class CollectionUtils {
	
	private CollectionUtils() {	
	}
	
	private static <T> List<T> filter(List<T> elements, Predicate<T> predicate){
		var result = new ArrayList<T>();
		
		for(var element : elements) {
			if(predicate.test(element)) {
				result.add(element);
			}
		}
		
		return result;
	}
	
	public static <E> void generate(String prefix, Collection<E> collection) {
		System.out.println(prefix + " --> ");
		for (E e: collection) {
			System.out.println("+ " + e);
		}
		System.out.println();
	}
	
	public static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix + " {");
		Set<Entry<K, V>> entries = map.entrySet();
		for (Entry<K, V> entry: entries) {
			System.out.println("    " + entry.getKey() + " --> " + entry.getValue());
		}
		System.out.println("}\n");
	}
	
}