package utils;

import java.util.Collection;

public class IoUtils {
	
	private IoUtils() {
		
	}
	
	public static <E> void generate(String title, Collection<E> elements) {
		System.out.println(title + "{\n");
		for (E element : elements) {
			System.out.println("    + " + element);
		}
		System.out.println("}\n");
	}

}
