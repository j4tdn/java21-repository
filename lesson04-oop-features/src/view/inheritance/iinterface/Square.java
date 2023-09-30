package view.inheritance.iinterface;

public class Square implements Shape{
	
	@Override
	public void calS() {
		System.out.println("Rectangle --> paint");
	}
	
	@Override
	public void paint() {
		System.out.println("Rectangle --> calS");
	}
	
	@Override
	public void onload() {
		// TODO Auto-generated method stub
		
	}

}
