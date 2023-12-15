package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	
	public static void main(String[] args) {
		
		List listA = new ArrayList<>();
		List listB = new ArrayList<>();
		
		listA.add(1);
		listA.add(2);
		listA.add("3");
		
		// duyệt và in ra
		for (Object element : listA) {
			System.out.println(Integer.parseInt(element.toString()) * 2);
		}
		
	}
}
