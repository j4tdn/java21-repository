package view.sorting.available.method;

import static java.util.Comparator.*;
import static utils.ArrayUtils.*;

import java.util.Arrays;
import java.util.function.Function;

import bean.Item;

public class Ex04QuickSort_String {

	public static void main(String[] args) {
		String[] sequences = { "A1", "Z7", "K8", "E9", "B2" };

//		sort(sequences, (s1, s2) -> {
//			// process null elements(e.g null first)
//			if (s1 == null) {
//				return -1;
//			}
//			if (s2 == null) {
//				return 1;
//			}
//			// process non-null elements(e.g ascending)
//			return s1.compareTo(s2);
//		});

		Arrays.sort(sequences);
		generate("1. Sort sequences asc", sequences);

		Arrays.sort(sequences, (s1, s2) -> s2.compareTo(s1));

		generate("2. Sort sequences desc", sequences);

		String[] sequencesWillNullValues = { "A1", null, "Z7", "K8", "E9", "B2" };

		Arrays.sort(sequencesWillNullValues, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			return s2.compareTo(s1);
		});
		generate("3. Sort sequences desc, null first", sequencesWillNullValues);

		//string -> string
		// Function<T, R> = s -> s;
		// Function<T, R> = Function.identity();
		
		Arrays.sort(sequencesWillNullValues, nullsLast(comparing(Function.identity(), reverseOrder())));
		
		generate("4. Sort sequences desc, null last", sequencesWillNullValues);

		
	}
}





