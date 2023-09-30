package ex02;

import java.util.Random;

public class GomSo {
	private int n;
	private int[] a;

	public GomSo(int n) {
		this.n = n;
		this.a = new int[n];
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public void createArrayNumber() {
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(5, 101);
		}
	}

	public void printArrayNum() {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public void excute() {
		int[] divisibleBy7 = new int[a.length];
		int[] divisibleBy5 = new int[a.length];
		int[] remainingNumbers = new int[a.length];
		int count7 = 0, count5 = 0, countRemaining = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 7 == 0 && a[i] % 5 != 0) {
				divisibleBy7[count7] = a[i];
				count7++;
			} else if (a[i] % 7 != 0 && a[i] % 5 == 0) {
				divisibleBy5[count5] = a[i];
				count5++;
			} else {
				remainingNumbers[countRemaining] = a[i];
				countRemaining++;
			}
		}

		for (int i = 0; i < count7; i++) {
			System.out.print(divisibleBy7[i] + " ");
		}

		for (int i = 0; i < countRemaining; i++) {
			System.out.print(remainingNumbers[i] + " ");
		}

		for (int i = 0; i < count5; i++) {
			System.out.print(divisibleBy5[i] + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		GomSo gs = new GomSo(10);
		gs.createArrayNumber();
		gs.printArrayNum();
		gs.excute();
	}
}
