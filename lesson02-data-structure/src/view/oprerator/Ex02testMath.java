package view.oprerator;

import java.util.Random;

public class Ex02testMath {
	public static void main(String[] args) {
		Random rd = new Random();
		double rn = rd.nextDouble(2.20d,56.81d);
		double fn = (double) Math.round(rn * 100) / 100;
		System.out.println(fn);
		
	}
}
