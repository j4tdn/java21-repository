package view.io;

import java.util.Random;

public class Ex02BasicRandom {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int rn1 = rd.nextInt();
		// từ [0,20)
		int rn2 = rd.nextInt(20);
		// từ (4,20)
		int rn3 = rd.nextInt(4,20);
		// a + next (b -a)
		int rn4 = 4 + rd.nextInt(16);
		
		System.out.println("rn1-->"+rn1);
		System.out.println("rn2-->"+rn2);
		System.out.println("rn3-->"+rn3);
		System.out.println("rn4-->"+rn4);
	}
}
