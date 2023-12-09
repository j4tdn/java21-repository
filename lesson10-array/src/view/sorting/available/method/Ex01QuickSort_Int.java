package view.sorting.available.method;

import static utils.ArrayUtils.*;

import java.util.Arrays;

import common.SortType;

public class Ex01QuickSort_Int {
	public static void main(String[] args) {
		
		int[] elements = { 1, 5, 11, 9, 4, 6 };
		
		Arrays.sort(elements);
		generate("1. Sort elements(default asc)", elements);
		
		sort(elements, SortType.DESC);
		generate("2. Sort elements(asc)", elements);
	}
}
