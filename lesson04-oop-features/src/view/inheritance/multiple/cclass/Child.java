package view.inheritance.multiple.cclass;

public class Child extends Father{

	
	// Java không hỗ trợ đa thừa kế 
	// Vì có trg hợp các class cha có chung hàm khai báo
	// Nếu class con ko bắt buộc override hàm từ cha
	
	// --> Khi lấy con gọi hàm chung thì sẽ k biết gọi đến class nào
	// compile error thay vì đợi gọi
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.cooking();
		c1.running();
	}
}
