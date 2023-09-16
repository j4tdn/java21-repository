package datastructure.primitive;

import java.text.DecimalFormat;
import java.util.Random;
//Dùng theo kiểu String
public class ramdom {
	public static void main(String[] args) {
		Random rd = new Random();
		double x;
		x=rd.nextDouble(54.60) + 2.20;
		DecimalFormat df = new DecimalFormat("0.00");
		String nb = df.format(x);
		System.out.println(nb);
	//	DecimalFormat rd.nextDouble(54.60) + 2.20);
		//System.out.println(DecimalFormat df = new DecimalFormat("0.00"));
	//	System.out.println( x = Math.round((*100)/100);
	}
}
