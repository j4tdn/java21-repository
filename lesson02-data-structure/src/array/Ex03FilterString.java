package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex03FilterString {
	
	public static void main(String[] args) {
		String[] students = {"Pu", "Bin", "Sushi", "Pom"};
		System.out.println(Arrays.toString(getStudents(students)));
	}

	private static String[] getStudents(String[] elements) {
		int count = 0;
		String[] result = new String[elements.length];
		for (String element: elements) {
			if(element.startsWith("P")) {
				result[count] = element;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
