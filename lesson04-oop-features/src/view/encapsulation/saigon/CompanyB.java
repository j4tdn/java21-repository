package view.encapsulation.saigon;

import view.encapsulation.danang.CompanyA;

public class CompanyB {
	public static void main(String[] args) {
		CompanyA cA = new CompanyA();
		// cA.monthlyIncome ---erro
		System.out.println("cA taxId-->"+cA.taxId);
//		System.out.println("cA projects-->"+cA.projects);	
	}
	
}
