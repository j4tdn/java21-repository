package common;

import datastructure.object.custom.Item;

public class Ex01Final {
	
	public static void main(String[] args) {
		
		// Final --> Final ở Stack --> không thể thay đổi giá trị cho biến ở Stack
		// Không thể dùng toán tử = reassign cho biến
		
		// Primitive Type
		// Giá trị lưu trữ ở Stack
		// Biến lưu trữ ở Stack chứa thông tin giá trị
		
		final int a = 5;
		int b = 7;
		int c = 10;
		
		// a = b;
		// a = 10;
		b = c;
		
		// Object Type
		// Giá trị lưu trữ ở HEAP
		// Biến lưu trữ ở Stack chứa thông tin địa chỉ ô nhớ ở HEAP
		
		Item itA = new Item(1, 'A', 11);
		final Item itB = new Item(2, 'B', 22);
		Item itC = new Item(3, 'C', 33);
		
		itA = itB;
		// itB = itC;
		itC = itA;
		
		itB.name = 'Z';
		
	}

}
