package view.sorting.availabale.method;
import static utils.ArrayUtils.*;
import java.util.Arrays;

import commom.SortType;

public class Ex01QuickSort_Int {
	public static void main(String[] args) {
		
		// array
		
		int[] elements = {1, 5, 11, 16, 56, 18, 8};
		
		Arrays.sort(elements);
		// no support for desc
		generate("1. Sort", elements);
		
		sort(elements, SortType.DESC);
		generate("1. Sort desc", elements);
	}
}
