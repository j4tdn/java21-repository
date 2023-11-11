package view.string.exercises;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Ex04EquivalentPrime {
	static ArrayList<Integer> primeDivisorOfN = new ArrayList<>();
	static ArrayList<Integer> primeDivisorOfM = new ArrayList<>();
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter n: ");
		int n = ip.nextInt();
		System.out.println("Enter m: ");
		int m = ip.nextInt();
		primeDivisorOfN = addPrimeDivisor(primeDivisorOfN, n);
		primeDivisorOfM = addPrimeDivisor(primeDivisorOfM, m);
		boolean check = Objects.equals(primeDivisorOfN, primeDivisorOfM);
		System.out.println("Are n and m equivalent prime numbers? -> " + check);
	}
	public static ArrayList<Integer> addPrimeDivisor(ArrayList<Integer> primeDivisor, int num) {
		for(int i=2; i<=num; i++) {
			if(num % i == 0 && prime(i)) {
				primeDivisor.add(i);
			}
		}
		return primeDivisor;
	}
	public static boolean prime(int n) {
		for(int i=2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
