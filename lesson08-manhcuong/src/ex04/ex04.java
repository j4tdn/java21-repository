package ex04;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex04 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Import N natural number: ");
        int N = scanner.nextInt();

        System.out.print("Import M natural number: ");
        int M = scanner.nextInt();

        boolean areEquivalent = checkEquivalentPrimes(N, M);

        if (checkEquivalentPrimes(N, M)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean checkEquivalentPrimes(int N, int M) {
        Set<Integer> primeFactorsN = getPrimeFactors(N);
        Set<Integer> primeFactorsM = getPrimeFactors(M);

        return primeFactorsN.equals(primeFactorsM);
    }

    public static Set<Integer> getPrimeFactors(int number) {
        Set<Integer> primeFactors = new HashSet<>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }

        return primeFactors;
    }

}
