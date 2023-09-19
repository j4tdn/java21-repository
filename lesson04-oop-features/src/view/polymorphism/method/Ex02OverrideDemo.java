package view.polymorphism.method;

public class Ex02OverrideDemo {
	public static void main(String[] args) {
		PolyParent pc = new PolyChild();
		pc.log();
		pc.test();
	}
}
