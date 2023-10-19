package lesson05;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Customer c1 = new Customer("C1", "Nguyen Van A", "0935444249", "LonDon");
		Customer c2 = new Customer("C2", "Tran thi B", "0912341268", "Paris");
		
		TextBook t1 = new TextBook("T1", 200, "Nhi Dong", "New");
		TextBook t2 = new TextBook("T2", 150, "Nhi Dong", "Old");
		TextBook t3 = new TextBook("T3", 40, "Kim Dong", "Old");
		
		ReferBook r1 = new ReferBook("R1", 135, "Kim Dong", 10);
		ReferBook r2 = new ReferBook("R2", 45, "Nhi Dong", 10);
		
		
		ArrayList<Book> books  = new ArrayList<>();
		books.add(t1);books.add(t2);books.add(t3);books.add(r1);books.add(r2);	
		findNhiDongAuthor(books);
		findCostLower50(books);
		findCostFrom100To200(books);
		double totalCost = t1.calculateCost() + r1.calculateCost();
		// giả lập khách hàng mua sách t1 và r1
		System.out.println("Tổng số tiền khách hàng phải trả là :"+ totalCost);
	}
	
	public static void findNhiDongAuthor(ArrayList<Book> books) {
		System.out.println("Books have author is Nhi Dong");
		for(Book book : books) {
			if(book.getAuthor().equalsIgnoreCase("Nhi Dong")) {
				System.out.println(book);
			}
		}
		System.out.println();
	}
	
	public static void findCostLower50(ArrayList<Book> books) {
		System.out.println("Books have cost lower 50");
		for(Book book : books) {
			if(book.getCost() < 50) {
				System.out.println(book);
			}
		}
		System.out.println();
	}
	
	public static void findCostFrom100To200(ArrayList<Book> books) {
		System.out.println("Books have cost from 100 to 200");
		for(Book book : books) {
			if(book.getCost()>=100 && book.getCost()<=200) {
				System.out.println(book);
			}
		}
		System.out.println();
	}
	
	// Giả lập khách mua t1 và r1
	
	
}
