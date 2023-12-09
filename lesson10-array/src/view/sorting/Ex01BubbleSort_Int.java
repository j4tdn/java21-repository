package view.sorting;
import static untils.ArrayUtils.*;
public class Ex01BubbleSort_Int {
	public static void main(String[] args) {
		
		int[] elements = {1 , 5, 11, 9, 4, 6};
		System.out.println(+elements[0]);
		
		generate("1.Elements", elements);
		
		sort(elements);
		
		generate("2.Element(sort ascending)", elements);
		
		
	}
	
	// hàm sắp xếp tăng dần
	private static void sort ( int [] elements) {
		
		//sort ascending | descending 
		for (int i = 0; i< elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				// nếu phần tử trước > phần tử sau ==> hoán vị
				// Thằng lớn nằm lui sau ==> sắp xếp tăng dần
				if (elements[j] > elements[j+1]	) {
					swap(elements, j, j+1);
				}
			}
		}
	}
	
	//elements[j] < elements[j+1]
	//elements[j] > elements[j+1]
	
	
	// đặt vấn đề sử dụng statesi parten
	
	// boolean test( int e1, int e2)
	private static void sortDesc ( int [] elements) {
		
		//sort ascending | descending 
		for (int i = 0; i< elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				// nếu phần tử trước < phần tử sau ==> hoán vị
				// Thằng nhỏ nằm lui sau ==> sắp xếp giảm dần
				if (elements[j] < elements[j+1]	) {
					swap(elements, j, j+1);
				}
			}
		}
	}
	
}
