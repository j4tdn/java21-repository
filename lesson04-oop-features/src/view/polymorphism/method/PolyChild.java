package view.polymorphism.method;

public class PolyChild extends PolyParent {
	
	@Override // annotation
	void log() {
		System.out.println("PolyChild --> log");
	}
	
	@Override
	void test() {
		System.out.println("PolyChild --> test");
	}
	

}
