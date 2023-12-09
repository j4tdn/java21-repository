package view.sorting.availabale.method;
import bean.Item;
import model.DataModel;
import static utils.ArrayUtils.*;
import  java.util.Comparator;
import java.util.Arrays;
import java.util.Comparator;

public class Ex03QuickSort_Item_SimpleCases {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		Arrays.sort(items, (i1, i2) -> {
			return i1.getPrice().compareTo(i2.getPrice());
		});
		/*Arrays.sort(items, comparing(Item::getPrice));
		Arrays.sort(items,
				nullsLast());*/
		
	}

	
}
