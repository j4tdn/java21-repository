package leson2;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so n");
		int i = 0;
		int n=0;
		while (i < 5) {
			try {
				
					n = Integer.parseInt(sc.nextLine());
					if (n <= 0)
						System.out.println("Nhap lai");
					else
						break;
				
			} catch (NumberFormatException e) {
				System.out.println("khong hop le nhap lai");
			}
			i++;
		}
		if(i==5) {
			System.out.println("nhap qua 5 lan");
			System.exit(1);
		}
		double k=Math.sqrt(n);
		if(Math.pow((int) k, 2)==n) System.out.println(n+"---> True");
		else System.out.println(n+"---> False");
		//System.out.println(k);
	}
}
