package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03Check2Strings {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập chuỗi s1: ");
		String s1 = ip.nextLine();
		System.out.println("Nhập chuỗi s2: ");
		String s2 = ip.nextLine();
		System.out.println(check(s1, s2));
	}
	
	private static boolean check(String s1, String s2) {
		String ss1 = s1.replaceAll("\\s", "").toLowerCase();
		String ss2 = s2.replaceAll("\\s", "").toLowerCase();
		if (ss1.length() != ss2.length()) {
			return false;
		}
		
		char[] c1 = ss1.toCharArray();
		char[] c2 = ss2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
		
	}
}
