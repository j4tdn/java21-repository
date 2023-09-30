package view.polymorphism.method;

public class PolyChild extends PolyParent {
	@Override  //anotation
	void log() {
		System.out.println("PolyChild --> log ...");
	}
	
	
	/*
	 Shape   
	           : calS 
	 
	 Rectangle : calS 
	 Square    : calSOfSquare
	 Triangle  : tinhS
	 Circle    : calDienTich
	 
	 */
}