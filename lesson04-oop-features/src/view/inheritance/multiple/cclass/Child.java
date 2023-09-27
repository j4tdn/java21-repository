package view.inheritance.multiple.cclass;

public class Child extends Father{
	
	/*
	  Java kh hỗ trợ đa thừa kế
	  Vì có trường hợp class cha có chung hàm khai báo
	  Nếu class con kh bắt buộc override hàm từ cha
	  --> Khi lấy con gọi hàm chung thì sẽ kh gọi đến class
	  compile error thay vì gọi
	 */
	
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.cooking();
		c1.ruuning();
	}
}
