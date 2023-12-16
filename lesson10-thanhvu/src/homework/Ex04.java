package homework;

import static utils.ArrayUtils.*;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {

	public static void main(String[] args) {
		String[] strings = { "-2", "-6a", "a10", null, "4", "8", "41", null, "Special", "a", "c", "b", "xx" };
		Arrays.sort(strings, (s1, s2) -> {
			if (s1 == null) {
				return 1;
			}
			if (s2 == null) {
				return -1;
			}

			if (s1.equals("Special")) {
				return -1;
			}
			if (s2.equals("Special")) {
				return 1;
			}

			try {
				Integer i1 = Integer.parseInt(s1);
				Integer i2 = Integer.parseInt(s2);
				return i1.compareTo(i2);
			} catch (NumberFormatException e) {
				return s1.compareTo(s2);
			}

		});

		generate("1. Sort asc", strings);
		
		Arrays.sort(strings, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}

			if (s1.equals("Special")) {
				return 1;
			}
			if (s2.equals("Special")) {
				return -1;
			}

			try {
				Integer i1 = Integer.parseInt(s1);
				Integer i2 = Integer.parseInt(s2);
				return i2.compareTo(i1);
			} catch (NumberFormatException e) {
				return s2.compareTo(s1);
			}

		});

		generate("1. Sort desc", strings);

	}
}
