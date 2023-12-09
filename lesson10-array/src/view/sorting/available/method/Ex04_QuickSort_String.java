package view.sorting.available.method;

import static utils.ArrayUtils.*;

import java.util.Arrays;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Ex04_QuickSort_String {
	public static void main(String[] args) {
		String[] sequences = {"A1", "Z7", "K8", "E9", "B2"};
		
		Arrays.sort(sequences);
		generate("1. Sort sequences", sequences);
		
		Arrays.sort(sequences, (s1, s2) -> s2.compareTo(s1));
		generate("2. Sort sequences desc", sequences);
		
		String[] sequencesWithNullValues = {null, "A1", "Z7",null, null, "K8", "E9", "B2"};
		
		Arrays.sort(sequencesWithNullValues, (s1, s2) -> {
			if(s1 == null) {
				return -1;
			}
			if(s2 == null) {
				return 1;
			}
			return s2.compareTo(s1);
		});
		generate("3. Sort sequences desc and null first", sequencesWithNullValues);
	
		Arrays.sort(sequencesWithNullValues, nullsLast(comparing(Function.identity(), reverseOrder()))); // Function.identity() = s -> s
		generate("4. Sort sequences desc null last", sequencesWithNullValues);
	}
}
