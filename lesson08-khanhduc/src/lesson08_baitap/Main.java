package lesson08_baitap;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		// in mỗi kí tự trên một dòng
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));

		}
		System.out.println();
		// in ra mỗi từ trên 1 dòng
		String[] tu = s.split(" ");
		for (String t : tu) {
			System.out.println(t);

		}
		System.out.println();
		// in ra chuỗi đảo ngược theo kí tự
		String chuoiDaoNguoc = new StringBuffer(s).reverse().toString();
		System.out.println(chuoiDaoNguoc);

		// in ra chuỗi đảo ngược theo từ
		for (int i = tu.length - 1; i >= 0; i--) {
			System.out.println(tu[i] + " ");
		}
	}
}
