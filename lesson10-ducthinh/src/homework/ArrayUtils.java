package homework;

import java.util.Arrays;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	public static void generate(String prefix, int...arr) {
		System.out.println("prefix --> " + Arrays.toString(arr));
	}
}
