package controlling;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
//		random 1 so nguyen ngau nhien tu 5 den 20
//		ktra so nguyen do co phai la so chan kh
		 Random rd = new Random();
		 int rdNumer = rd.nextInt(5, 20);
		 
		 if(rdNumer % 2 == 0) {
			 System.out.println(rdNumer + " la so chan");
		 } else {
			 System.out.println(rdNumer + " la so le");
		 }
		 
		 // validate ktra do dai mk nguoi dung nhap vao
		 // neu do dai >= 8 --> OK
		 // neu do dai < 8 --> faile
		 
		 // Toan tu 3 ngoi
		 // exp ? result1 : result1 
		 
		 // tim max cua 2 so nguyen a, b
		 
		 int a = 9, b = 2;
		 int max = a > b ? a : b;
		 System.out.println("Max: " + max);
	}
}
