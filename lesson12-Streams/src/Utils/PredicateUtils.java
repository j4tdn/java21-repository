package Utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;

public class PredicateUtils {

	private PredicateUtils() {

	}

	
	// hàm đã có sẵn của JAVA
	public static <E> List<E> filter(List<E> elements, Predicate<E> predicate) {
		var result = new ArrayList<E>();

		for (var element : elements) {
			if (predicate.test(element)) {
				result.add(element);
			}
		}
		return result;

	}

	public static <E> void generate(String prefix, Collection<E> collection) {
		System.out.println(prefix + " -->");
		for (E item : collection) {
			System.out.println("+ " + item);
		}
		System.out.println();
	}

	public static void generateString(String prefix, Collection<String> collection) {
		System.out.println(prefix + " -->");
		for (String string : collection) {
			System.out.println("+ " + string);
		}
		System.out.println();
	}

}
