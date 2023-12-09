package view.sorting.ad;
import static untils.ArrayUtils.*;
import static java.util.Comparator.*;
import java.util.Arrays;
import java.util.function.Function;
public class Ex04QuickSort_String {
	public static void main(String[] args) {
		
	String [] sequences = {"A1", "Z7", "K8", "E9", "B2", 	};
	
	String [] sequencesNull = {"A1", null, "Z7", "K8", null, "E9", "B2",null 	};
	
		Arrays.sort(sequences);
	
	generate("1. Sort sequences asc", sequences);
		
		Arrays.sort(sequences, (s1, s2) -> s2.compareTo(s1));		// giảm dần dùng sort (T[])

	generate("2. Sort sequences desc", sequences);
	
	Arrays.sort(sequencesNull, (s1, s2) ->{
		if (s1 == null) {
			return -1;
			
		}
		if 	 (s2 == null) {
			return 1;
		}
		return s2.compareTo(s1);
	});
	
	generate("3. Sort sequences desc, null first", sequencesNull);
	
	
	// String -> String 
	//Function<T, R> = s-> s;
	//Function <T,R> = Function.identuty();
	Arrays.sort(sequencesNull,
			nullsLast(comparing(Function.identity(),reverseOrder()))
			);
	
	generate("4. Sort sequences desc, null last", sequencesNull);
	}
}
