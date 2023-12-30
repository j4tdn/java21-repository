package view.sorting;
import static utils.ArrayUtils.*;


import bean.Item;
import functional.Compare_Item;
import model.DataModel;
public class Ex03BubbleSort_Item {
	
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems_NullValues();
		sort(items, (i1, i2) -> {
			// null first
			if (i1 == null) {
				return -1;
			}
			if (i2 == null) {
				return 1;
			}
			Integer id1 = i1.getId();
			Integer id2 = i2.getId();
			if (id1 > id2) {
				return 1;
			}
			return -1;
		});
		generate("1. Items(sort by id[asc])", items);
		sort(items,(i1, i2) -> {
			if(i1 == null) {
				return -1;
			}
			if(i2 == null) {
				return 1;
			}
			String name1 = i1.getName();
			String name2 = i2.getName();
			if(name1 == null) {
				return -1;
			}
			if(name2 == null) {
				return 1;
			}
			return name1.compareTo(name2);
		});
		generate("2.Item(sort by name  )", items);
		
		 sort(items, (i1, i2) -> {
			 if(i1 == null) {
				 return -1;
			 }
			 if(i2 == null) {
				 return 1;
			 }
			 Integer st1 = i1.getStoreId();
			 Integer st2 = i2.getStoreId();
			 if(st1 > st2) {
				 return 1;
			 }
			 return -1;
		 });
		 generate("3. Item sort by Store: ", items);
	}

	private static void sort(Item[] items, Compare_Item compare) {
		for(int i = 0; i < items.length; i++) {
			for(int j = 0; j < items.length -i -1; j++) {
				if(compare.compare(items[j], items[j+1]) > 0) {
					swap(items, j , j+1);
				}
			}
		}
		
	}
}
