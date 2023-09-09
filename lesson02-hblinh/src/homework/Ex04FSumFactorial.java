package homework;

import java.util.Random;

public class Ex04FSumFactorial {
	public static void main(String[] args) {
		Random rd = new Random();
		long a = rd.nextInt(10,21);
		long b = rd.nextInt(10,21);
		long c = rd.nextInt(10,21);
		long d = rd.nextInt(10,21);
		long a1 = a; long a2 = b; long a3 = c; long a4 = d;
		long sumFact;
    	for(long i = a-1;i>0;i--) {
    		a1*=i;	
	}
    	for(long i = b-1;i>0;i--) {
    		a2*=i;	
	}
    	for(long i = c-1;i>0;i--) {
    		a3*=i;	
	}
    	for(long i = d-1;i>0;i--) {
    		a4*=i;	
	}
    	sumFact = a1 + a2 + a3 + a4;
    
    System.out.println("Tổng giai thừa của các số nguyên dương S = "+
    		a+"!"+"+"+b+"!"+c+"!"+d+"!"+"là:"+ sumFact);	
 
    
	}
}