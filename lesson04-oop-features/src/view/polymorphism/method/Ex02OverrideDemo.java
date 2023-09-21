package view.polymorphism.method;

public class Ex02OverrideDemo {
	
	public static void main(String[] args) {
		
		PolyChild pc = new PolyChild();
		pc.log();
		pc.test();
		
		// Tại sao mình không code 2 hàm log riêng biệt tại PolyParent và PolyChild
		// Mà phải tạo log ở parent xong override ở child
	}
	
}
