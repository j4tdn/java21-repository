package view.polymorphism.method;

public class PolyChild extends PolyParent{
	
	@Override // annotation
	void log() {
		System.out.println("PolyChild --> log ...");
	}
	
	/*
	  Shape 
	  		   : calS
	  Rectangle: calS -->
	  Square   : calS -->
	  Triangle : calS -->
	  Circle   : calS -->
	  
	 */
	
}
