package view.encapsulation.danang;

import java.math.BigDecimal;

public class StaffA1 {
public String name;
private BigDecimal salary;
public static void main(String[] args) {
	CompanyA cA = new CompanyA();
	System.out.println("cA taxID=>"+cA.taxId);
	System.out.println("cA projects =>"+ cA.projects);
}
}