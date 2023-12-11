package view;

import java.util.Arrays;
import static java.util.Comparator.*;
public class Ex04Sorting {

	public static void main(String[] args) {
	String[] sequences = {"-2", "-6", "10", null, "4", "41",
			"8", null, "special", "a", "c", "b", "xx"};
	
	//Arrays.sort(sequences, 
	//	nullsLast(comparing(s -> s)));
		
	Arrays.sort(sequences, (s1,s2) -> {
		if(s1 == null) {
			return 1;
		}
		if(s2 == null) {
			return -1;
		}
		
		if(s1.equals("special")) {
			return -1;
		}
		if(s2.equals("special")) {
			return 1;
		}
		
		try {
			Integer i1 = Integer.parseInt(s1);
			Integer i2 = Integer.parseInt(s2);
			return i1.compareTo(i2);
		} catch (Exception e) {
			return s1.compareTo(s2);
		}
		}
	);
	
	
	System.out.println(Arrays.toString(sequences));
	
	}
}


