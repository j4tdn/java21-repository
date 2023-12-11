package view.sorrting;

import bean.Item;
import functional.Compare_Item;
import model.Datamodel;

public class Ex04_SelectionSort_Item {
	
	public static void main(String[] args) {
		Item[] item = Datamodel.MockItems();
		
		sort(item,(i1, i2) -> {
			return i1.getId().compareTo(i2.getId());
		});
		printItem(item);
	}
	
	private static void sort(Item[] item , Compare_Item compareItem) {
		
		for(int i=item.length -1 ;i>0;i--) {
			for(int j = 0 ; j<i ;j++) {
				if(compareItem.compare(item[j], item[i]) >0) {
					swap(item, j ,i);
				}
			}
		}
		
	}
	private static void swap(Item[] elements, int i, int j) {
		Item temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
	
	public static void printItem(Item[] arr) {
		for (Item employee : arr) {
			System.out.println(employee + " ");
		}
		System.out.println();
	}
}
