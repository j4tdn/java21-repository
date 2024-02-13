package array;

import java.util.Arrays;

public class Ex03FilterString {

	public static void main(String[] args) {
		String[] students = {"Peter Croud", "KaKa", "Valdes", "Patrick Veira"};
		
		System.out.println(Arrays.toString(getStudents(students)));
		
	}

//	private static String[] getStudents(String[] elements) {
//		String[] result = new String[elements.length];
//		int count = 0;
//		for(String element: elements) {
//			// startsWith: kiểm tra chuỗi bắt đầu bằng một chuỗi con cụ thể
//			if(element.startsWith("P")) {
//				result[count] = element;
//				count++;
//			}
//		}
//		//trả về mảng có số phần tử chạy từ [a, b)
//		return Arrays.copyOfRange(result, 0, count);
//	}
	
	private static String[] getStudents(String[] elements) {
		String[] result = new String[elements.length];
		int count = 0;
		for(String element:elements) {
			if(element.startsWith("P")) {
				result[count] = element;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	
}
