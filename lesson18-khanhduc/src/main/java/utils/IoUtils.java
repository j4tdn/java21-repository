package utils;

import java.util.Collection;

public class IoUtils {
	
	private IoUtils() {
	}
	
	
	public static <E> void generate(String prefix, Collection<E> elements) {
		System.out.println(prefix + "{\n");
		for(E element : elements) {
			System.out.println("  +"+element);
		}
		System.out.println("}\n");
	}

}