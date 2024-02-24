package utils;

public class PrintUtils {
	public static <T> void print(String prefix, Iterable<T> elements) {
		System.out.println("\n" + prefix);
		System.out.println("===============================");
		elements.forEach(System.out::println);
		System.out.println("===============================");
	}
}