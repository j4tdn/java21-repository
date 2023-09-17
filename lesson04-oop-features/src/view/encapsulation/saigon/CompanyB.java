package view.encapsulation.saigon;

import view.encapsulation.danang.CompanyA;

public class CompanyB {
	public static void main(String[] args) {
		CompanyA cA = new CompanyA();
		System.out.println(cA.taxId); //public
//		System.out.println(cA.projects); --> error
//		System.out.println(cA.monthIncome); --> error
	}

}
