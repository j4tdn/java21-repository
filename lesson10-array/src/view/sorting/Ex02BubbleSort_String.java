package view.sorting;
import static untils.ArrayUtils.*;
import java.util.Arrays;

public class Ex02BubbleSort_String {

	public static void main(String[] args) {
		String [] elements = {"a1", "k7", "12","bzt282"," 115", "c15", "d22"};
		/*
		 * Arrays.sort(elements); for (String element: elements ) {
		 * System.out.println(element); }
		 */
		generate("1. Elements", elements);
		
		sortAsc(elements);
		
		generate("1. Element(sort ascending)", elements);
	}
			
	private static void sortAsc (String [] elements) {
		for (int i = 0; i < elements.length; i++) {
			for ( int j = 0; j < elements.length - i - 1; j ++) {
				if(elements[j].compareTo(elements[j+1]) >0) {
					swap(elements,j , j+1);
				}
			}
		}
	}
}
