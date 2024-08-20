package utils;

import java.util.Collection;
import java.util.List;

public class IoUtils {
	
	private IoUtils() {
	}
	
	public static <E> void generate(String title, E givenElement) {
		if (givenElement == null) {
			System.out.println(title + " {");
			System.out.println("   + " + givenElement);
			System.out.println("}\n");
			return;
		}
		
		System.out.println(title + " {");
		for (E element: List.of(givenElement)) {
			System.out.println("   + " + element);
		}
		System.out.println("}\n");
	}
	
	public static <E> void generate(String title, Collection<E> elements) {
		System.out.println(title + " {");
		for (E element: elements) {
			System.out.println("   + " + element);
		}
		System.out.println("}\n");
	}
	
}