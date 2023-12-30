package view.sorting.avaiable.method;

import java.util.Arrays;
import java.util.Comparator;
import static utils.ArrayUtils.*;
import bean.Item;
import model.DataModel;

public class Ex02QuickSort_String {
	public static void main(String[] args) {
		// non- null elements 
		Item[] items = DataModel.mockItems();
		Arrays.sort(items);
		generate("1. Sort Item by price[asc]", items);
		/*
		 Cách 1: Arrays.sort(Object[] a);
		 + Lúc compile a là mảng kiểu Object
		 --> Lúc runtime có thể nhận vào bất kì KDL đối tượng nào
		 + Để biết được mảng a sắp xếp tăng dần, hay giảm dần phụ thuộc vào thuộc tính nào
		  Ví dụ: Item[] --> tăng dần theo id, giảm dần theo name
		  		 String --> tăng. giảm dần
		  		 
		  Lúc runtime, kiểm tra KDL của mảng a truyền vào[Object] có phải là 
		  con của interface Comparable<?> hay không
		  
		  Hạn chế của Arrays.sort(Object[] a):
		  1. Bắt lỗi casting tại Runtime 
		  2. Mỗi KDL của mảng chỉ được phép có 1 phương pháp Sort ->
		   Vì sort phụ thuộc vào override compareTo trong class truyền vào 
		 
		  
		  Cách 2: Arrays.sort(T[] a, Comparator<? super T> c)
		  
		  
		 */
	
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				return i1.getStoreId().compareTo(i2.getStoreId());	
			}
		});
		generate("2. Sort Item by StoreID[asc]", items);
		items = DataModel.mockItems_NullValues();
		Arrays.sort(items, (i1, i2)-> {
			if(i1 == null) {
				return 1;
			}
			if(i2 == null) {
				return -1;
			}
			Integer storeId1 = i1.getStoreId();
			Integer storeID2 = i2.getStoreId();
			int storeIdCompareTo = storeId1.compareTo(storeID2);
			
			if(storeIdCompareTo != 0) {
				return storeIdCompareTo;
			}	
			return i2.getCreatedAt().compareTo(i1.getCreatedAt());
		});
		generate("3. Sort Item by StoreID[asc], createAt(desc) ", items);
		
	}
}
