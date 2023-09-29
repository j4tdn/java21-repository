package view.inheritance.multiple.cclass;

public class Child extends Father{
	
	// Java k hỗ trợ đa thừa kế
	// VÌ có trường hợp các class cha có chung hàm khai báo
	// Nếu class con k bắt buộc override ham từ cha
	
	// --> Khi lấy con goi hàm chung thì sẽ k biết gọi đến class cha nào
	// compile error thay vì đợi gọi
	
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.cooking();
		c1.running();
	}
}
