package common;
import java.util.Random;

public class Ex02Random {
	
	public static void main(String[] args) {
		Random rd = new Random();	
		
		double min = 2.20;
		double max = 56.80;
		
		double randomNumber = rd.nextDouble(min, max);
		System.out.println("Số ngẫu nhiên: " + randomNumber);
		
		double roundNumber = Math.round(randomNumber * 100.0) / 100.0;
		
//		double roundNumber = (int) (randomNumber * 100.0) / 100.0;
		
		System.out.println("Làm tròn 2 số cuối của số ngẫu nhiên: " + roundNumber);
		
//		round up 		  --> Math.ceil
//		round down 		  --> Math.floor
//		commercial round  --> Math.floor
		
//		DecimalFormat --> format to String for presentation
//		BigDecimal 
//		--> store big float number
//		--> support scaling
//		--> support rouding mode
	}
}
