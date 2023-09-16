package view.polymorthphism;

public class PolyChild extends PolyParent {

	@Override
	void log() {
		System.out.println("PolyChild --> log ...");

	}
	/*
	 Shape   
	            :  calS
	 
	 Rectangle  :  calS -->
	 Square     :  calS -->
	 Triangle   :  calS -->
	 Circle     :  calS -->
	 
	 */

}
