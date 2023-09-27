package view.inheritance.multiple.cclass;

public class Child extends Father {
	
	
	/*
	 Java k hỗ trợ đa thừa kế
	 Vì cố trường hợp các class cha có chung hàm khai báo
	 Nếu class con k bắt buộc override hàm từ cha
	 
	 --> khi con gọi hàm thì k biết gọi từ ai
	 
	 
	 * */
	
	
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.cooking();
		c1.running();
				
	}
}
