package structure.array;

import java.util.Arrays;

public class Ex03FilterString {
	public static void main(String[] args) {
		String[] students = {"Dao", "Hieu", "Thuy", "Thu"};
		System.out.println(Arrays.toString(getStudents(students)));
	}
	
	
	private static String[] getStudents(String[] elements) {
		String[] result = new String[elements.length];
		int count = 0;
		for (String element: elements) {
			if (element.startsWith("T")) {
				result[count] = element;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
