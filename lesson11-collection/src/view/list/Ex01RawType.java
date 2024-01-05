package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {

	public static void main(String[] args) {
		
		List listA = new ArrayList<>();  // Danh sach cac int
		List listB = new ArrayList<>();  // Danh sach cac String
		
		
		listA.add(1);
		listA.add(2);
		listA.add("3");
		listA.add("bon");
		
		for(Object element : listA) {
			System.out.println(Integer.parseInt(element.toString()));
		}
	}
	
}
