package datastructure.object.custom;

public class Ex01ObjectDemo {

	public static void main(String[] args) {

		int a = 12;
		char b = '@';
		
		System.out.println(a + " - " + b);

		// new Item() --> g�?i hàm khởi tạo mặc định của Class Item
		
		// default constructor:
		// + tạo ra 1 ô nhớ trên vùng heap
		// + có đầy đủ thông tin tất cả các thuộc tính của class chứa nó
		Item i1 = new Item();
		
		i1.id = 1;
		i1.name = 'T';
		i1.price = 2;
		System.out.println(System.identityHashCode(i1));
		
		i1 = new Item();
		
		System.out.println(System.identityHashCode(i1));
		
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'D';
		i2.price = 109;
		// Java có class g�?i là cha của tất cả các class --> Object
		// Object java sẽ có 1 số hàm:
		// toString, hashcode, equals ...
		// in 1 biến KDL đối tượng mặc định g�?i hàm toString() có sẵn trong KDL của biến đó.
//		System.out.println("item = " + i1);
//		System.out.println(i1.id + "--" + i1.name + "--" + i1.price);
		System.out.println(i1.toString());
		System.out.println(i2.toString());
	}

}
