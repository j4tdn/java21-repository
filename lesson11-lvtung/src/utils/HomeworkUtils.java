package utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HomeworkUtils {
	
	private HomeworkUtils() {
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
		for (Entry<K, V> entry : entries) {
			System.out.println("   " + entry.getKey() + " --> " + entry.getValue());

		}
		System.out.println("}\n");
	}
	
	public static BigDecimal bd(Number number) {
		if(number == null) {
			return null;
		}
		return new BigDecimal(number.toString());
	}

}
