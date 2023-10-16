package test01;

import java.util.Scanner;

public class Fract {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		double soThapPhan = 0.0;
		int count = 0;

		while (count < 3) {
			System.out.print("Nhập một số thập phân: ");
			soThapPhan = ip.nextDouble();
			if (soThapPhan != 0.0) {
				break;
			}
			count++;
			System.out.println("Số không hợp lệ. Vui lòng nhập lại.");
		}

		if (count == 3) {
			System.out.println("Bạn đã nhập sai 3 lần!");
			return;
		}

		String result = getMinFraction(soThapPhan);
		System.out.println("Phân số tối giản của " + soThapPhan + " là: " + result);
	}

	public static String getMinFraction(double soThapPhan) {
		int mauSo = 1;
		while (soThapPhan != (int) soThapPhan) {
			soThapPhan *= 10;
			mauSo *= 10;
		}
		int gcd = gcd((int) soThapPhan, mauSo);
		int tuSo = (int) soThapPhan / gcd;
		mauSo /= gcd;

		return tuSo + "/" + mauSo;
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}
