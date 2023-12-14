package homework;

import java.util.Arrays;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	public static void generate(String prefix, int...arr) {
		System.out.println("\n" + prefix + "-->" + Arrays.toString(arr));
	}
	public static void generate(String prefix, int a) {
		System.out.println("\n" + prefix + "-->" + a);
	}
	public static void generate(String prefix, Item... a) {
		System.out.println(prefix);
		for(Item item:a) {
			System.out.println(item);
		}
	}
	public static void generate(String prefix, String...arr) {
		System.out.println("\n" + prefix + "-->" + Arrays.toString(arr));
	}
}
