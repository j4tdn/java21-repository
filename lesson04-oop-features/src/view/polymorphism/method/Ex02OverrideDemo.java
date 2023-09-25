package view.polymorphism.method;

public class Ex02OverrideDemo {
	public static void main(String[] args) {
		PolyChild pc = new PolyChild();
		pc.log();
		pc.test();
	}

}
	//Tại sao mình không code 2 hàm log riêng biệt tại PolyParent và PolyChid
	//Mà tại sao lại sử dụng lại hàm log chung
	//Trả lời: có code chung, được kế thừa, code sẽ sạch sẽ và đồng nhất, rõ ràng