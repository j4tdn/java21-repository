package view.inheritance.iinterface;

public class Circle implements Shape {

	public void paint() {
		System.out.println("Circle --> paint");
	}
	
	public void cals() {
		System.out.println("Circle --> cals");
	}

	@Override
	public void onload() {
		// TODO Auto-generated method stub
		
	}
}
