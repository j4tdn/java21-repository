package view;

import java.util.Arrays;
import java.util.Comparator;
import bean.Item;
import model.DataModel;
import static java.util.Comparator.*;
import static utils.ArrayUtils.*;

public class Ex03FindingHighestPrice {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		Arrays.sort(items,comparing(Item::getSalesPrice) );
		
		generate("Sắp xếp tăng dần theo giá", items);
	}
	
}
