package view.sorting.available.method;
import static utils.ArraysUtils.*;

import java.util.Arrays;
import java.util.function.Function;

import static java.util.Comparator.*;
public class Ex04QuickSort_String {

	public static void main(String[] args) {
		String[] sequences = {"A1", "Z7", "K8", "E9", "B2"};
		
		Arrays.sort(sequences);
		generate("1. Sort sequences asc", sequences);

		Arrays.sort(sequences, (s1,s2) -> s2.compareTo(s1));
		generate("2. Sort sequences des", sequences);

		String[] sequencesWithNullValue = {"A1", null, "Z7", "K8",null, "E9", "B2"};

		Arrays.sort(sequencesWithNullValue, (s1, s2) -> {
			if(s1 == null) {
				return -1;
			}
			if(s2 == null) {
				return 1;
			}
			return s2.compareTo(s1);
		});
		generate("3. Sort sequences des, null first", sequencesWithNullValue);

		// string -> string
		// Function<T, R> = s -> s
		// Function<T< R> = Function.identity()
		
		Arrays.sort(sequencesWithNullValue, 
				nullsLast(comparing(Function.identity(), reverseOrder()))
				);
		
		generate("3. Sort sequences des, null last", sequencesWithNullValue);
		
		
		
		
	}
}
