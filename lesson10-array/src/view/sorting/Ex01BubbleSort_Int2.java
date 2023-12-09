package view.sorting;
import static utils.ArraysUtils.*;
import static utils.Compare_Int2.*;

import utils.Compare_Int;
import utils.Compare_Int2;
public class Ex01BubbleSort_Int2 {

	public static void main(String[] args) {
		int[] elements = {1,5,11,9,4,6};
		
		generate("1. Elements", elements);
		
		//hoán vị khi e1 > e2 --> lớn lui sau --> tăng dần
		sort(elements, (e1,e2) -> e1 - e2);
		
		generate("2. Element(sort ascending)", elements);
		
		sort(elements, (e1,e2) -> e2 - e1);

		
		//hoán vị khi e1 < e2 --> Nhỏ lui sau --> tăng dần
		//sort(elements, (e1,e2) -> e1 < e2);
		generate("2. Element(sort descending)", elements);

	}
	
	// elements[j] > elements[j+1]
	// elements[j] < elements[j+1]
	// boolean test(int e1, int e2)
	
	private static void sort(int[] elements, Compare_Int2 compareInt2) {
		
		// sort ascending | descending
		for(int i = 0; i < elements.length; i++) {
			for(int j = 0; j < elements.length-i-1;j++) {
				// Nếu compare(a[j], a[j+1] trả về số dương
				if(compareInt2.compare(elements[j], elements[j+1]) > 0) {
					swap(elements, j, j+1);
				}
			}
		}
		
	}
	
	private static void sortAcd(int[] elements) {
		
		// sort ascending | descending
		for(int i = 0; i < elements.length; i++) {
			for(int j = 0; j < elements.length-i-1;j++) {
				// nếu phần tử trước > phần tử sau ==> hoán vị
				// sắp xếp tăng dần
				if(elements[j] - elements[j+1] > 0) {
					swap(elements, j, j+1);
				}
			}
		}
		
	}
	
	private static void sortDcd(int[] elements) {
		
		// sort ascending | descending
		for(int i = 0; i < elements.length; i++) {
			for(int j = 0; j < elements.length-i-1;j++) {
				// nếu phần tử trước < phần tử sau ==> hoán vị
				// sắp xếp giảm dần
				if(elements[j] - elements[j+1] < 0) {
					swap(elements, j, j+1);
				}
			}
		}
		
	}
	
	
}
