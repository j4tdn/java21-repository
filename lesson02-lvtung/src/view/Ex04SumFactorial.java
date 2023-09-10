package view;

import java.math.BigDecimal;
import java.util.Random;

public class Ex04SumFactorial {
	
	public static void main(String[] args) {
		// khởi tạo đối tượng random
		Random rd = new Random();
		
		// Tạo random cho a, b, c, d trong khoảng [10, 20)
		int a = rd.nextInt(10, 20);
		int b = rd.nextInt(10, 20);
		int c = rd.nextInt(10, 20);
		int d = rd.nextInt(10, 20);
		
		// tính giai thừa cho các giá trị a, b, c, d vừa random
		BigDecimal factorialA = calculateFactorial(a);
		BigDecimal factorialB = calculateFactorial(b);
		BigDecimal factorialC = calculateFactorial(c);
		BigDecimal factorialD = calculateFactorial(d);
		
		// tổng của các giai thừa
		BigDecimal sumFactorial = factorialA.add(factorialB).add(factorialC).add(factorialD);
		
		// in thông tin
		System.out.println("Số ngẫu nhiên của a: " + a + " --> giai thừa của " + a + ": " + factorialA);
		System.out.println("Số ngẫu nhiên của b: " + b + " --> giai thừa của " + b + ": " + factorialB);
		System.out.println("Số ngẫu nhiên của c: " + c + " --> giai thừa của " + c + ": " + factorialC);
		System.out.println("Số ngẫu nhiên của d: " + d + " --> giai thừa của " + d + ": " + factorialD);
		System.out.println("\nTổng của các giai thừa: " + sumFactorial);
	}
	
	// hàm tính giai thừa
	private static BigDecimal calculateFactorial(int n) {
		BigDecimal factorial = BigDecimal.ONE;
		for (int i = 2; i <= n; i++) {
			factorial = factorial.multiply(BigDecimal.valueOf(i));
		}
		return factorial;
	}
}
