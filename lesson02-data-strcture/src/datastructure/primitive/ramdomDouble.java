package datastructure.primitive;

import java.util.Random;
//Random theo kiểu double
public class ramdomDouble {
	public static void random(double a, int b) {
		
	}
	public static void main(String[] args) {
		Random rd = new Random();
		// double a=rd.nextDouble(54.6)+2.2;
		// double b= Math.round(rd.nextDouble(54.6)+2.2*100);
		// b=b/100;
		// double b;
		System.out.println( (Math.round((rd.nextDouble(54.60) + 2.20) * 100d)) / 100d);
		// System.out.println(b);
	}
}
