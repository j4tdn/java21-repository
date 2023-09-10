package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int a = 5;
		System.out.println("a: " + a);
		
		// Object type: custom
		Item item = new Item();
		Item item1 = new Item(1, 'A', 55d);
		
		// Object type: available
		Integer o1 =  new Integer(12);
		Integer o2 =  new Integer(66);
		
		System.out.println("o1 : " + o1);
		System.out.println("o2 : " + o2);
	}
}
