package view.inheritance.multiple.iinterface;

public class Child implements Father, Mother {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.cooking();
		c1.running();
		c1.playBadminton();
		c1.coding();
	}

	@Override
	public void cooking() {
		System.out.println("Child  -->cooking");
	}

	@Override
	public void running() {
		System.out.println("Child  -->running");
	}

	@Override
	public void playBadminton() {
		System.out.println("Child  -->playBadminton");
	}

	@Override
	public void coding() {
		// TODO Auto-generated method stub
		Father.super.coding();
		Mother.super.coding();
	}
}
