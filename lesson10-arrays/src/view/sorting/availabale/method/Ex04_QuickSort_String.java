package view.sorting.availabale.method;
import static utils.ArrayUtils.*;
import java.util.Arrays;
import java.util.function.Function;

public class Ex04_QuickSort_String {
	public static void main(String[] args) {
		String[] sequences = {"A1", "Z7", "K8", "E9", "B2"};
		
		Arrays.sort(sequences);
		generate("1. Sort asc", sequences);
		
		Arrays.sort(sequences, (s1, s2) -> s2.compareTo(s1));
		generate("1. Sort desc", sequences);
		
		String[] sequencesnull = {"A1",null, "Z7", "K8",null, "E9", "B2"};
		
		Arrays.sort(sequencesnull, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			return s2.compareTo(s1);
		});
		generate("3. Sort null first", sequencesnull);
		
		Arrays.sort(sequencesnull,
				nuLLsast(comparing(Function.identity(), reverseOrder())));
	}
}
