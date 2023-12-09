package view.sorting.available.method;

import static utils.ArrayUtils.*;

import java.util.Arrays;

public class Ex04_QuickSort_String {

	public static void main(String[] args) {
		
		String[] sequences = {"A1", "Z7", "K8", "E9", "B2"};
		
		
		Arrays.sort(sequences);
		generate("1. Sort sequences asc", sequences);
		
		Arrays.sort(sequences, (s1, s2) -> s2.compareTo(s1));
		generate("2. Sort sequences desc", sequences);
		
		
		Arrays.sort(sequences, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
				return s2.compareTo(s1);
		});
		
		String[] sequencesWithNull = {"A1", null, "Z7", "K8", null, "E9", "B2", null};
		
		Arrays.sort(sequencesWithNull, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
				return s2.compareTo(s1);
		});
		
		generate("3. Sort sequences desc, null first", sequencesWithNull);
 	}
}
