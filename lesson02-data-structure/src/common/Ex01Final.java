package common;

import datastructor.object.Item;

public class Ex01Final {
	public static void main(String[] args) {
		
		
		// Final --> final ở STACK --> k thể thay đổi giá trị cho biến ở STACK
		// k thể dùng toán tử = (reassign) cho biến
		
		// Primitive Type
		// Giá trị lưu trữ ở STACK
		// Biến lưu ở STAK chứa thông tin giá trị
		
		final int a =5;
		int b=7;
		int c=10;
		
		// a = b;
		// a = 10;
		
		
		// Object Type
		// Giá trị lưu trữ ở HEAP
		// Biến lưu ở STACK chứa thông tin địa chỉ ở HEAP
		Item itA = new Item(1, 'A', 11);
		final Item itB = new Item(2, 'B', 22);
		Item itC = new Item(3, 'C', 33);
		
		System.out.println(System.identityHashCode(itB));
		
		itA = itB;
		
		//itB = itA; --. lỗi k thay đổi đc ở STACK
		
		itB.name = 'Z';
		System.out.println(System.identityHashCode(itB));
				
	}
}
