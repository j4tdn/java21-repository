package common;

import datastructure.object.custom.Item;

public class Ex01Final {
	public static void main(String[] args) {
		// Final --> Không thể thay đổi giá trị ở Stack
		// Sau khi định nghĩa giá trị cho biến Final rồi thì không thể gán(=) lại (reassign)
		
		
		// Object type
		// Giá trị lưu trữ ở HEAP
		// Biến ở STACk lưu giá trị là địa chỉ
		Item itA =  new Item(1, 'A', 22d);
		final Item itB =  new Item(1, 'B', 22d);
		Item itC =  new Item(1, 'C', 22d);
		
		itA = itB;
		// itB = itC; // Không thể cập nhật giá trị
		itC = itA;
	}
}
