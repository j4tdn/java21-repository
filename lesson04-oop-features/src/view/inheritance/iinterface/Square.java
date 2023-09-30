package view.inheritance.iinterface;

public class Square implements Shape{

	public void paint() {
		System.out.println("Square ---> paint");
	}

	public void calS() {
		System.out.println("Square ---> calS");
	}


	@Override
	public void onload() {
		
	}
}
