package view.interitance.multiple.iinterface;

public class Child implements Father, Mother {

	@Override
	public void playBatminton() {
		System.out.println("Child ---> PlayBatminton");
	}

	@Override
	public void cooking() {
	System.out.println("Child ---> cooking");	
	}

	@Override
	public void running() {
	System.out.println("Child ---> running");	
	}

}
