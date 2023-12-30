package view.sorting.available.method;

import java.util.Arrays;
import java.util.Comparator;

import beam.Item;
import model.DataModel;
import static utils.ArraysUtils.*;
public class Ex02QuickSort_Item {

	public static void main(String[] args) {
		
		Item[] items = DataModel.mockItem_NullValues();
		
		// sort array of objects[Integer, Double, Item,... ]
		/*
		 Cách 1: Arrays.sort(Object[] a);
		 + Lúc compile a là mảng kiểu Object
		 	--> Lúc runtime có thể nhận vào bất kỳ KDL đối tượng nào
		 + Để biết được mảng a sắp xếp tăng đàn, giảm dần theo thuộc thuộc tính nào
		   Ví dụ: Item -> giảm dần id, giảm dần theo name
		   		  String -> tăng, giảm dần
		   Lúc runtime, kiểm tra KDL của mảng a truyền vào[Object] có phải là
		   KDL con của interface Comparable<?> hay không 
		   + Nếu class(KDL) truyền vào là con của Comparable<?>
		     --> compile: hàm sort được gọi từ compareTo của Comparable<?> 
		     --> runtime: dựa vào hàm compareTo(Object o)(override từ comparable<?>) trong đó:
		     	 . this là phần tử đứng trước (leftmark)
		     	 . o là phần tử đứng sau (rightmark)
		     	 --> để biết công thức sort là gì
		   + Nếu class(KDL) truyền vào không phải là con của Comparable<?>
		     --> báo lỗi cast exception lúc runtime
		     
		 
		 */
		
		
		// Arrays.sort(T[] a, Comparator<? super T>c);
		Arrays.sort(items);
		
		generate("1. sort items by price", items);
		
		// Hạn chế của Arrays.sort(Object[] a)
		// 1. Bắt lỗi casting tại runtime
		// 2. Mỗi KDL của mảng chỉ được phép có 1 phương pháp sort
		//    Vì sort phụ thuộc vào override compareTo trong class truyền vào
		
		
		/*
		 Cách 2: Arrays.sort(T[] a, Comparator<? super T>c);
		 */
		
		// T nếu nó có implements Comparable<?> vẫn ưu tiên Comparator
		
		Arrays.sort(items, new Comparator<Item>() {
			@Override
			public int compare(Item i1, Item i2) {
				return i1.getPrice().compareTo(i2.getPrice());
			}
		});
		
		generate("2. sort items by price[asc]", items);
		
		Arrays.sort(items, (i1, i2) -> {
			if(i1 == null) {
				return 1;
			}
			if(i2 == null) {
				return -1;
			}
			
			// phải chuyển về int để compareTo vì nếu dùng integer thì có null ko compare được
			int storeIdCompare = i1.getStoreId().compareTo(i2.getStoreId());
			if(storeIdCompare!= 0) {
				return storeIdCompare;
			}
			return i2.getCreateAt().compareTo(i1.getCreateAt());
		});
		generate("3. sort items by store[asc], created[desc]", items);
		

	}
}
