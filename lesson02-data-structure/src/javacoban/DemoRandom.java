package javacoban;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class DemoRandom {
public static void main(String[] args) {
	Random rd = new Random();
	int rn1 = rd.nextInt();
	int rn2 = rd.nextInt();
	System.out.println("rn1---->"+rn1);
	System.out.println("rn2---->"+rn2);
	int rn3 = rd.nextInt(5, 20);
	System.out.println("rn3---->"+rn3);
	double rn4 =rd.nextDouble(2.20, 56.80);
	System.out.println("rn4---->" + ((double) Math.round(rn4 * 100)) / 100);
	
	//tạo 1 số thực ngẫu nhiên trong phạm vi floaf
	float rf1 = rd.nextFloat();
	//tạo 1 số thực ngẫu nhiên từ [0.0, n)
	float rf2 = rd.nextFloat(12.8f);
	float rf3 = rd.nextFloat(2.2f, 56.8f);
	
	System.out.println("rf1---->"+rf1);
	System.out.println("rf2---->"+rf2);
	System.out.println("rf3---->"+rf3);
	float rf3Round = Math.round(rf3*100) / 100f;
	System.out.println("rf3Round----->"+rf3Round);
	
	//round up ---> Math.ceil
	//round down ----> Math.floor
	// commercial round ----> Math.round
	// DecimalFormat ---> Format to String for presentation
	// BigDecimal:
	BigDecimal bdRf3 = BigDecimal.valueOf(512344.34540f).setScale(4, RoundingMode.HALF_UP);
		System.out.println("bdRf3---->"+bdRf3);
}
}
