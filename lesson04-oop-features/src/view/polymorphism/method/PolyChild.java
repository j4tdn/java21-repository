package view.polymorphism.method;

public class PolyChild extends PolyParent {
	
	@Override
	void log() {
		System.out.println("PolyChild --> log...");
	}
	
	/*
		shape     : calS 
		 
	 	rectangle : calS
	 	Square    : calSOfSquare
	 	Triangle  : tinhS
	 	Circle	  : claDienTich
	 */
}
