package view.inheritance.multiple.iinterface;

public class Child implements Father, Mother {

	@Override
	public void playBadminton() {
		System.out.println("Child --> playBadminton");
	}

	@Override
	public void cooking() {
		System.out.println("Child --> cooking");
	}

	@Override
	public void running() {
		System.out.println("Child --> running");
	}

	@Override
	public void coding() {
		System.out.println("No code");
	}
	
}
