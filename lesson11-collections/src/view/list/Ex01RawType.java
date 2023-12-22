package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	public static void main(String[] args) {
		
		List listA = new ArrayList(); // ds các số nguyên
		List listB = new ArrayList(); // ds các chuỗi
		
		//rawtype: dễ bị casting exception lúc runtime
		
		listA.add(1);
		
		listA.add(2);
		
		//
		for (Object element: listA) {
			System.out.println(Integer.parseInt(element.toString()) * 2);
		}
		
	}
}
