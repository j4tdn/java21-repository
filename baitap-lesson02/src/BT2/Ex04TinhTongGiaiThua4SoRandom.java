package BT2;

import java.util.Random;


public class Ex04TinhTongGiaiThua4SoRandom {
	
	public static void tongGiaiThuaRdSo() {
		Random rd = new Random();
		int a = rd.nextInt(10, 21);
		int b = rd.nextInt(10, 21);
		int c = rd.nextInt(10, 21);
		int d = rd.nextInt(10, 21);
		
		long S1 = 1;
		for (int i = 1; i <= a; i++) {
			S1 = S1*i;
		}
		long S2 = 1;
		for (int i = 1; i <= b; i++) {
			S2 = S2*i;
		}
		long S3 = 1;
		for (int i = 1; i <= c; i++) {
			S3 = S3*i;
		}
		long S4 = 1;
		for (int i = 1; i <= d; i++) {
			S4 = S4*i;
		}
			
		System.out.println("4 so ngau nhien la " + a + ", " + b + ", " + c + ", " + d);
		System.out.println("Tong cua giai thua 4 so ngau nhien tren la " + (S1 + S2 + S3 + S4));
	}
	
	public static void main(String[] args) {
		tongGiaiThuaRdSo();
	}
}