package view.encapsulation.saigon;

import view.encapsulation.danang.CompanyA;

public class CompanyB {
	public static void main(String[] args) {
		CompanyA cA = new CompanyA();
		
		// cA.mothlyIncome --> acess error
		System.out.println("cA taxId: " + cA.taxId);
		// System.out.println("cA project: " + cA.projects); --> access error
	}
}
