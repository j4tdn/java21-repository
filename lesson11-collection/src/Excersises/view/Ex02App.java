package Excersises.view;

import static Excersises.util.CollectionUtils.*;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Excersises.bean.CD;
import  static Excersises.model.DataModel.*;
public class Ex02App {

	public static void main(String[] args) {
		List<CD> cds = mockCD();
		
		CD cdToBeAdd = new CD(6, "R&D", "James Brown", 90, bd("100"));
		
		//List<CD> a = cdNeedToAdd(cds, cdToBeAdd);
		generate("1. list of CD", cdNeedToAdd(cds, cdToBeAdd));
		
		// quantity of CD in list
		int quantity = cds.size();
		System.out.println("2. quantity of CD in list = " + quantity + "\n");
		
		// total cost of CDs
		System.out.println("3. Total cost of CDs : " + sum(cds) + "\n");
		
		// descending of price
		Collections.sort(cds, Comparator.comparing(CD::getPrice).reversed());
		generate("4. Descending of price", cds);
		
		//ascending of idCD
		Collections.sort(cds, Comparator.comparing(CD::getIdCD));
		generate("5. Ascending of idCD", cds);
	}
	
	public static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
	
	public static List<CD> cdNeedToAdd(List<CD> cds, CD cdToBeAdd) {
		if(cds.contains(cdToBeAdd)) {
			System.out.println("List already exists");
			return cds;
		}
		
		cds.add(cdToBeAdd);
		return cds;
	}
	
	public static BigDecimal sum(List<CD> cds){
		BigDecimal sum = BigDecimal.ZERO ;
		for(CD cd:cds) {
			sum = sum.add(cd.getPrice());
		}
		
		return sum;
	}
}
