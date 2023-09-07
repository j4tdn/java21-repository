package common;

import datastructure.object.custom.Item;

public class Ex01Final {
	public static void main(String[] args) {
		//final --> final ở stack --> ko thể thay đổi giá trị cho biến ở stack
		
		// primitive type
		// giá trị lưu trữ ở Stack
		// biến lưu ở stack chứa thông tin giá trị
		final int a = 5;
		int b = 7;
		int c = 10;
		
		//a = b;
		//a = 10;
		b = c;
		
		
		
		
		
		// object type
		// giá trị lưu trữ ở heap
		// biến lưu ở stack chứa thông tin địa chỉ ô nhớ ở heap
		Item itA = new Item(1, 'A', 11);
	}

}
