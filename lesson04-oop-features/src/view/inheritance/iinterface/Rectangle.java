package view.inheritance.iinterface;

public class Rectangle implements Shape, CssStyle{

	@Override
	public void paint() {
		System.out.println("Rectanle --> paint ...");
	}

	@Override
	public void calS() {
		System.out.println("Rectanle --> calS ...");
	}

	@Override
	public void setColor() {
		System.out.println("Red");
	}

	@Override
	public void setBackGround() {
		System.out.println("Yellow");
	}

	@Override
	public void onload() {
		
	}

	
}
