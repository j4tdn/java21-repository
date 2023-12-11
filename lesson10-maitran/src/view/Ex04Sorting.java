package view;

import java.util.Arrays;

import static utils.ArrayUtils.*;

public class Ex04Sorting {
	public static void main(String[] args) {
		String[] sequences = { "-2", "-6", "10", null, "4", "41", "8", null, "special", "a", "c", "b", "xx" };

		// Special, -6, -2, 4, 8, 10, a, b, c, xx, null, null

		Arrays.sort(sequences, (s1, s2) -> {
			if (s1 == null) {
				return 1;
			}
			if (s2 == null) {
				return -1;
			}
			if (s1.equals("special")) {
				return -1;
			}
			if (s2.equals("special")) {
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

		generate("1. Sort", sequences);
		
		// Giảm dần: null, null, xx, c, b, a, 10, 8, 4, -2, -6, Special
		Arrays.sort(sequences, (s1, s2) -> {
			if(s1 == null) {
				return -1;
			}
			if(s2 == null) {
				return 1;
			}
			if(s1.equals("special")) {
				return 1;
			}
			if(s2.equals("special")) {
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
		generate("2. Sort[des]", sequences);
	}

}
