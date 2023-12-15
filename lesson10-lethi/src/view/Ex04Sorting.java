package view;

import static utils.ArrayUtils.*;
import java.util.Arrays;
import java.util.Comparator;

public class Ex04Sorting {

	public static void main(String[] args) {
		
		String[] sequences = {"-2", "-6", "10", null, "4", "41", "8", null, 
				              "Special", "a", "c", "b", "xx"};
		
		
		Arrays.sort(sequences, Comparator.nullsLast((s1, s2) -> {
			
			if(s1 == null) {
				return 1;
			}
			
			if(s2 == null) {
				return -1;
			}
			
			if("Special".equals(s1)) {
				return -1;
			}
			
			if("Special".equals(s2)) {
				return 1;
			}	
			
			if(isInteger(s1) && isInteger(s2)) {
				return Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2));
			}
			
			return s1.compareTo(s2);
		}));
		
		System.out.println("Asc sorted (nullLast): ");
        for (String sequence : sequences) {
            System.out.print(sequence + " ");
        }
        
        System.out.println("\n===============================================g");
        
		Arrays.sort(sequences, Comparator.nullsFirst((s1, s2) -> {

			if (s1 == null) {
				return -1;
			}

			if (s2 == null) {
				return 1;
			}

			if ("Special".equals(s1)) {
				return 1;
			}

			if ("Special".equals(s2)) {
				return -1;
			}

			if (isInteger(s1) && isInteger(s2)) {
				return Integer.compare(Integer.parseInt(s2), Integer.parseInt(s1));
			}

			return s2.compareTo(s1);
		}));

		System.out.println("Desc sorted (nullFirst): ");
		for (String sequence : sequences) {
			System.out.print(sequence + " ");
		}
		
	}
	
	private static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}
	
}
