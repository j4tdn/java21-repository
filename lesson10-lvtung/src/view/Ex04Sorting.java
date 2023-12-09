package view;

import java.util.Arrays;

public class Ex04Sorting {
	public static void main(String[] args) {
		// Tăng dần: Special => số âm tăng dần => số dương tăng dần => chuỗi tăng dần
		
		// Giảm dần: Giảm dần các chuỗi trong mảng => số dương giảm dần => số âm giảm
		// dần => Special
		
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		
		Arrays.sort(strings, (s1, s2) -> {
			
			if(s1 == "Special") {
				return -1;
			}
			if (s2 == "Special") {
				return 1;
			}
			
			if(s1 == null) {
				return 1;
			}
			
			if(s2 == null) {
				return -1;
			}
			
			try {
				Integer num1 = Integer.parseInt(s1);
	            Integer num2 = Integer.parseInt(s2);
	            return num1.compareTo(num2);
			} catch (Exception e) {
				return s1.compareTo(s2);
			}
			
		});
		
		System.out.println(Arrays.toString(strings));

	}
}
