package bai2;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class happyNumber {
	public static BigInteger bigInterger(int n) {
		BigInteger bigInteger = BigInteger.valueOf(n);
		return bigInteger;
	}

	public static BigInteger check(BigInteger n) {
		int s = 0;
		BigInteger t = BigInteger.ZERO;
		BigInteger b = BigInteger.ZERO;
		String str = n.toString();
		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			System.out.print(character + " ");
			int a = (int) character - 48;
//			System.out.print(" " + a);
		
			b = bigInterger(a);
//			System.out.print(" " + b);
//			System.out.println();
			s = (int) (s + Math.pow(character, 2));
			t = t.add(b.multiply(b));
			System.out.print(" " + t);
			System.out.println();
		}
		return t;
	}

	public static boolean checkHappyNumber(BigInteger n) {
		Set<BigInteger> existed = new HashSet<>();		
		//System.out.println("ngu");
		while(n.intValue() != 1 && !existed.contains(n)) {
			existed.add(n);
			int s = 0;
			BigInteger tam = BigInteger.ZERO;
			while(n.intValue() > 0) {
				BigInteger digit = n.mod(BigInteger.TEN);
                tam = tam.add(digit.multiply(digit));
				n= n.divide(bigInterger(10));
			}
			
			n = tam;
		}
		return n.equals(BigInteger.ONE);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so toi da de ktr: ");
		BigInteger n = new BigInteger(sc.nextLine());
	//	System.out.println(n);
		for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
			if (checkHappyNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
