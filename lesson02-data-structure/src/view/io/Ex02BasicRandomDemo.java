package view.io;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02BasicRandomDemo {
	
	public static void main(String[] args) {
		
	
	Random rd = new Random();
	
	// tạo 1 số nguyên ngẫu nhiên
	int rd1 = rd.nextInt();
	
	// tạo 1 số nguyên ngẫu nhiên từ [0;n)
	int rd2 = rd.nextInt(20);
	
	// tạo 1 số nguyên ngẫu nhiên từ [a,b)
	int rd3 = rd.nextInt(4, 20);
	
	System.out.println("số random 1: " + rd1);
	
	System.out.println("số random 2: " + rd2);

	System.out.println("số random 3: " + rd3);
	
	// tạo 1 số thực ngẫu nhiên từ 1.59 đến 2.59 
	float rd4 = rd.nextFloat(1.59f, 2.58f);
	System.out.println("số thực random 4: " + rd4);
	
	// tạo 1 số thực trong phạm vi float
	float rd5 = rd.nextFloat();
	System.out.println("số thực random 5: " + rd5);
	
	// tạo 1 số thực trong [0;29.5)
	
	float rd6 = rd.nextFloat(29.5f);
	System.out.println("số thực random 6: " + rd6);
	
	// round up --> math.ceil  ,  round down --> math.floor  , commercial round --> math.round
	
	/* BigDecimal
	 * --> store big float number
	 * --> support rounding mode
	 * --> support scaling
	 */
	BigDecimal BigDeciamlrd4 = BigDecimal.valueOf(rd4)
			.multiply(BigDecimal.valueOf(rd1))
			.setScale(4, RoundingMode.HALF_UP);
	System.out.println("BigDecimal làm tròn 4 số: " + BigDeciamlrd4);
	// chuyển đổi int sang BigDecimal

}
}