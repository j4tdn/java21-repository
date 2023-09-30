package view.inheritance.iinterface;

public class Retange implements Shape, CssStyle{

	@Override
	public void paint() {
		System.out.println("Retange --> paint ...");
	}

	@Override
	public void calS() {
		System.out.println("Retange --> calS ...");
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
