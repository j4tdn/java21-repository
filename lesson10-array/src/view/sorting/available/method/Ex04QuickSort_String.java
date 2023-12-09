package view.sorting.available.method;

import static java.util.Comparator.*;
import static java.util.Comparator.nullsFirst;
import static java.util.Comparator.reverseOrder;
import static utils.ArrayUtils.generate;

import java.util.Arrays;
import java.util.function.Function;

import Bean.Item;
import model.DataModel;

public class Ex04QuickSort_String {

	public static void main(String[] args) {

		String[] sequences = { "A1", "Z7", "K8", "E9", "B2" };

		Arrays.sort(sequences);
		generate("1. Sort sequences asc", sequences);

		Arrays.sort(sequences, (s1, s2) -> s1.compareTo(s2));
		generate("2. Sort sequences desc", sequences);
		
		String[] sequencesWithNullValues = {null, "A1", null, "Z7", "K8", "E9", "B2", null };
		
		Arrays.sort(sequencesWithNullValues, nullsLast(comparing(Function.identity(), reverseOrder())) );
		generate("3. Sort sequences desc, null last", sequencesWithNullValues);

	}
}
