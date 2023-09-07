package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		Random rd = new Random();
		int rn1 = rd.nextInt(5,20);
		if (rn1%2==0) {
			System.out.println("random number là số nguyên"+rn1);
		}
		System.out.println("Line17");
		
		String pass = "a1234";
		if (pass.length()>8) {
			System.out.println("lớn hơn 8");
		}
		else {
			System.out.println("nhỏ hơn 8");
		};
	
		
		
		float avgPoint = rd.nextFloat(10.1f);
		if ( avgPoint > 10) {
			avgPoint = 10;
		}
		if (avgPoint<5) {
			System.out.println("yếu");
		} else if (avgPoint<6.5) {
			System.out.println("trung bình");
			
		} else if (avgPoint< 8) {
			System.out.println("khá");
		} else {
			System.out.println("giỏi");
		}
		
		
		
		int a = 7;
		int b = 6;
		int max = (a > b)? a : b;
		System.out.println("max--->"+max);
		System.out.println("min--->"+((a < b)? a : b));
		
		
		
		String rank = avgPoint < 5 ? "Yếu"
				: avgPoint < 6.5 ? "trung bình"
						: avgPoint < 8 ? "khá"
								:"Giỏi";
		System.out.println("rank--->"+rank);
						
	}
	
}
