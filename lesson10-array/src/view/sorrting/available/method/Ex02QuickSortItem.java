package view.sorrting.available.method;

import java.lang.reflect.Array;
import java.util.Arrays;

import bean.Item;
import model.Datamodel;

public class Ex02QuickSortItem {

	public static void main(String[] args) {
		
		//non-null element
		Item[] items = Datamodel.MockItems();
		
		//Sort array of objects[Interger, Double, Item ,...]	
		
		//	cach 1:	Arrays.sort(Object[] a);
				// + lúc compile a là mảng kiểu Obiect
					// --> Lúc runtime có thể nhận vaò bất kỳ KDL đối tượng nào
				// + Để biết đực mảng a sắp xếp tăng dần, giảm dần the thuộc tính nào
				// Vu dụ : Item[] -> Tăng dần id, giảm dần theo name
						// String -> tăng, giảm dần
				// Lúc runtime, kiểm tra KDL của mảng a truyền vào[Object] cs phải KDL con của interface Comparble<?> hay không
				// + Nếu class(KDL) truyển cào là con của Comarable<?> --> dựa vào hàm compareto(Object o) trong đó
					// * thí là phần tử đứng trước (leftmark)
					// o là phầ tue đúng sau(rightmark)
					// --> để biết công thức sort là gì
				// +Nếu class(KDL) truyền vào k phải con của Comparable<?>
				//  --> báo lỗi cast exception lúc runtime
		
		// sort theo giá
		Arrays.sort(items);
		printItem(items);
		//	cach 2:	Arrays.sort(T[] a, Comparator< ? super T> c);
	}
	
	public static void printItem(Item[] arr) {
		for (Item employee : arr) {
			System.out.println(employee + " ");
		}
		System.out.println();
	}
	
}
