package datastructure.array;

import java.util.Arrays;

public class Ex04FilterString {
	public static void main(String[] args) {
		String[] students = {"Perter Croud", "kaka", "Valdes", "Patrick Veira"};
		
		System.out.println(Arrays.toString(getStudents(students)));
	}
	
	private static String[] getStudents(String[] elements) {
		String[] result = new String[elements.length];
		int count = 0;
		for(String element: elements) {
			if(element.startsWith("P")) {
				result[count] = element;
				count++;
			} 
		}
		
		return Arrays.copyOfRange(result, 0, 2);
	}
}
