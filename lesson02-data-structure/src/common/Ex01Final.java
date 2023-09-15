package common;

import datastructure.object.custom.Item;

public class Ex01Final {
	public static void main(String[] args) {
		// Final --> Final ở STACK -> k thể thay đổi giá trị cho biến ở STACK
		// Khi final thì không thể dùng toán tử =
		
		// Primitive Type - giá trị lưu trữ ở STACK
		
		
		// Object type - giá trị lưu trữ ở HEAP
		// Biến lưu ở STACK chứa thông tin địa chỉ ô nhớ HEAP
		
		Item itA = new Item(1, 'A', 11);
	    final Item itB = new Item(2, 'B', 22);
		Item itC = new Item(3, 'C', 33);
		
		itA = itB;
		// itB = itC;
		itC = itA;
		// ==> vì đã final ở itB rồi nên không thể thay đổi địa chỉ ở STACK đc, nhưng cập nhật giá trị ở HEAP thì ok
		itB.name = 'Z';

	}
}
