package BTVN;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();		
		
		double rn1 =  rd.nextDouble(2.20, 56.80);
		
		System.out.println();
		
		System.out.println((double)Math.round(rn1*100)/100);	
	}
}
