package view.inheritance.iinterface;

public class Rectangle implements Shape, CssStyle{

	@Override
	public void paint() {
		System.out.println("Rectangle --> Paint ...");
	}

	@Override
	public void calS() {
		System.out.println("Rectangle --> Paint ...");
	}

	@Override
	public void setColor() {
		System.out.println("Red");
	}

	@Override
	public void setBackground() {
		System.out.println("Yellow");
	}
	
	@Override
	public void onload() {
		
	}
	
}
