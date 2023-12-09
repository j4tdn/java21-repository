package view;

import java.util.Arrays;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Ex04Sorting {

		public static void main(String[] args) {
			String [] sequences =
				{"-2", "-6", "10", null, "4","41", "8", null, "special", "a", "c", "b", "xx"};
			Arrays.sort(sequences, (s1, s2) ->{
			if (s1 == "special") {
				return -1;
			}
			if (s2 == "special") {
				return 1;
			}
			if (s1 == null) {
				return -1;
			}
			if 	 (s2 == null) {
				return 1;
			}
			try {
				Integer num1 = Integer.parseInt(s1);
	            Integer num2 = Integer.parseInt(s2);
	            return num1.compareTo(num2);
			} catch (Exception e) {
				return s1.compareTo(s2);
			}
			
		});
			
			generate("1. sắp xếp tăng dần", sequences);
			
			
			
			/*
			 * Arrays.sort(sequences, nullsFirst(comparing(Function.identity(),
			 * reverseOrder()))); generate("2. sắp xếp giảm dần", sequences);
			 */
		}
		
		
		public static void generate(String prefix, String... elements) {
			System.out.println(prefix + " --> " + Arrays.toString(elements) + "\n");
		}
}
