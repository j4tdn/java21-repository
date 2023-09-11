package homework;

import java.util.Random;

public class Ex10RandomNum {
	
	public static void main(String[] args) {
		int r2 = 0;
		int r3 = 0;
		int r4 = 0;
		int r5 = 0;
		Random rd = new Random();

		int r1 = rd.nextInt(20,31);
		do {r2 = rd.nextInt(20,31);}
			while(r1==r2);
		do {r3 = rd.nextInt(20,31);}
		while(r1==r3||r2==r3);
		do {r4 = rd.nextInt(20,31);}
		while(r1==r4||r2==r4||r3==r4);
		do {r5 = rd.nextInt(20,31);}
		while(r1==r5||r2==r5||r3==r5||r4==r5);
	
		System.out.println("5 số nguyên ngẫu nhiên là: "+r1+", "+r2+", "+r3+", "+r4+", "+r5);
		
	}
}