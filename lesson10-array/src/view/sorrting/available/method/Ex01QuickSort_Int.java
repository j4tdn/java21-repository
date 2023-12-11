package view.sorrting.available.method;

import java.util.Arrays;

import bean.Item;
import common.SortType;

import static utils.ArrayUtils.*;

public class Ex01QuickSort_Int {

	public static void main(String[] args) {
		
		int[] element = {1,5,11,9,4,6};
		Arrays.sort(element);
		
		printEmployees(element);
		
		sort(element, SortType.DESC);
		printEmployees(element);
	}
	
	public static void printEmployees(int[] arr) {
        for (int employee : arr) {
            System.out.print(employee+" ");
        }
        System.out.println();
    }
}
