package homework;

import java.util.Random;

//Bài 4: Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!
//Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20 → [10, 20]

public class Ex04 {
	public static void main(String[] args) {
		long a, b, c, d;
		Random rd = new Random();
				a = rd.nextLong(9,21);
				b = rd.nextLong(9,21);
				c = rd.nextLong(9,21);
				d = rd.nextLong(9,21);
			System.out.println("Số a:"+a);
			System.out.println("Số b:"+b);
			System.out.println("Số c:"+c);
			System.out.println("Số d:"+d);
			
				long a1 = a, b1 =b, c1 =c, d1 = d;
				for (int i=1;i<a; i++) {
					a1=a1*i;
				}
				for (int i=1;i<b; i++) {
					b1=b1*i;
				}
				for (int i=1;i<c; i++) {
					c1=c1*i;
				}
				for (int i=1;i<d; i++) {
					d1=d1*i;
				}
				long s = a1+ b1+c1+d1;
		System.out.println("Tổng giai thừa của các số nguyên dương" + " "+ +a + " " + +b +" "+ +c +" "+ +d +" " + "là:" +s );		
	}
	
}
