package io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02BasicRandomDemo {
	public static void main(String[] args) {
Random rd = new Random();
	//Tạo 1 số nguyên ngẫu nhiên
	int rn1 = rd.nextInt(); // Integer.Min -> Integer.Max
	
	//Tạo ra 1 số nguyên ngẫu nhiên từ [0,n) --> inclusive 0 , inclusive n
	int rn2 = rd.nextInt(20);
	
	//Tạo ra 1 số nguyên ngẫu nhiên từ [a, b)
	int rn3 = rd.nextInt(4,20);
	
	int rn4 = 4 + rd.nextInt(16); // a + nextInt(b-a)
	
	System.out.println("rn1 -->" +rn1);
	
	System.out.println("rn2 -->" +rn2);
	
	System.out.println("rn3 -->" +rn3);
	
	System.out.println("rn4 -->" +rn4);
	System.out.println("---------------");
	
//VD: random 1 số thực từ 2.20 đến 56.80
// : Kết quả là số thập phân làm tròn 2 chữ số
	
	//Tạo 1 số thực ngẫu nhiên trong phạm vi của float
	float rf1 =rd.nextFloat();
	
	//Tạo 1 số thực ngẫu nhiên từ [0.0, n)
	float rf2 = rd.nextFloat(12.8f);
	
	//Tạo 1 số thực ngẫu nhiên từ [a, b)
	float rf3 = rd.nextFloat(2.2f, 56.8f);
	System.out.println("rf1 -->" +rf1);
	
	System.out.println("rf2 -->" +rf2);
	
	System.out.println("rf3 -->" +rf3);
	
	// Làm tròn
	//Round up  --Math.ceil
	//Round down --> Math.floor
	//commercial round --> Math.round
	
	//DecimalFormat --> format to String for presentation
	//BigDecimal
	// --> store big float number
	//--> support rounding mode
	//--> support scaling
	
	// Chuyển đổi từ float/double sang BigDecimal
	//design pattern: builder pattern
	BigDecimal bdRf3 = BigDecimal.valueOf(rf3) //Chuyển từ float sang kiểu BigDecimal
			.setScale(4, RoundingMode.HALF_UP)// Làm tròn 4 chữ số, làm tròn lên
			.multiply(BigDecimal.valueOf(rf1))
			.setScale(2, RoundingMode.HALF_UP); //Nhân với rf1
	//double rf3Rounded = Math.ceil(rf3*100/100d);
	//Hạn chế
	// Làm thủ công * / cho 10^n trong đó n là chữ số thập phân
	System.out.println("rf3Rounded -->" +bdRf3);


	}
}
