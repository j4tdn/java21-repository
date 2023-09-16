package leson2;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so n");
		int i = 0;
		int n=0;
		// n = Integer.parseInt(sc.nextLine());
		//System.out.println(n);
		//System.out.println("Nhap vao so n");
		while (i < 5) {
			
			//System.out.println("Nhap vao so n");
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
		boolean m =n%2==0;
		if(m) System.out.println("laf booij cuar 2");
		else System.out.println("k la boi cua 2");
	}
}
