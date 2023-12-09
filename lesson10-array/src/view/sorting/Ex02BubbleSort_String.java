package view.sorting;
import static utils.ArraysUtils.*;
import utils.Compare_String;
public class Ex02BubbleSort_String {

	public static void main(String[] args) {
		
		String[] elements = {null,"a1", "bzt282",null, null, "k7", "12", "h15", "d22", "76"};
		
		generate("1. Elements", elements);

		sort(elements, (s1,s2) -> {
			if(s1 == null) {
				return -1;
			}
			if(s2 == null) {
				return 1;
			}
			
			// process non-null elements(e.g ascending)
			return s1.compareTo(s2);
		});
		
		generate("1. Elements(sort Ascending)", elements);
		
		sort(elements, (s1,s2) -> {
			// null last
			if(s1 == null && s2!= null) {
				return 1;
			}
			
			if(s2 == null) {
				return -1;
			}
			
			// descending
			return s2.compareTo(s1);
		});
		generate("1. Elements(sort decending)", elements);
		
	}
	
	private static void sort(String[] elements, Compare_String compareString) {
		for(int i = 0; i < elements.length; i++) {
			for(int j = 0; j < elements.length-i-1; j++) {
				if(compareString.compare(elements[j], elements[j+1]) > 0) {
					swap(elements, j, j+1);
				}
			}
		}
	}
	
	
	
	private static void sortAsc(String[] elements) {
		for(int i = 0; i < elements.length; i++) {
			for(int j = 0; j < elements.length-i-1; j++) {
				if(elements[j].compareTo(elements[j+1]) > 0) {
					swap(elements, j, j+1);
				}
			}
		}
	}
}
