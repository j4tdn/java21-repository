package view.sorting.available.method;

import java.util.Arrays;

import bean.Item;
import model.DataModel;
import static utils.ArrayUtils. *;

public class Ex02QuickSort_String {
	public static void main(String[] args) {
		// non-null elements
		Item[] items = DataModel.mockItems();
		
		// sort array of objects[Integer, Double, Item ...]
		 Arrays.sort(items);
		 generate("1. Sort by id [asc]", items);
		/*
		 * Để biết được mảng items sắp xếp tăng dần hay giảm dần theo thuộc tính nào
		 * Ví dụ: Item -> tăng dần id, giảm dần theo name
		 * String -> tăng, giảm dần
		 * Lúc runtime, kiểm tra KDL của mảng a truyền vào[Object] có phải là con
		 * KDL con của interface Comparable<?> hay không
		 * + Nếu class(KDL) truyền vào là con của Comparable<?> --> dựa vào hàm compareTo(Object o) 
		 * trong đó: this là phần tử đứng trước(leftmark)
		 * o là phần tử đứng sau(rightmark)
		 * --> để biết công thức sort là gì
		 */
		
		// Arrays.sort(T[] a, Comparator<?super T> c);
		
	}
}
