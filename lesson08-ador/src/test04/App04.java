package test04;

import java.util.Scanner;

import ultils.StringValidExceptionUltils;

public class App04 {
	
	public static void main(String[] args) {
		int [] token = new int[2];
		inputYourNumbers(token);
		isPrimeTogether(token);
	}
	
	// liệt kê các ước nguyên tố
	private static void isPrimeTogether(int[] token) {
		String primeOfNumN = "";
		String primeOfNumM = "";
		String togetherNum = "|";
		boolean isPrime = false;
		
		primeOfNumN = getAllDivNum(token[0]);
		primeOfNumM = getAllDivNum(token[1]);
		
		String[] tokenNumM = primeOfNumM.replaceAll(">", " ").trim().split("\\s+");
		System.out.println("Các ước của N là: " + primeOfNumN.replaceAll(">", "|"));
		System.out.println("Các ước của M là: " + primeOfNumM.replaceAll(">", "|"));
		for (int i = 0; i < tokenNumM.length; i++) {
			if (primeOfNumN.contains(">" + tokenNumM[i] + ">")) {
				isPrime = true;
				togetherNum += tokenNumM[i] + "|";
			}
		}
		System.out.println("\n>>>>> Kết quả <<<<<");
		System.out.println("Hai số nguyên này là số nguên tố tương đương ? " + (isPrime ? "YES":"NO"));
		if(isPrime) {
			System.out.println("Ước chung của N,M là: " + togetherNum.trim());
		}
	}
	
	private static String getAllDivNum(int num) {
		String allPrimeNum = ">";
		int len = num/2;
		for(int i = 2; i <= len; i++) {
			if (num % i == 0) {
				allPrimeNum += i + ">";
			}
		}
		return allPrimeNum;
	}
	
	private static void inputYourNumbers(int[] token) {
		Scanner ip = new Scanner(System.in);
		do {
			try {
				try {
					System.out.print("Nhập số nguên dương với N (lớn hơn 2 và bé hơn 300000000000000000): ");
					token[0] = Integer.parseInt(ip.nextLine());
					System.out.print("Nhập số nguên dương với M (lớn hơn 2 và bé hơn 300000000000000000): ");
					token[1] = Integer.parseInt(ip.nextLine());
					isValidNumber(token);
					break;
				} catch (NumberFormatException e) {
					throw new StringValidExceptionUltils("!!! Hãy nhập số nguên dương N,M (lớn hơn 2 và bé hơn 300000000000000000) !!!");
				}
			} catch (StringValidExceptionUltils e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		ip.close();
	}
	private static void isValidNumber(int[] token) throws StringValidExceptionUltils {
		if (token[0] < 2 || token[1] < 2) {
			throw new StringValidExceptionUltils("!!! Hãy nhập số nguyên dương N,M ≥ 2 !!!");
		}
		if (token[0] > 300000000000000000d || token[1] > 300000000000000000d) {
			throw new StringValidExceptionUltils("!!! Hãy nhập số nguyên dương N,M ≤ 300000000000000000 !!!");
		}
		if (token[0] < token[1]) {
			throw new StringValidExceptionUltils("!!! Hãy nhập số nguyên dương M ≤ N !!!");
		}
	}
}
