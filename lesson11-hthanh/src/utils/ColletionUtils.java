package utils;

import java.util.Collection;

public class ColletionUtils {

	public ColletionUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static void generateString(String prefix, Collection<String> collection) {
		System.out.println(prefix + " --> ");
		for (String item: collection) {
			System.out.println("+ " + item);
		
		System.out.println();
	}}
}
