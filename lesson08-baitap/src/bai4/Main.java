package bai4;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static Set<Long> primeFactors(long number) {
		Set<Long> factors = new HashSet<>();

		while (number % 2 == 0) {
			factors.add(2L);
			number /= 2;
		}

		for (long i = 3; i * i <= number; i += 2) {
			while (number % i == 0) {
				factors.add(i);
				number /= i;
			}
		}

		if (number > 2) {
			factors.add(number);
		}

		return factors;
	}

	public static void main(String[] args) {
		long N = 3;
		long M = 9;

		Set<Long> factorsN = primeFactors(N);
		Set<Long> factorsM = primeFactors(M);

		if (factorsN.equals(factorsM)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}