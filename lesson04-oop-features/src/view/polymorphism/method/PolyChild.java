package view.polymorphism.method;

public class PolyChild extends PolypParent {
	
	@Override  // annotation: ký hiệu biết được đang override từ cha (Nên gõ vào để biết là đang overried từ cha)
	void logOut() {
		System.out.println("PolyChild --> log ...");
	}
}
