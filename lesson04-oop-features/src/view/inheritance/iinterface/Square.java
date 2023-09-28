package view.inheritance.iinterface;

public class Square implements Shape{
	
	@Override
	public void paint() {
		System.out.println("Square --> paint...");
	}
	
	@Override
	public void calS() {
		System.out.println("Square --> calS...");
	}
	
	@Override
	public void onload() {
		
	}
}
