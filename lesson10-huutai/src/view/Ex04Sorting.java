package view;

import java.util.Arrays;

import utils.ArraysUtils;

public class Ex04Sorting {
	public static void main(String[] args) {
		String[] sequences = {"-2", "-6", "-10", null, "4", "41", "8", null, "special", "a", "b", "xxs"};
		
		sortAsc(sequences);
		ArraysUtils.generate("1. Sort[asc] null last", sequences);
		
		sortDesc(sequences);
		ArraysUtils.generate("2. Sort[desc] null first", sequences);
	}
	
	private static String[] sortAsc(String[] sequences) {
		Arrays.sort(sequences, (s1, s2) -> {
			// null last
			if(s1 == null) {
				return 1;
			}
			if(s2 == null) {
				return -1;
			}
			
			if("special".equals(s2)) {
				return 1;
			}
			if("special".equals(s1)) {
				return -1;
			}
			
			if(s2.matches("^-?\\d+$")) {
				if(s1.matches("^-?\\d+$")) {
					return Integer.parseInt(s1) - Integer.parseInt(s2);
				}
				return 1;
			} else {
				return s1.compareTo(s2);
			}
		});
		return sequences;
	}
	
	private static String[] sortDesc(String[] sequences) {
		Arrays.sort(sequences, (s1, s2) -> {
			// null first
			if(s1 == null) {
				return -1;
			}
			if(s2 == null) {
				return 1;
			}
			
			if("special".equals(s1)) {
				return 1;
			}
			if("special".equals(s2)) {
				return -1;
			}
			
			if(s2.matches("^-?\\d+$")) {
				if(s1.matches("^-?\\d+$")) {
					return Integer.parseInt(s2) - Integer.parseInt(s1);
				}
				return -1;
			} else {
				return s2.compareTo(s1);
			}
		});
		return sequences;
	}
}
