package view.inheritance.multiple.iinterface;

import java.math.BigInteger;

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
		// Father.super.coding();
		// Mother.super.coding();
		System.out.println("No code");
	}
	
	
	// Trừu tượng : Lý thuyết
	// Anonymous function (lambda expression)
	// Strategy pattern
	
	// --> 10p
	// --> Sửa bài tập B2, B3, B4
}
