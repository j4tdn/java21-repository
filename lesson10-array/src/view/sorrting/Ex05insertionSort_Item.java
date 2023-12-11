package view.sorrting;

import bean.Item;
import functional.Compare_Item;
import model.Datamodel;

public class Ex05insertionSort_Item {
	
	public static void main(String[] args) {
		Item[] item = Datamodel.MockItems();
		
		sort(item,(i1, i2) -> {
			return i1.getId().compareTo(i2.getId());
		});
		printItem(item);
	}
	
	  public static void sort(Item[] item , Compare_Item compareItem) {
	        for (int i = 1; i < item.length; i++) {
	            Item key = item[i];
	            int j = i - 1;
	            while (j >= 0 && compareItem.compare(item[j], item[i]) >0) {
	            	item[j + 1] = item[j];
	                j--;
	            }
	            item[j + 1] = key;
	        }
	    }
	
	public static void printItem(Item[] arr) {
		for (Item employee : arr) {
			System.out.println(employee + " ");
		}
		System.out.println();
	}
}
