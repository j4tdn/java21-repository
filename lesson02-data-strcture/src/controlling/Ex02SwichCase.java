package controlling;

import java.util.Random;
import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

import datastructure.primitive.ramdom;
import datastructure.primitive.randomBigDecimal;

public class Ex02SwichCase {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(2, 9);
		System.out.println(n);
		switch (n) {

		case 2:
			System.out.println("thu 2");
			break;

		case 3:
			System.out.println("thu 3");
			break;

		case 4:
			System.out.println("thu 4");
			break;

		case 5:
			System.out.println("thu 5");
			break;

		case 6:
			System.out.println("thu 6");
			break;

		case 7:
			System.out.println("thu 7");
			break;
		case 9:
		case 8:
			System.out.println("k hop le");
			break;
		}
	}
}
