package view.inhertance.multiple.cclass;

public class Child extends Father {

	// Java k hổ trợ đa thừa kế
	// Vì khi trường hpự 2 class cha có cùng tên với nhau thì trong hàm con không
	    // biét sẽ gọi đên shàm nào
	// Compile error thay vì đợi gọi

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.coding();
		c1.running();
	}
}
