package leson2;

import java.math.BigInteger;
import java.util.Random;

public class bai4 {
	public static BigInteger giaithua(int n) {
		if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            BigInteger t = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                t = t.multiply(BigInteger.valueOf(i));
            }
            return t;
        }
	}
public static void main(String[] args) {
	Random rd = new Random();
	  int a[] = new int[4];
	  BigInteger s =BigInteger.ZERO;
	for(int i=0;i<4;i++) {
		a[i]=rd.nextInt(10, 20);
		BigInteger kq = giaithua(a[i]); 
		 s = s.add(kq);
		 System.out.println(a[i]);
		 System.out.println(s);
	}
	System.out.println(s);
}
}
