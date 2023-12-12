package view.sorting;

import static utils.ArrayUtils. *;

import functional.Compare_String;

public class Ex02BubbleSort_String {
	public static void main(String[] args) {
		/*
		 * Sorting with [non]-null values
		 * + null first/last
		 * 		null first --> null < non-null
		 * 		null last  --> null > non-null
		 */
		String[] elements = {"a1", "k7", "bzt282", "115", "h15", "d22", "76"};
		generate("String is unsort", elements);
		sortAsc(elements, (s1, s2)->{
			// process null elements(vd null first)	
			if(s1 == null) {
				return -1;
			}
			if(s1 == null) {
				return 1;
			}
			return s1.compareTo(s2);
			// process null elements(vd null first)	
			
		});
		generate("String is ascending", elements);
		
		sortAsc(elements, (s1, s2)->{
			if(s1 == null && s2 != null) {
				return 1;
			}
			if(s2 == null) {
				return -1;
			}
			return s2.compareTo(s1);
		});
		generate("String is descending", elements);
	}
	
	// String implements CharSequece, Comparable<String>, Serializable
	public static void sortAsc(String[] elements, Compare_String compareString) {
		for(int i = 0; i < elements.length; i++) {
			for(int j = 0; j < elements.length - 1 - i; j++) {
				if(compareString.compare(elements[j], elements[j+1])>0) {
					swap(elements, j, j+1);
				}
			}
		}
	}
	public static void swap(String[] elements, int a, int b) {
		elements[a] = elements[a] + elements[b];
		
		elements[b] = elements[a].substring(0, elements[a].length() - elements[b].length());
		
		elements[a] = elements[a].substring(elements[b].length());
	}
}
