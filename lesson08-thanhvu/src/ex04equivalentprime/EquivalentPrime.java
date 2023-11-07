package ex04equivalentprime;

import java.util.Arrays;

public class EquivalentPrime {

	public static int[] printPrime(int n) {
		int[] result = new int[n];
		int h = 0;
		int k = 0;
		if (n < 2)
			return null;
		for (int i = 2; i < n; i++) {
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0)
					k++;
			}
			if (k == 0) {
				result[h] = i;
				h++;
			}
			k = 0;
		}
		return Arrays.copyOfRange(result, 0, h);
	}

	public static String commonPrimeDivisor(int n) {
		String prime = "";
		int[] results = printPrime(n);
		for (int i = 0; i < results.length; i++) {
			if (n % results[i] == 0) {
				prime += String.valueOf(results[i]);
			}
		}
		return prime;
	}

	public static void main(String[] args) {
		String a = commonPrimeDivisor(375);
		String b = commonPrimeDivisor(15);
		if (a.equals(b)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
