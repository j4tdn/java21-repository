package view.sorting;

import bean.Item;
import functional.Compare_Item;
import model.DataModel;
import static utils.ArrayUtils.*;
public class Ex04SelectionSort_Item {
	/* Ideal của thuật toán selection Sort: 
	--> Cứ mỗi round nó lấy phần tử thứ round đó so sánh với tất cả phần tử còn lại
		
	*/
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems_NullValues();
		sort(items, (i1, i2) -> {
			//null last
			if(i1 == null) {
				return 1;
			}
			if(i2== null) {
				return -1;
			}
			if(i1.getId().compareTo(i2.getId()) > 0) {
				return 1;
			}
			return -1;
			//hoặc viết gọn 
			// return i1.getID().compareTo(i2.getId));
		});
		generate("Item sau khi sap xep  la: ", items);
		
		
	}
	private static void sort(Item[] items, Compare_Item compare) {
		for(int i = items.length - 1; i > 0; i--) {
			//item[j] : phần tử đứng trước
			//item[i] : phần tử đứng sau
			for(int j = 0 ; j < i ; j++) {
				if(compare.compare(items[j], items[i]) > 0) {
					swap(items, j, i);
				}
			}
		}
		
	}
}
