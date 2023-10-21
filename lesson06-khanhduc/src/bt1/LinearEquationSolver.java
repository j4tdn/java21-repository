package bt1;

import javax.sql.rowset.serial.SQLOutputImpl;

public class LinearEquationSolver {
	public static void main(String[] args) {
		
     while(true) {
		System.out.println("Giải phương trình bậc nhất ax + b = 0");
		Validation vl = new Validation();
		System.out.println("Enter number a:");
		double a = vl.checkInputNonZeroDouble();

		System.out.println("Enter number b:");
		double b = vl.checkInputDouble();

		double x = -b / a;
		System.out.println("Result: x = " + x);
      
	}
}
}


