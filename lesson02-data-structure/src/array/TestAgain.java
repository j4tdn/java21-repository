package array;

import java.util.Arrays;

public class TestAgain {

	//1. Tìm những phần tử lẻ trong mảng số nguyên
	//	Input: Mảng
	//	Output: Mảng số lẻ
	public static void main(String[] args) {
	String[] students = {"Peter Croud", "KaKa", "Valdes", "Patrick Veira"};
	filter(students);
	System.out.println(Arrays.toString(filter(students)));
	
	}
	
	private static String[] filter(String[] elements) {
		String[] result = new String[elements.length];
		int count = 0;
		
		for(String element: elements) {
			if(element.startsWith("P")) {
				result[count] = element;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

}
