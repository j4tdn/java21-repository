package view.inheritance.multiple.cclass;

public class Child extends Father/*, Mother */ {

	// java ko hỗ trợ đa thừa kế
	// vì có trường hợp các class cha có chung hàm khai báo
	// nếu class con ko bắt buộc override hàm từ cha
	
	// --> khi lấy con gọi hàm chung thì sẽ ko biết gọi đến class nào
	// compile error thay vì đợi gọi 
	
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.cooking();
		c1.running();
	}
}
