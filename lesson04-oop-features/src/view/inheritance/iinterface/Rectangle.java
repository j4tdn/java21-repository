package view.inheritance.iinterface;

public class Rectangle implements Shape, CssStyle {

	@Override
	public void paint() {
		System.out.println("Rectangle --> paint ...");
	}

	@Override
	public void calS() {
		System.out.println("Rectangle --> calS ...");
	}

	@Override
	public void setColor() {
		
	}
	
	@Override
	public void setBackground() {
		
	}

}
