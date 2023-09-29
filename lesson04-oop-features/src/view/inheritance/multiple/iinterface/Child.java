package view.inheritance.multiple.iinterface;

public class Child implements Father, Mother{

	@Override
	public void playBedminton() {
		System.out.println("Child --> playBedmiton");
	}

	@Override
	public void cooking() {
		System.out.println("Child --> cooking");
	}

	@Override
	public void running() {
		System.out.println("Child --> running");
	}

}
