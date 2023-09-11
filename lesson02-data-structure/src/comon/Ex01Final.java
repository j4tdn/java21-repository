package comon;

import datastructure.object.custom.Item;

public class Ex01Final {
	public static void main(String[] args) {
		//Final --> Final ở STACK -- k thể thay đổi giá trị ở STACK
		// Không thể dùng toán tử = (reassign) cho biến
		//primitve type
		//Giá trị lưu trữ ở STACK
		//Biến lưu ở STACK chứa thông tin giá trị
		
		final int a = 5;
		int b = 7;
		int c = 10;
		
		//a = b;
		//a = 10;
		b = c;
		
		
		//Object type
		//Giá trị lưu trữ ở HEAP
		//Biến lưu ở STACK chứa thông tin địa chỉ ô nhớ ở HEAP
		Item itA = new Item(1,'A',11);
		Item itB = new Item(2,'B', 22);
		Item itC = new Item (3,'C', 33);
	}
}
