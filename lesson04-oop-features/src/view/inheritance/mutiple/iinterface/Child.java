package view.inheritance.mutiple.iinterface;

public class Child implements Father, Mother {

	@Override
	public void playBadminton() {
		System.out.println("Child --> playBadminton ");
	}

	@Override
	public void cooking() {
		System.out.println("Child --> cooking ");
	}

	@Override
	public void running() {
		System.out.println("Child --> running ");
	}
@Override
public void coding() {
	
	//Father.super.coding();
	//Mother.super.coding();
	System.out.println("No code");
}
}