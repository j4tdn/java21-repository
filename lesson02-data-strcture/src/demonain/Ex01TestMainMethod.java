package demonain;

import java.util.Scanner;
public class Ex01TestMainMethod {
	public static void printStarTriangle() {
	System.out.println("*");
	System.out.println("* *");
	System.out.println("* * *");	
	System.out.println("* * * *");	
	System.out.println("* * * * *");	
	}
	public static void main(String[] args) {
		long a=0,b=1;
		System.out.println("Nhap vao so luong day fibonasil");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(a +" "+b +" ");
		for(int i=2;i<n;i++) {
			System.out.print(a+b +" ");
			if (i%10==0) System.out.println();
			long  c=b;
			b=a+b;
			a=c;
		}
		System.out.println();
		printStarTriangle();
	}
}
