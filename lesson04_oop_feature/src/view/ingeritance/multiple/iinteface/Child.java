package view.ingeritance.multiple.iinteface;

public class Child implements Father,Mother {

	@Override
	public void running() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cooking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playBadminton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void coding() {
		// TODO Auto-generated method stub
		Father.super.coding();
		Mother.super.coding();
	}
	// Trừu tượng : Lý thuyết
	// Anonymous function (lambda expression)
	// Strategy pattern
	
	// --> 10p
}
