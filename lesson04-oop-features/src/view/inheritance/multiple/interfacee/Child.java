package view.inheritance.multiple.interfacee;

public class Child implements Father, Mother {

//	@Override
//	public void cooking() {
//		System.err.println("Child --> cooking");
//	}

	@Override
	public void playBadminton() {
		System.err.println("Child --> playBadminton");
	}

//	@Override
//	public void coding() {
//		System.err.println("Child --> coding");
//	}

	@Override
	public void running() {
		System.err.println("Child --> running");
	}

	@Override
	public void setColor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBackground() {
		// TODO Auto-generated method stub

	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cals() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println("ngu");
		c1.coding();

	}
}
