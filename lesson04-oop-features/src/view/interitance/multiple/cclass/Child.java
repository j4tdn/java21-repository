package view.interitance.multiple.cclass;

public class Child  extends Father /*, Mother */{
	//Java không hôx trợ đa thừa kế
	// Vì có trường hợp các class cha có chung hàm khai báo
	//
public static void main(String[] args) {
	Child c1 = new Child();
	c1.cooking();
	c1.running();
}
}
