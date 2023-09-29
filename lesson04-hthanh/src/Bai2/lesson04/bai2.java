package Bai2.lesson04;

import java.math.BigInteger;
import java.util.Random;

public class bai2 {
	private static int div(BigInteger a) {
		if (a.intValue() % 5 == 0 && a.intValue() % 7 == 0)
			return 0;
		else if (a.intValue() % 5 == 0)
			return 1;
		else if (a.intValue() % 7 == 0)
			return -1;
		return 2;
	}

	private static BigInteger bI(long value) {
		return BigInteger.valueOf(value);
	}

	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(5, 100);
		System.out.println(n);
		BigInteger[] arr = new BigInteger[n];
		BigInteger[] arr2 = new BigInteger[n];
		BigInteger[] arr3 = new BigInteger[n];
		BigInteger[] arr4 = new BigInteger[n];
		for (int i = 0; i < n; i++) {
			arr[i] = bI(rd.nextInt(5, 100));
		}
		int s = 0, t = 0, j = 0, k = n - 1;
		for (int i = 0; i < n; i++) {
			if (div(arr[i]) == -1) {
				arr2[j] = arr[i];
				j = j + 1;
			} else if (div(arr[i]) == 1) {
				arr2[k] = arr[i];
				k = k - 1;
			} else if (div(arr[i]) == 2) {
				arr3[s] = arr[i];
				s = s + 1;
			} else if (div(arr[i]) == 0) {

				arr4[t] = arr[i];
				t = t + 1;
			}
		}
		for (int i = 0; i < Math.round(s / 2); i++) {
			arr2[j] = arr3[i];
			j = j + 1;
		}
		for (int i = 0; i < t; i++) {
			arr2[j] = arr4[i];
			j = j + 1;
		}

		for (int i = s / 2; i < s; i++) {
			arr2[j] = arr3[i];
			j = j + 1;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(" " + arr2[i]);
		}
	}
}
