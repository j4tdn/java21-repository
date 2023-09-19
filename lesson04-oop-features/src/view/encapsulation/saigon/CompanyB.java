package view.encapsulation.saigon;

import java.math.BigDecimal;

import view.encapsulation.danang.CompanyA;

public class CompanyB {
	
	public static void main(String[] args) {
		CompanyA cA = new CompanyA();
		
		// cA.monthlyIncome --> error
		System.out.println("cA taxId --> " + cA.taxId); // public
		System.out.println("cA projects --> " + cA.projects); // ...
	}
}
