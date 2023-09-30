package view.inheritance.multiple.iinterface;

public class Child implements Father, Mother{
	@Override
	public void cooking() {
		System.out.println("Child -> cooking");
	}
	
	@Override
	public void running() {
		System.out.println("Child -> cooking");
	}
	
	@Override
	public void playBadminton() {
		System.out.println("Child -> playBadminon");
	}
	
	public void coding() {
		System.out.println("No code");
	}
}
