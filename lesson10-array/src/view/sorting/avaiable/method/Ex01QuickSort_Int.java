package view.sorting.avaiable.method;
import static utils.ArrayUtils.*;

import java.util.Arrays;

import common.SortType;

class Ex01QuickSort_Int {
	public static void main(String[] args) {
		int[] elements = {1,5,3,4,6,8,2,9};
		
		Arrays.sort(elements);
		generate("Sort item(ASC)", elements);
		
		// No support for descending with primitive type
		sort(elements, SortType.DESC);
		generate("Sort item(DESC)", elements);
	}
}
