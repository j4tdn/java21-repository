package homework;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class bai7 {
	// int comparisonResult = bigInteger.compareTo(BigInteger.valueOf(intValue));
	// if (bigInteger.intValue() == intValue)
	public static boolean modPow(BigInteger n) {
		BigInteger k = new BigInteger("2");
		BigInteger h = (n.divide(k));
		// System.out.println("----"+h);
		if (h.multiply(k).intValue() != n.intValue())
			return true;
		else
			return false;
	}

	public static String binaryNumber(BigInteger n) {
		String s = "";
		// BigInteger k = new BigInteger("2");

		while (n.intValue() != 0) {
			if (modPow(n))
				s = s.concat("1");
			else
				s = s.concat("0");
//			if((n.divide(k)).intValue() !=0) s=s.concat("1");
//			else s=s.concat("0");
			BigInteger k = new BigInteger("2");
			n = n.divide(k);
//			System.out.println("-----"+n);
		}
		return s;
	}

	public static String binaryNumberNegative(BigInteger n) {
		String  s="";
		//BigInteger k = new BigInteger("2");
		
			BigInteger h = new BigInteger("-1");
		    n=n.multiply(h);
		    int number =0;
		    int number2=0;
		    while (number2!=-1) {
		    	if(BigInteger.TWO.pow(number).intValue()>n.intValue()) 
		    		number2=-1;
		    	number++;
		    }
		    while(number%4!=0) number++;
		    n=n.multiply(h);
		    BigInteger t = BigInteger.TWO.pow(number).add(n);
		    System.out.println("-----"+t);
			while (t.intValue()!=0) {
			if (modPow(t)) s=s.concat("1");
			else s=s.concat("0");
//			if((n.divide(k)).intValue() !=0) s=s.concat("1");
//			else s=s.concat("0");
			BigInteger k = new BigInteger("2");
			t=t.divide(k);
//			System.out.println("-----"+n);
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String s="";
		System.out.println("Nhap vao mot so n: ");
		BigInteger n = new BigInteger(sc.nextLine());
		// System.out.println(n);
		String s = null;
		if ((n.intValue() >= 0))
			s = binaryNumber(n);
		else
			s = binaryNumberNegative(n);
		StringBuffer stringBuffer = new StringBuffer(s);
		System.out.println(stringBuffer.reverse().toString());
	}
}
